package order_page.component.panel;

import java.awt.Color;

import javax.swing.JPanel;

import database.MenuDAO;
import model.BurgerInfo;
import model.NewMenuInfo;
import model.SideMenuInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.BurgerChoiceButton;
import order_page.component.button.menuchoice_button.SideMenuChoiceButton;

public class NewMenuChoicePanel extends JPanel {
	
	BurgerInfo[] burgerInfo;
	BurgerChoiceButton[] burgerChoiceBtn;
	
	SideMenuInfo[] sideMenuInfo;
	SideMenuChoiceButton[] sideMenuChoiceBtn;
	
	NewMenuInfo[] newMenuInfo;
	
	
	
	public NewMenuChoicePanel(OrderPanel op) {
		burgerInfo = MenuDAO.getBurgerInfo();
		sideMenuInfo = MenuDAO.getSideMenuInfo();
		//newMenuInfo = MenuDAO.getN
		
		burgerChoiceBtn = new BurgerChoiceButton[burgerInfo.length];
		
		burgerChoiceBtn[15] = new BurgerChoiceButton(burgerInfo, 15, op);
		burgerChoiceBtn[15].setLocation(5, 0);
		add(burgerChoiceBtn[15]);
		
		burgerChoiceBtn[16] = new BurgerChoiceButton(burgerInfo, 16, op);
		burgerChoiceBtn[16].setLocation(202, 0);
		add(burgerChoiceBtn[16]);
		
		sideMenuChoiceBtn = new SideMenuChoiceButton[sideMenuInfo.length];
		
		sideMenuChoiceBtn[4] = new SideMenuChoiceButton(sideMenuInfo, 4, op);
		sideMenuChoiceBtn[4].setLocation(400, 0);
		add(sideMenuChoiceBtn[4]);
		
		sideMenuChoiceBtn[5] = new SideMenuChoiceButton(sideMenuInfo, 5, op);
		sideMenuChoiceBtn[5].setLocation(5, 144);
		add(sideMenuChoiceBtn[5]);
		
//		BurgerChoiceButton  originalMeatballBurger = BurgerChoicePanel.burgerChoiceBtn[15];
//		BurgerChoiceButton  cheongyangMayoMeatballBurger = BurgerChoicePanel.burgerChoiceBtn[16];
//		SideMenuChoiceButton steamedPotatoBread = SideMenuChoicePanel.sideMenuChoiceBtn[4];
//		SideMenuChoiceButton steamedSweetPotatoBread = SideMenuChoicePanel.sideMenuChoiceBtn[5];
//		
//		originalMeatballBurger.setLocation(40, 0);
//		cheongyangMayoMeatballBurger.setLocation(202, 0);
//		steamedPotatoBread.setLocation(364, 0);
//		steamedSweetPotatoBread.setLocation(40, 144);
//		
//		
//		add(originalMeatballBurger);
//		add(cheongyangMayoMeatballBurger);
//		add(steamedPotatoBread);
//		add(steamedSweetPotatoBread);
//		JLabel label = new JLabel();
//		label.setBounds(200, 200, 120, 120);
//		add(label);
//		label.setOpaque(true);
//		label.setBackground(Color.white);
		
//		JButton btn = new JButton();
//		btn.setBounds(200, 200, 120, 120);
//		add(btn);
//		btn.setOpaque(true);
//		btn.setBackground(Color.white);
		
//		BufferedImage bufferedImage;
//		
//		String imagePath = "images/menu/burger/갈릭바베큐치킨버거.png";
//		
//		try {
//			bufferedImage = ImageIO.read(new File(imagePath));
//			Image scaledImage =
//					bufferedImage.getScaledInstance(120, 120, Image.SCALE_DEFAULT);
//			label.setIcon(new ImageIcon(scaledImage));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		setLayout(null);
		setBounds(0, 240, 600, 425);
		setOpaque(true);
		setBackground(Color.white);
		setVisible(true);
	}
	
	public void lock() {
		burgerChoiceBtn[15].setVisible(false);
		burgerChoiceBtn[16].setVisible(false);
		sideMenuChoiceBtn[4].setVisible(false);
		sideMenuChoiceBtn[5].setVisible(false);
		
	}
	
	public void unlock() {
		burgerChoiceBtn[15].setVisible(true);
		burgerChoiceBtn[16].setVisible(true);
		sideMenuChoiceBtn[4].setVisible(true);
		sideMenuChoiceBtn[5].setVisible(true);
	}
	
	
	

}
