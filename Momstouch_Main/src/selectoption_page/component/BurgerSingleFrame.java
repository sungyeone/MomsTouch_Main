package selectoption_page.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.OverlayLayout;

import model.BurgerInfo;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;
import selectoption_page.component.fourthPageInPane.FourthPagePane;
import selectoption_page.component.fourthPageInPane.add.SingleOptLabel;
import selectoption_page.component.fourthPageUpper.AmountLabel;
import selectoption_page.component.fourthPageUpper.BurgerImage;
import selectoption_page.component.fourthPageUpper.InfoLabel;
import selectoption_page.component.fourthPageUpper.MenuNameLabel;
import selectoption_page.component.fourthPageUpper.MinusButton;
import selectoption_page.component.fourthPageUpper.PlusButton;
import selectoption_page.component.fourthPageUpper.PriceLabel;
import selectoption_page.component.fourthPageUpper.TopLabel;
import selectoption_page.component.okAndCancel.CancelBtn;
import selectoption_page.component.okAndCancel.OkBtn;

public class BurgerSingleFrame extends JFrame{
	TopLabel topLabel = new TopLabel();
	LayoutManager overlay = new OverlayLayout(topLabel);
	{
		topLabel.setLayout(overlay);
	}
	JLabel topText = new JLabel() {
		{
			setText("옵 션   선 택");
			setAlignmentX(0.5f);
			try {
				// create the font to use. Specify the size!
				Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf"))
						.deriveFont(15f);
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				// register the font
				ge.registerFont(customFont);
			       setFont(customFont);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (FontFormatException e) {
				e.printStackTrace();
			}
			setHorizontalAlignment(JLabel.CENTER);
		}
	};
	{
		topLabel.add(topText);
	}
	AmountLabel amount = new AmountLabel();
	MinusButton minusBtn = new MinusButton(amount);
	PlusButton plusBtn = new PlusButton(amount);
	InfoLabel infoLabel = new InfoLabel();
	PriceLabel priceLabel = new PriceLabel();
	MenuNameLabel menuNameLabel = new MenuNameLabel();
	BurgerImage burgerImage;
	
	SingleOptLabel singleOpt = new SingleOptLabel();
	JScrollPane scrollPaneSingle = new FourthPagePane(singleOpt);
	
	OkBtn ok = new OkBtn();
	CancelBtn cancel = new CancelBtn();
	
	String sideName;
	int sidePrice;
	String beverageName;
	int beveragePrice;
	String choice;
	String sauce;
	
	DecimalFormat dc = new DecimalFormat();
	
	public BurgerSingleFrame(BurgerInfo[] burgerInfo, int num, OrderPanel op, SelectedMenuInfo selectedMenuInfo){
		
		int unitPrice = selectedMenuInfo.getPrice()/selectedMenuInfo.getQuantity();
		
		amount.setText("" + selectedMenuInfo.getQuantity());
		String imagePath = burgerInfo[num].getBurger_image_link();
		menuNameLabel.setText(burgerInfo[num].getBurger_name());
		priceLabel.setText(dc.format(burgerInfo[num].getBurger_price()));
		infoLabel.setText(burgerInfo[num].getBurger_info());
		burgerImage = new BurgerImage(imagePath);

		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(400, 10, 600, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		add(topLabel);
		add(amount);
		add(minusBtn);
		add(plusBtn);
		add(infoLabel);
		add(priceLabel);
		add(menuNameLabel);
		add(burgerImage);
		add(scrollPaneSingle);
		add(cancel);
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				op.unlock();
				dispose();	
			}
		});
		add(ok);
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < singleOpt.getSideBtns().size(); ++i) {
					if (singleOpt.getSideBtns().get(i).getsChecked()) {
						sideName = singleOpt.getSideBtns().get(i).getSideOpt().getSide_name();
						sidePrice = singleOpt.getSideBtns().get(i).getSideOpt().getSide_price();
						//System.out.printf("사이드 : %s, 가격 : %d\n", sideName, sidePrice);
					} 
				}
				if(sideName == null) {
					sideName = "선택없음";
					sidePrice = 0;
				}
				
				for (int i = 0; i < singleOpt.getBeverageBtns().size(); ++i) {
					if (singleOpt.getBeverageBtns().get(i).getbChecked()) {
						beverageName = singleOpt.getBeverageBtns().get(i).getBeverageOpt().getBeverage_name();
						beveragePrice = singleOpt.getBeverageBtns().get(i).getBeverageOpt().getBeverage_price();
	//					System.out.printf("음료 : %s, 가격 : %d\n", beverageName, beveragePrice);
					} 
				}
				if(beverageName == null) {
					beverageName = "선택없음";
					beveragePrice = 0;
				}
				
				if(singleOpt.getCheckedTomato() && singleOpt.getCheckedLettuce() && singleOpt.getCheckedPickle()) {
					choice = singleOpt.getChoiceTomato() +" "+singleOpt.getChoiceLettuce()+" "+singleOpt.getChoicePickle();
	//				System.out.printf("초이스 : %s\n", choice);
				} else if(singleOpt.getCheckedTomato() && singleOpt.getCheckedLettuce()) {
					choice = singleOpt.getChoiceTomato() + " "+ singleOpt.getChoiceLettuce();
	//				System.out.printf("초이스 : %s\n", choice);
				} else if(singleOpt.getCheckedTomato() && singleOpt.getCheckedPickle()) {
					choice = singleOpt.getChoiceTomato() + " "+ singleOpt.getChoicePickle();
	//				System.out.printf("초이스 : %s\n", choice);
				} else if (singleOpt.getCheckedPickle() && singleOpt.getCheckedLettuce()){
					choice = singleOpt.getChoicePickle() +" " +singleOpt.getChoiceLettuce();
	//				System.out.printf("초이스 : %s\n", choice);
				} else if(singleOpt.getCheckedTomato()) {
					choice = singleOpt.getChoiceTomato();
	//				System.out.printf("초이스 : %s\n", choice);
				} else if(singleOpt.getCheckedPickle()) {
					choice = singleOpt.getChoicePickle();
	//				System.out.printf("초이스 : %s\n", choice);
				} else if(singleOpt.getCheckedLettuce()) {
					choice = singleOpt.getChoiceLettuce();
	//				System.out.printf("초이스 : %s\n", choice);
				} else {
					choice = "선택없음";
				}
				
				if(singleOpt.getCheckedLanch() && singleOpt.getCheckedMoms()) {
					sauce = singleOpt.getLanchSauce() +" "+ singleOpt.getMomsSauce();
	//				System.out.printf("소스 : %s\n", sauce);
				} else if(singleOpt.getCheckedLanch()) {
					sauce = singleOpt.getLanchSauce();
	//				System.out.printf("소스 : %s\n", sauce);
				} else if(singleOpt.getCheckedMoms()) {
					sauce = singleOpt.getMomsSauce();
	//				System.out.printf("소스 : %s\n", sauce);
				} else {
					sauce = "선택없음";
	//				System.out.println("소스없음");
				}
				selectedMenuInfo.setSideMenu(sideName);
				selectedMenuInfo.setBeverage(beverageName);
				selectedMenuInfo.setChoice(choice);
				selectedMenuInfo.setSauce(sauce);
				selectedMenuInfo.setQuantity(getQuantity());
				selectedMenuInfo.setPrice((unitPrice + sidePrice + beveragePrice) * getQuantity());
				
				op.addSelectedMenu(selectedMenuInfo);
				op.unlock();
				dispose();
			}
		
		});
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				op.unlock();
				dispose();
			
			}
		});
	}
	
	public int getQuantity() {
		return Integer.parseInt(amount.getText());
	}

	public static void main(String[] args) {
		//new BurgerSingleFrame();
	}
}