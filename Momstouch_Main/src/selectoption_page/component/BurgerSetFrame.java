package selectoption_page.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.OverlayLayout;

import model.BurgerInfo;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;
import selectoption_page.component.fourthPageInPane.FourthPagePane;
import selectoption_page.component.fourthPageInPane.add.SetOptLabel;
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

public class BurgerSetFrame extends JFrame {

	TopLabel topLabel = new TopLabel();
	LayoutManager overlay = new OverlayLayout(topLabel);
	{
		topLabel.setLayout(overlay);
	}
	JLabel topText = new JLabel() {
		{
			setText("세 트   선 택");
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
	
	SetOptLabel setOpt = new SetOptLabel();
	JScrollPane scrollPaneSet = new FourthPagePane(setOpt);
	
	OkBtn ok = new OkBtn();
	CancelBtn cancel = new CancelBtn();
	
	
	String sideName;
	int sidePrice;
	String beverageName;
	int beveragePrice;
	String choice;
	String sauce;
	
	DecimalFormat dc = new DecimalFormat("###,###,###");
	
	public BurgerSetFrame(BurgerInfo[] burgerInfo, int num, OrderPanel op, SelectedMenuInfo selectedMenuInfo) {
		setVisible(true);
		setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(400, 10, 600, 800);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(topLabel);
		add(amount);
		add(minusBtn);
		add(plusBtn);
		add(infoLabel);
		add(priceLabel);
		add(menuNameLabel);
		add(scrollPaneSet);
		add(ok);
		add(cancel);
		
		int unitPrice = selectedMenuInfo.getPrice()/selectedMenuInfo.getQuantity();
		
		amount.setText("" + selectedMenuInfo.getQuantity());
		String imagePath = burgerInfo[num].getBurger_image_link();
		menuNameLabel.setText(burgerInfo[num].getBurger_name());
		priceLabel.setText(dc.format(burgerInfo[num].getCombo_price()));
		infoLabel.setText(burgerInfo[num].getBurger_info());
		burgerImage = new BurgerImage(imagePath);
		
		add(burgerImage);
		
		try {
		BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
		Image scaledImage = bufferedImage.getScaledInstance(160, 140, Image.SCALE_SMOOTH);
		burgerImage.setIcon(new ImageIcon(scaledImage));
	} catch (IOException e2) {
		e2.printStackTrace();
	}
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < setOpt.getSideBtns().size(); ++i) {
					if (setOpt.getSideBtns().get(i).getsChecked()) {
						sideName = setOpt.getSideBtns().get(i).getSideOpt().getSide_name();
						sidePrice = setOpt.getSideBtns().get(i).getSideOpt().getSide_price();
//						System.out.printf("사이드 : %s, 가격 : %d\n", sideName, sidePrice);
					}
				}
				if(sideName == null) {
					sideName = "케이준양념감자(중)";
					sidePrice = 2000;
				}
				
				for (int i = 0; i < setOpt.getBeverageBtns().size(); ++i) {
					if (setOpt.getBeverageBtns().get(i).getbChecked()) {
						beverageName = setOpt.getBeverageBtns().get(i).getBeverageOpt().getBeverage_name();
						beveragePrice = setOpt.getBeverageBtns().get(i).getBeverageOpt().getBeverage_price();
//						System.out.printf("음료 : %s, 가격 : %d\n", beverageName, beveragePrice);
					}
				}
				if(beverageName == null) {
					beverageName = "콜라";
					beveragePrice = 1600;
				}
				
				if(setOpt.getCheckedTomato() && setOpt.getCheckedLettuce() && setOpt.getCheckedPickle()) {
					choice = setOpt.getChoiceTomato() +" "+setOpt.getChoiceLettuce()+" "+setOpt.getChoicePickle();
//					System.out.printf("초이스 : %s\n", choice);
				} else if(setOpt.getCheckedTomato() && setOpt.getCheckedLettuce()) {
					choice = setOpt.getChoiceTomato() + " "+ setOpt.getChoiceLettuce();
//					System.out.printf("초이스 : %s\n", choice);
				} else if(setOpt.getCheckedTomato() && setOpt.getCheckedPickle()) {
					choice = setOpt.getChoiceTomato() + " "+ setOpt.getChoicePickle();
//					System.out.printf("초이스 : %s\n", choice);
				} else if (setOpt.getCheckedPickle() && setOpt.getCheckedLettuce()){
					choice = setOpt.getChoicePickle() +" " +setOpt.getChoiceLettuce();
//					System.out.printf("초이스 : %s\n", choice);
				} else if(setOpt.getCheckedTomato()) {
					choice = setOpt.getChoiceTomato();
//					System.out.printf("초이스 : %s\n", choice);
				} else if(setOpt.getCheckedPickle()) {
					choice = setOpt.getChoicePickle();
//					System.out.printf("초이스 : %s\n", choice);
				} else if(setOpt.getCheckedLettuce()) {
					choice = setOpt.getChoiceLettuce();
//					System.out.printf("초이스 : %s\n", choice);
				} else {
					choice = "선택없음";
				}
				
				if(setOpt.getCheckedLanch() && setOpt.getCheckedMoms()) {
					sauce = setOpt.getLanchSauce() +" "+ setOpt.getMomsSauce();
//					System.out.printf("소스 : %s\n", sauce);
				} else if(setOpt.getCheckedLanch()) {
					sauce = setOpt.getLanchSauce();
//					System.out.printf("소스 : %s\n", sauce);
				} else if(setOpt.getCheckedMoms()) {
					sauce = setOpt.getMomsSauce();
//					System.out.printf("소스 : %s\n", sauce);
				} else {
					sauce = "선택없음";
//					System.out.println("선택없음");
				}
				
				selectedMenuInfo.setSideMenu(sideName);
				selectedMenuInfo.setBeverage(beverageName);
				selectedMenuInfo.setChoice(choice);
				selectedMenuInfo.setSauce(sauce);
				selectedMenuInfo.setQuantity(getQuantity());
				selectedMenuInfo.setPrice((unitPrice + sidePrice - 2000 + beveragePrice - 1600) * getQuantity());
				
				op.addSelectedMenu(selectedMenuInfo);
				op.unlock();
				dispose();
			}
		});

		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				op.unlock();
			}
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				op.unlock();
			}	
		});
	}
	
	public int getQuantity() {
		return Integer.parseInt(amount.getText());
	}
	
	public static void main(String[] args) {
//		new BurgerSetFrame();
	}
}
