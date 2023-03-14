package order_page;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import main_page.MomstouchMainFrame;
import model.selectedoption.SelectedMenuInfo;
import model.selectedoption.SelectedMenuLabel;
import order_page.component.MenuChoicePanel;
import order_page.component.SelectedMenuPane;
import order_page.component.button.CancelAll_Button;
import order_page.component.button.EatInButton;
import order_page.component.button.FirstWindowButton;
import order_page.component.button.PackagingButton;
import order_page.component.button.Payment_Confirmation_Button;
import order_page.component.button.category_button.Beverage_Button;
import order_page.component.button.category_button.BonelessChicken_Button;
import order_page.component.button.category_button.Burger_Button;
import order_page.component.button.category_button.Chicken_Button;
import order_page.component.button.category_button.MomsSet_Button;
import order_page.component.button.category_button.NewMenu_Button;
import order_page.component.button.category_button.NextCategoryButton;
import order_page.component.button.category_button.PreviousCategoryButton;
import order_page.component.button.category_button.Side_Button;
import order_page.component.label.CategoryLabel;
import order_page.component.label.OrderAmountLabel;
import order_page.component.label.OrderQtyLabel;
import order_page.component.panel.BeverageChoicePanel;
import order_page.component.panel.BonelessChickenChoicePanel;
import order_page.component.panel.BurgerChoicePanel;
import order_page.component.panel.ChickenChoicePanel;
import order_page.component.panel.MomsSetChoicePanel;
import order_page.component.panel.NewMenuChoicePanel;
import order_page.component.panel.SideMenuChoicePanel;
import payment_page.PaymentPage;
import tool.FontTool;

public class OrderPanel extends JPanel{
	
	OrderPanel op = this;
	
	//장바구니 리스트
	List<SelectedMenuInfo> selectedMenus = new ArrayList<>();
	

	//장바구니 스크롤 생성
	JLabel selectedMenuSpace = new JLabel();
	JScrollPane selectedMenuPane = new SelectedMenuPane(selectedMenuSpace);
			
	
	CategoryLabel categoryLabel;
	
	JButton firstWindowBtn;
	JButton	packingBtn = new PackagingButton();
	JButton eatInBtn = new EatInButton();
			
	
	
	
	
	
	
	CardLayout categoryCard = new CardLayout();
	JPanel menuChoicePanel = new MenuChoicePanel(categoryCard);
	
	JButton nextButton;
	JButton previousButton;
	
	JButton newMenuBtn;
	JButton burgerBtn;
	JButton chickenBtn;
	JButton bonelessChickenBtn;
	JButton momsSetBtn;
	JButton beverageBtn;
	JButton sideMenuBtn;
	
	NewMenuChoicePanel newMenuChoicePanel;
	BurgerChoicePanel burgerChoicePanel;
	ChickenChoicePanel chickenChoicePanel;
	BonelessChickenChoicePanel bonelessChickenChoicePanel;
	MomsSetChoicePanel momsSetChoicePanel;
	BeverageChoicePanel beverageChoicePanel;
	SideMenuChoicePanel sideMenuChoicePanel;
	
	
	JLabel orderQtyLabel = new OrderQtyLabel();
	JLabel orderAmountLabel = new OrderAmountLabel();
	JButton cancelButton = new CancelAll_Button(this);
	JButton paymentConfirmationBtn = new Payment_Confirmation_Button();
	
	SelectedMenuLabel[] selectedMenuLabel = new SelectedMenuLabel[10];
	
	DecimalFormat dc = new DecimalFormat("###,###,###");
	
	public OrderPanel(MomstouchMainFrame main) {
		
		
		
		categoryLabel = new CategoryLabel(main); 
		firstWindowBtn = new FirstWindowButton(main, this);
		
		categoryLabel.add(firstWindowBtn);
		categoryLabel.add(packingBtn);
		categoryLabel.add(eatInBtn);
		
		
		
		CardLayout page = new CardLayout();
		
		burgerChoicePanel = new BurgerChoicePanel(page, this);
		menuChoicePanel.add("버거", burgerChoicePanel);
		chickenChoicePanel = new ChickenChoicePanel(page, this);
		menuChoicePanel.add("치킨", chickenChoicePanel);
		bonelessChickenChoicePanel = new BonelessChickenChoicePanel(page, this);
		menuChoicePanel.add("순살치킨", bonelessChickenChoicePanel);
		momsSetChoicePanel = new MomsSetChoicePanel(page, this);
		menuChoicePanel.add("맘스세트", momsSetChoicePanel);
		beverageChoicePanel = new BeverageChoicePanel(page, this);
		menuChoicePanel.add("음료", beverageChoicePanel);
		sideMenuChoicePanel = new SideMenuChoicePanel(page, this);
		menuChoicePanel.add("사이드메뉴", sideMenuChoicePanel);
		newMenuChoicePanel = new NewMenuChoicePanel(this);
		menuChoicePanel.add("신메뉴", newMenuChoicePanel);
		
		nextButton = new NextCategoryButton();
		previousButton = new PreviousCategoryButton();
		
		newMenuBtn = new NewMenu_Button(this);
		burgerBtn = new Burger_Button(this, page, burgerChoicePanel);
		chickenBtn = new Chicken_Button(this, page, chickenChoicePanel);
		bonelessChickenBtn = new BonelessChicken_Button(this, page, bonelessChickenChoicePanel);
		momsSetBtn = new MomsSet_Button(this, page, momsSetChoicePanel);
		beverageBtn  = new Beverage_Button(this, page, beverageChoicePanel);
		sideMenuBtn = new Side_Button(this, page, sideMenuChoicePanel);
		
		categoryLabel.add(nextButton);
		categoryLabel.add(previousButton);
		
		categoryLabel.add(newMenuBtn);
		categoryLabel.add(burgerBtn);
		categoryLabel.add(chickenBtn);
		categoryLabel.add(bonelessChickenBtn);
		categoryLabel.add(beverageBtn);
		categoryLabel.add(momsSetBtn);
		categoryLabel.add(sideMenuBtn);
		
		add(categoryLabel);
		
		add(menuChoicePanel);
		
		
		
		add(orderQtyLabel);
		add(orderAmountLabel);
		add(cancelButton);
		add(paymentConfirmationBtn);
		
		add(selectedMenuPane);
		
	
		
		JLabel lab = new JLabel("          제품명                           수량                   금액                                   주문수량");
		lab.setBackground(new Color(196, 198, 197));
		lab.setFont(FontTool.boldNanumSquare(16f));
		//lab.setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		lab.setBounds(0, 700, 585, 35);
		lab.setOpaque(true);
		add(lab);
		
		JLabel lab1 = new JLabel();
		lab1.setOpaque(true);
		lab1.setBackground(new Color(196, 198, 197));	
		lab1.setBounds(375, 700, 34, 600);
		add(lab1);
		
		JLabel lab2 = new JLabel("               주문 금액");
		// lab2.setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		lab2.setFont(FontTool.boldNanumSquare(16f));
		lab2.setOpaque(true);
		lab2.setBackground(new Color(196, 198, 197));
		lab2.setBounds(408, 790, 180, 18);
		add(lab2);
		
		
		JLabel lab4 = new JLabel();
		lab4.setOpaque(true);
		lab4.setBackground(new Color(226, 78, 64));
		lab4.setBounds(0, 0, 300, 100);
		add(lab4);
		
		
		setBounds(0, 0, 600, 1000);
		setLayout(null);
		setBackground(Color.white);
		
		//포장버튼
		packingBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.packing = true;
				packingBtn.setBackground(Color.white);
				packingBtn.setBorder(BorderFactory.createLineBorder(new Color(243, 156, 18), 3));
				packingBtn.setForeground(new Color(243, 156, 18));
				
				eatInBtn.setBackground(new Color(243, 156, 18));
				eatInBtn.setForeground(Color.white);
				eatInBtn.setBorder(BorderFactory.createLineBorder(new Color(243, 156, 18), 1));;
				
			}
		});
		
		//매장버튼
		eatInBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.packing = false;
				eatInBtn.setBackground(Color.white);
				eatInBtn.setBorder(BorderFactory.createLineBorder(new Color(243, 156, 18), 3));
				eatInBtn.setForeground(new Color(243, 156, 18));
				
				packingBtn.setBackground(new Color(243, 156, 18));
				packingBtn.setForeground(Color.white);
				packingBtn.setBorder(BorderFactory.createLineBorder(new Color(243, 156, 18), 1));
				
			}
		});
		
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moveToNextCategories();
				momsSetBtn.doClick();
				
			}
		});
		
		previousButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moveToPreviousCategories();
				burgerBtn.doClick();
				
			}
		});
		
		
		
		for(int i = 0; i < 10; i++) {
			selectedMenuLabel[i] = new SelectedMenuLabel(i, this);
			selectedMenuSpace.add(selectedMenuLabel[i]);
			selectedMenuLabel[i].setVisible(false);
		}
		
		
		

//		String test = "<html>";
//		for(int i = 0; i < 31; i++) {
//			test += "sdasdf<br>";
//		}
//		test += "<html>";
//		
//		selectedMenuSpace.setText(test);
		
		
		paymentConfirmationBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedMenus.size() == 0) {
					 JOptionPane.showMessageDialog(null, "메뉴를 선택하세요");
					 return;
				}
				PaymentPage paymentPage = new PaymentPage(main, op);
				op.lock();
				if(main.packing) {
					paymentPage.setPacking();
				} else {
					paymentPage.setEatin();
				}
				
			}
		});
		
		burgerBtn.doClick();
		orderQtyLabel.setText("0");
		orderAmountLabel.setText("0");
	}
	
	public List<SelectedMenuInfo> getSelectedMenus() {
		return selectedMenus;
	}
	
	// 다음 카테고리 목록으로 넘어감
	public void moveToNextCategories() {
		newMenuBtn.setVisible(false);
		burgerBtn.setVisible(false);
		chickenBtn.setVisible(false);
		bonelessChickenBtn.setVisible(false);
		
		momsSetBtn.setVisible(true);
		beverageBtn.setVisible(true);
		sideMenuBtn.setVisible(true);
		
		nextButton.setVisible(false);
		previousButton.setVisible(true);
		
		

	}	
	
	// 이전 카테고리 목록으로 넘어감
	public void moveToPreviousCategories() {
		
		momsSetBtn.setVisible(false);
		beverageBtn.setVisible(false);
		sideMenuBtn.setVisible(false);
		
		newMenuBtn.setVisible(true);
		burgerBtn.setVisible(true);
		chickenBtn.setVisible(true);
		bonelessChickenBtn.setVisible(true);
		
		nextButton.setVisible(true);
		previousButton.setVisible(false);
		
		
	}
	
	
	public void moveToNewMenuChoicePanel() {
		categoryCard.show(menuChoicePanel, "신메뉴");
		//categoryCard.next(menuChoicePanel);
	}
	public void moveToBurgerChoicePanel() {
		categoryCard.show(menuChoicePanel, "버거");
		
	}
	public void moveToChickenChoicePanel() {
		categoryCard.show(menuChoicePanel, "치킨");
		
	}
	public void moveToBonelessChickenChoicePanel() {
		
		categoryCard.show(menuChoicePanel, "순살치킨");
	}
	public void moveToMomsSetChoicePanel() {
		categoryCard.show(menuChoicePanel, "맘스세트");
		
	}
	public void moveToSideMenuChoicePanel() {
		categoryCard.show(menuChoicePanel, "사이드메뉴");
		
	}
	public void moveToBeverageChoicePanel() {
		categoryCard.show(menuChoicePanel, "음료");
		
	}
	
	public void setPacking() {
		packingBtn.doClick();
	}
	
	public void setEatIn() {
		eatInBtn.doClick();
	}
	
	public boolean alreadyExistMenu(SelectedMenuInfo selectedMenuInfo) {
		for(int i = 0; i < selectedMenus.size(); i++) {
			if(selectedMenuInfo.getCode() == (selectedMenus.get(i).getCode()) &&
			   selectedMenuInfo.getName().equals(selectedMenus.get(i).getName()) &&
			   selectedMenuInfo.getSideMenu().equals(selectedMenus.get(i).getSideMenu()) &&
			   selectedMenuInfo.getBeverage().equals(selectedMenus.get(i).getBeverage()) &&
			   selectedMenuInfo.getChoice().equals(selectedMenus.get(i).getChoice()) &&
			   selectedMenuInfo.getSauce().equals(selectedMenus.get(i).getSauce()) &&
			   selectedMenuInfo.getMari().equals(selectedMenus.get(i).getMari()) &&
			   selectedMenuInfo.getBeverageSize().equals(selectedMenus.get(i).getBeverageSize())){
			
				
				selectedMenus.get(i).setQuantity(selectedMenus.get(i).getQuantity() + selectedMenuInfo.getQuantity());
				selectedMenus.get(i).setPrice(selectedMenus.get(i).getPrice() + selectedMenuInfo.getPrice());
				
				selectedMenuLabel[i].setQuantity(selectedMenus.get(i).getQuantity());
				selectedMenuLabel[i].setPrice(selectedMenus.get(i).getPrice());
				selectedMenuLabel[i].printSelectedMenu();
				
				orderQtyLabel.setText("" + getTotalQuantity());
				orderAmountLabel.setText(dc.format(getTotalPrice()));
				return true;
			}
		}
		return false;
	}
	
	public void addSelectedMenu(SelectedMenuInfo selectedMenuInfo) {
		if(alreadyExistMenu(selectedMenuInfo)) {
			 return;
		}
		if(selectedMenus.size() >= 10) {
			return;
		}
		
		selectedMenus.add(selectedMenuInfo);
		int lastIndex = selectedMenus.size() - 1;
		//		for(SelectedMenuFormat selectedMenu : selectedMenus) {
		//			selectedMenu.getName();
		//		}

		selectedMenuLabel[lastIndex].setCode(selectedMenuInfo.getCode());
		selectedMenuLabel[lastIndex].setName(selectedMenuInfo.getName());
		selectedMenuLabel[lastIndex].setCombo((selectedMenuInfo.isCombo()));
		selectedMenuLabel[lastIndex].setSideMenu(selectedMenuInfo.getSideMenu());
		selectedMenuLabel[lastIndex].setBeverage(selectedMenuInfo.getBeverage());
		selectedMenuLabel[lastIndex].setChoice(selectedMenuInfo.getChoice());
		selectedMenuLabel[lastIndex].setSauce(selectedMenuInfo.getSauce());
		selectedMenuLabel[lastIndex].setMari(selectedMenuInfo.getMari());
		selectedMenuLabel[lastIndex].setBeverageSize(selectedMenuInfo.getBeverageSize());
		selectedMenuLabel[lastIndex].setPrice(selectedMenuInfo.getPrice());
		selectedMenuLabel[lastIndex].setQuantity(selectedMenuInfo.getQuantity());
		selectedMenuLabel[lastIndex].printSelectedMenu();

		selectedMenuLabel[lastIndex].setVisible(true);
		
		String expandSpace = "<html>";
		for(int i = 0; i < selectedMenus.size(); i++) {
			if(i >= 5) {
				if(i == 8 || i == 10) {
					expandSpace += "<br>";
				}
				expandSpace += "<br><br><br>";
				continue;
			}
			expandSpace += "<br><br><br><br><br>";
		}
		expandSpace += "<html>";
		selectedMenuSpace.setText(expandSpace);
		
		selectedMenuPane.getVerticalScrollBar().setValue(selectedMenuPane.getVerticalScrollBar().getMaximum());
		
		orderQtyLabel.setText("" + getTotalQuantity());
		orderAmountLabel.setText(dc.format(getTotalPrice()));
	
		
	}
	
	public void deleteSelectedMenu(int num) {
		for(int i = 0; i < selectedMenus.size(); i++) {
			selectedMenuLabel[i].setVisible(false);
		}
		
		selectedMenus.remove(num);
		
		for(int i = 0; i < selectedMenus.size(); i++) {
			selectedMenuLabel[i].setCode(selectedMenus.get(i).getCode());
			selectedMenuLabel[i].setName(selectedMenus.get(i).getName());
			selectedMenuLabel[i].setCombo((selectedMenus.get(i).isCombo()));
			selectedMenuLabel[i].setSideMenu(selectedMenus.get(i).getSideMenu());
			selectedMenuLabel[i].setBeverage(selectedMenus.get(i).getBeverage());
			selectedMenuLabel[i].setChoice(selectedMenus.get(i).getChoice());
			selectedMenuLabel[i].setSauce(selectedMenus.get(i).getSauce());
			selectedMenuLabel[i].setMari(selectedMenus.get(i).getMari());
			selectedMenuLabel[i].setBeverageSize(selectedMenus.get(i).getBeverageSize());
			selectedMenuLabel[i].setPrice(selectedMenus.get(i).getPrice());
			selectedMenuLabel[i].setQuantity(selectedMenus.get(i).getQuantity());
			selectedMenuLabel[i].printSelectedMenu();
			
			selectedMenuLabel[i].setVisible(true);
		}
		

		
		orderQtyLabel.setText("" + getTotalQuantity());
		orderAmountLabel.setText(dc.format(getTotalPrice()));
		
	}
	
	public void addQuantity(int num) {
		int unitPrice = selectedMenus.get(num).getPrice() / selectedMenus.get(num).getQuantity();
		
		selectedMenus.get(num).setQuantity(selectedMenus.get(num).getQuantity() + 1);
		selectedMenus.get(num).setPrice(selectedMenus.get(num).getPrice() + unitPrice);
		
		selectedMenuLabel[num].setQuantity(selectedMenus.get(num).getQuantity());
		selectedMenuLabel[num].setPrice(selectedMenus.get(num).getPrice());
		selectedMenuLabel[num].printSelectedMenu();
		
		orderQtyLabel.setText("" + getTotalQuantity());
		orderAmountLabel.setText(dc.format(getTotalPrice()));
	}
	
	public void subtractQuantity(int num) {
		int unitPrice = selectedMenus.get(num).getPrice() / selectedMenus.get(num).getQuantity();
		
		selectedMenus.get(num).setQuantity(selectedMenus.get(num).getQuantity() - 1);
		selectedMenus.get(num).setPrice(selectedMenus.get(num).getPrice() - unitPrice);
		
		selectedMenuLabel[num].setQuantity(selectedMenus.get(num).getQuantity());
		selectedMenuLabel[num].setPrice(selectedMenus.get(num).getPrice());
		selectedMenuLabel[num].printSelectedMenu();
		
		orderQtyLabel.setText("" + getTotalQuantity());
		orderAmountLabel.setText(dc.format(getTotalPrice()));
	}
	
	public void cancelAll() {
		for(int i = 0; i < selectedMenus.size(); i++) {
			selectedMenuLabel[i].setVisible(false);
		}
		selectedMenus.removeAll(selectedMenus);
		
		orderQtyLabel.setText(0 + "");
		orderAmountLabel.setText(0 + "");
		selectedMenuSpace.setText(null);
	}
	
	public int getTotalPrice() {
		
		int totalPrice = 0;
		for(SelectedMenuInfo selectedMenuInfo : selectedMenus) {
			totalPrice += selectedMenuInfo.getPrice();
		}
		
		return totalPrice;
	}
	
	public int getTotalQuantity() {

		int totalQuantity = 0;
		for(SelectedMenuInfo selectedMenuInfo : selectedMenus) {
			totalQuantity += selectedMenuInfo.getQuantity();
		}
		
		return totalQuantity;
	}
	
	public void reset() {
		previousButton.doClick();
		burgerBtn.doClick();
		cancelAll();
	}
	
	public void lock() {
		packingBtn.setEnabled(false);
		eatInBtn.setEnabled(false);
		firstWindowBtn.setEnabled(false);
		nextButton.setEnabled(false);
		previousButton.setEnabled(false);
		momsSetBtn.setEnabled(false);
		beverageBtn.setEnabled(false);  
		sideMenuBtn.setEnabled(false);
		newMenuBtn.setEnabled(false);
		burgerBtn.setEnabled(false);
		chickenBtn.setEnabled(false);
		bonelessChickenBtn.setEnabled(false);
		
		burgerChoicePanel.lock();
		chickenChoicePanel.lock();
		bonelessChickenChoicePanel.lock();
		beverageChoicePanel.lock();
		momsSetChoicePanel.lock();
		newMenuChoicePanel.lock();
		sideMenuChoicePanel.lock();
		
		for(int i = 0; i < selectedMenuLabel.length; i++) {
			selectedMenuLabel[i].lock();
		}
		
		cancelButton.setEnabled(false);
		paymentConfirmationBtn.setEnabled(false);
		
	}
	
	public void unlock() {
		packingBtn.setEnabled(true);
		eatInBtn.setEnabled(true);
		firstWindowBtn.setEnabled(true);
		nextButton.setEnabled(true);
		previousButton.setEnabled(true);
		momsSetBtn.setEnabled(true);
		beverageBtn.setEnabled(true);  
		sideMenuBtn.setEnabled(true);
		newMenuBtn.setEnabled(true);
		burgerBtn.setEnabled(true);
		chickenBtn.setEnabled(true);
		bonelessChickenBtn.setEnabled(true);
		
		burgerChoicePanel.unlock();
		chickenChoicePanel.unlock();
		bonelessChickenChoicePanel.unlock();
		beverageChoicePanel.unlock();
		momsSetChoicePanel.unlock();
		newMenuChoicePanel.unlock();
		sideMenuChoicePanel.unlock();
		
		for(int i = 0; i < selectedMenuLabel.length; i++) {
			selectedMenuLabel[i].unlock();
		}
		cancelButton.setEnabled(true);
		paymentConfirmationBtn.setEnabled(true);
	}
	
	public void allCategoryBtnOff() {
		newMenuBtn.setBackground(new Color(190, 190, 190));
		burgerBtn.setBackground(new Color(190, 190, 190));
		chickenBtn.setBackground(new Color(190, 190, 190));
		bonelessChickenBtn.setBackground(new Color(190, 190, 190));
		momsSetBtn.setBackground(new Color(190, 190, 190));
	    beverageBtn.setBackground(new Color(190, 190, 190));
		sideMenuBtn.setBackground(new Color(190, 190, 190));
	}
	
	
	
	
}
