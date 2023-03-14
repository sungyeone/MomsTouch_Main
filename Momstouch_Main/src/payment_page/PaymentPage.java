package payment_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

import main_page.MomstouchMainFrame;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;
import payment_page.PayWithCardPage.PayWithCardFrame;
import payment_page.shopping_list.ShoppingListLabel;
import payment_page.shopping_list.ShoppingListPane;
import tool.FontTool;

public class PaymentPage extends JFrame {
	
	boolean creditCardChecked;
	
	PaymentPage paymentPage = this;
	JPanel payment_panel = new JPanel();
	PaymentCompletionPage paymentCompletionPage;
	
	Sec_WrapBtn wrap = new Sec_WrapBtn();
	Sec_StoreBtn store = new Sec_StoreBtn();
	Sec_CreditCardBtn creditCard = new Sec_CreditCardBtn();
	Sec_CancelBtn cancel = new Sec_CancelBtn();
	Sec_PayBtn payment = new Sec_PayBtn();
	
	Sec_JTextField1 JTextField1;
	Sec_JTextField2 JTextField2;
	Sec_JTextField3 JTextField3;
	
	
	MomstouchMainFrame main;
	OrderPanel op;
	
	List<SelectedMenuInfo> selectedMenus; 
	
	JLabel shoppingListSpace = new JLabel();
	JScrollPane shoppingListPane = new ShoppingListPane(shoppingListSpace);
	
	ShoppingListLabel[] shoppingListLabel = new ShoppingListLabel[10];
	
	
	public PaymentPage(MomstouchMainFrame main, OrderPanel op) {
		
		
		this.main = main;
		this.op = op;
		
		selectedMenus = op.getSelectedMenus();
		payment_panel.add(shoppingListPane);
		
		JTextField1 = new Sec_JTextField1(selectedMenus);
		JTextField2 = new Sec_JTextField2(selectedMenus);
		JTextField3 = new Sec_JTextField3(selectedMenus);

		setTitle("결제창");
		paymentCompletionPage = new PaymentCompletionPage(this);
		
		JLabel itemName = new JLabel("제품명");
		itemName.setHorizontalAlignment(SwingConstants.CENTER);
		itemName.setOpaque(true);
		itemName.setBackground(new Color(196, 198, 197));
		itemName.setFont(FontTool.boldNanumSquare(18f));
		//itemName.setFont(new Font("굴림", Font.BOLD, 20));
		itemName.setBounds(23, 20, 136, 40);
		

		JLabel qtyAmount = new JLabel("   수량     금액");
		qtyAmount.setHorizontalAlignment(SwingConstants.CENTER);
		qtyAmount.setOpaque(true);
		qtyAmount.setBackground(new Color(196, 198, 197));
		qtyAmount.setFont(FontTool.boldNanumSquare(18f));
		//qtyAmount.setFont(new Font("굴림", Font.BOLD, 20));
		qtyAmount.setBounds(157, 20, 151, 40);

		JLabel pickWrap = new JLabel("포장을 선택하세요.");
		pickWrap.setHorizontalAlignment(SwingConstants.LEFT);
		pickWrap.setText("<HTML>포장을<br>선택하세요.</HTML>");
		pickWrap.setOpaque(true);
		//pickWrap.setFont(FontTool.nanumSquare(20f));
		pickWrap.setFont(FontTool.boldNanumSquare(20f));
		pickWrap.setBackground(new Color(196, 198, 197));
		pickWrap.setBounds(415, 20, 145, 84);

		JLabel num1 = new JLabel(" 1");
		num1.setHorizontalAlignment(SwingConstants.CENTER);
		num1.setOpaque(true);
		num1.setBackground(new Color(196, 198, 197));
		num1.setFont(FontTool.boldNanumSquare(40f));
		num1.setBounds(347, 20, 68, 84);

		JLabel basket = new JLabel("장바구니에 넣은 메뉴");
		basket.setFont(FontTool.boldNanumSquare(15f));
		basket.setVerticalAlignment(SwingConstants.TOP);
		basket.setBorder(new TitledBorder(new LineBorder(new Color(226, 226, 226), 2)));
		basket.setHorizontalAlignment(SwingConstants.CENTER);
		basket.setBounds(23, 60, 285, 390);
		
		
		
		

		JLabel orderAmount = new JLabel("주문금액");
		orderAmount.setForeground(new Color(64, 0, 64));
		orderAmount.setOpaque(true);
		orderAmount.setHorizontalAlignment(SwingConstants.CENTER);
		orderAmount.setFont(FontTool.boldNanumSquare(16f));
		orderAmount.setBackground(new Color(196, 198, 197));
		orderAmount.setBounds(38, 485, 163, 68);

		JLabel pickPayment = new JLabel("<HTML>결제를<br>선택하세요.</HTML>");
		pickPayment.setOpaque(true);
		pickPayment.setHorizontalAlignment(SwingConstants.LEFT);
		//pickPayment.setFont(new Font("굴림", Font.BOLD, 20));
		pickPayment.setFont(FontTool.boldNanumSquare(20f));
		pickPayment.setBackground(new Color(196, 198, 197));
		pickPayment.setBounds(415, 280, 145, 84);

		JLabel num2 = new JLabel("2");
		num2.setOpaque(true);
		num2.setHorizontalAlignment(SwingConstants.CENTER);
		//num2.setFont(new Font("굴림", Font.BOLD, 40));
		num2.setFont(FontTool.boldNanumSquare(40f));
		num2.setBackground(new Color(196, 198, 197));
		num2.setBounds(347, 280, 68, 84);

		JLabel subtract = new JLabel("-");
		subtract.setOpaque(true);
		subtract.setHorizontalAlignment(SwingConstants.RIGHT);
		subtract.setForeground(new Color(64, 0, 64));
		// subtract.setFont(new Font("굴림", Font.BOLD, 20));
		subtract.setFont(FontTool.boldNanumSquare(20f));
		subtract.setBackground(new Color(196, 198, 197));
		subtract.setBounds(38, 553, 173, 84);

		JLabel paidSum = new JLabel("결제한 금액");
		paidSum.setOpaque(true);
		paidSum.setHorizontalAlignment(SwingConstants.CENTER);
		paidSum.setForeground(new Color(64, 0, 64));
		// paidSum.setFont(new Font("굴림", Font.BOLD, 16));
		paidSum.setFont(FontTool.boldNanumSquare(16f));
		paidSum.setBackground(new Color(196, 198, 197));
		paidSum.setBounds(198, 485, 163, 68);

		JLabel Label11 = new JLabel("");
		Label11.setOpaque(true);
		Label11.setHorizontalAlignment(SwingConstants.CENTER);
		Label11.setForeground(new Color(64, 0, 64));
		// Label11.setFont(new Font("굴림", Font.BOLD, 20));
		Label11.setFont(FontTool.boldNanumSquare(20f));
		Label11.setBackground(new Color(196, 198, 197));
		Label11.setBounds(199, 553, 167, 84);

		JLabel sum = new JLabel("결제금액");
		sum.setOpaque(true);
		sum.setHorizontalAlignment(SwingConstants.CENTER);
		sum.setForeground(new Color(64, 0, 64));
		// sum.setFont(new Font("굴림", Font.BOLD, 16));
		sum.setFont(FontTool.boldNanumSquare(16f));
		sum.setBackground(new Color(196, 198, 197));
		sum.setBounds(361, 485, 188, 68);

		JLabel equal = new JLabel(" =");
		equal.setOpaque(true);
		equal.setHorizontalAlignment(SwingConstants.LEFT);
		equal.setForeground(new Color(64, 0, 64));
		// equal.setFont(new Font("굴림", Font.BOLD, 20));
		equal.setFont(FontTool.boldNanumSquare(20f));
		equal.setBackground(new Color(196, 198, 197));
		equal.setBounds(361, 553, 188, 84);

		
		payment_panel.add(itemName);
		payment_panel.add(qtyAmount);
		payment_panel.add(pickWrap);
		payment_panel.add(num1);
		payment_panel.add(basket);
		payment_panel.add(orderAmount);
		payment_panel.add(pickPayment);
		payment_panel.add(num2);
		payment_panel.add(subtract);
		payment_panel.add(paidSum);
		payment_panel.add(Label11);
		payment_panel.add(sum);
		payment_panel.add(equal);
		
		
		payment_panel.add(wrap);
		payment_panel.add(store);
		payment_panel.add(creditCard);
		payment_panel.add(cancel);
		payment_panel.add(payment);
		
		
		subtract.add(JTextField1);
		Label11.add(JTextField2);
		equal.add(JTextField3);
		
		add(paymentCompletionPage);
		add(payment_panel);

		payment_panel.setLayout(null);
		setSize(600, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		payment_panel.setBackground(Color.white);	
		
		
		wrap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.packing = true;
				wrap.setBorder(new LineBorder(new Color(230, 149, 3),3));
				store.setBorder(new LineBorder(null));
			}
		});
		
		
		store.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.packing = false;
				store.setBorder(new LineBorder(new Color(230, 149, 3),3));
				wrap.setBorder(new LineBorder(null));
			}
		});
		
		creditCard.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				creditCardChecked = true;
				creditCard.setBorder(new LineBorder(new Color(230, 149, 3),3));
			}
		});
		
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				main.moveToMainPage();
				op.unlock();
				op.reset();
			}
		});
		
		payment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(creditCardChecked == false) {
					
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
					          "", Font.PLAIN, 11)));       
					 JOptionPane.showMessageDialog(null,"결제 방식을 선택하세요","Message",JOptionPane.WARNING_MESSAGE); 
					return;
				}
				new PayWithCardFrame(paymentPage);
				lock();
			}
		});
		
		
		for(int i = 0; i < 10; i++) {
			shoppingListLabel[i] = new ShoppingListLabel(i);
			shoppingListSpace.add(shoppingListLabel[i]);
			shoppingListLabel[i].setVisible(false);
			
		}
		
		for(int i = 0; i < selectedMenus.size(); i++) {
			shoppingListLabel[i].setCode(selectedMenus.get(i).getCode());
			shoppingListLabel[i].setName(selectedMenus.get(i).getName());
			shoppingListLabel[i].setCombo((selectedMenus.get(i).isCombo()));
			shoppingListLabel[i].setSideMenu(selectedMenus.get(i).getSideMenu());
			shoppingListLabel[i].setBeverage(selectedMenus.get(i).getBeverage());
			shoppingListLabel[i].setChoice(selectedMenus.get(i).getChoice());
			shoppingListLabel[i].setSauce(selectedMenus.get(i).getSauce());
			shoppingListLabel[i].setMari(selectedMenus.get(i).getMari());
			shoppingListLabel[i].setPrice(selectedMenus.get(i).getPrice());
			shoppingListLabel[i].setQuantity(selectedMenus.get(i).getQuantity());
			shoppingListLabel[i].printShoppingList();
			
			shoppingListLabel[i].setVisible(true);
		}
		
		String expandSpace = "<html>";
		for(int i = 0; i < selectedMenus.size(); i++) {
			expandSpace += "<br><br><br><br><br><br><br><br>";
		}
		expandSpace += "</html>";
		shoppingListSpace.setText(expandSpace);
	}
	
	//public void print
	
	public void setPacking() {
		wrap.doClick();
	}
	
	public void setEatin() {
		store.doClick();
	}
	
	public void paymentCompletion() {
		payment_panel.setVisible(false);
		paymentCompletionPage.setVisible(true);
	}
	
	public void reset() {
		dispose();
		main.moveToMainPage();
		op.unlock();
		op.reset();
	}
	
	public void lock() {
		wrap.setEnabled(false);
		store.setEnabled(false);
		creditCard.setEnabled(false);
		cancel.setEnabled(false);
		payment.setEnabled(false);
	}
	
	public void unlock() {
		wrap.setEnabled(true);
		store.setEnabled(true);
		creditCard.setEnabled(true);
		cancel.setEnabled(true);
		payment.setEnabled(true);
	}
	
	public List<SelectedMenuInfo> getSelectedMenus() {
		return selectedMenus;
	}
	

}
