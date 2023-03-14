package payment_page.shopping_list;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

import tool.FontTool;

public class ShoppingListLabel extends JLabel{
	
	int code;
	String name;
	

	boolean combo;
	String sideMenu = "선택없음";
	String beverage = "콜라M";
	String choice = "선택없음";
	String sauce = "선택없음";
	String mari;
	int price;
	int quantity = 1;
	String beverageSize = "M";
	
	
	
	JLabel menuLabel = new JLabel();
	JTextArea optionTextArea = new JTextArea();
	JLabel quantityLabel = new JLabel();
	JLabel quantityLabel2 = new JLabel();
	JLabel priceLabel = new JLabel();
	JTextArea nameTextArea = new JTextArea();
	JButton removeMenuButton = new JButton();
	
	DecimalFormat dc = new DecimalFormat("###,###,###");
	
	public ShoppingListLabel(int num) {

		nameTextArea.setSize(120, 40);
		nameTextArea.setLocation(10, 10);
		nameTextArea.setLineWrap(true); 
		nameTextArea.setEditable(false);
//		descriptionArea.setFont(new Font("고딕체", Font.PLAIN, 13));
//		descriptionArea.setOpaque(true);
//		descriptionArea.setBackground(Color.white);
		//nameTextField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		nameTextArea.setOpaque(true);
		nameTextArea.setBackground(Color.white);
		// nameTextArea.setFont(new Font("나눔스퀘어", Font.BOLD, 16));
		nameTextArea.setFont(FontTool.boldNanumSquare(16f));
		nameTextArea.setText("쉬림프싸이");
		menuLabel.add(nameTextArea);
		
		priceLabel.setSize(70, 30);
		priceLabel.setLocation(203, 15);
		priceLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		priceLabel.setOpaque(true);
		priceLabel.setBackground(Color.white);//priceLabel.setBackground(Color.white);
		//priceLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 15));
		priceLabel.setFont(FontTool.boldNanumSquare(15f));
		priceLabel.setText("26,000");
		priceLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.add(priceLabel);
		
		quantityLabel.setSize(30, 30);
		quantityLabel.setLocation(166, 15);
		quantityLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		quantityLabel.setOpaque(true);
		quantityLabel.setBackground(Color.white);
		// quantityLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 15));
		quantityLabel.setFont(FontTool.boldNanumSquare(15f));
		quantityLabel.setText("10");
		quantityLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.add(quantityLabel);
		
		menuLabel.setSize(285, 60);
		menuLabel.setLocation(0, 0);
		menuLabel.setOpaque(true);
		menuLabel.setBackground(Color.white); //new Color(250, 237 ,125)
		menuLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 17));
		//menuLabel.setFont(FontTool.boldNanumSquare(15f));
		add(menuLabel, "North"); 
		
		optionTextArea.setSize(274, 60);
		optionTextArea.setLocation(2, 60);
		optionTextArea.setLineWrap(true); 
		optionTextArea.setEditable(false);
		optionTextArea.setOpaque(true);
		optionTextArea.setBackground(Color.white);
		//optionTextArea.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		optionTextArea.setFont(FontTool.nanumSquare(13f));
		//optionTextArea.setText(String.format("└ 사이드 : %s  음료 : %s  추가 %s  소스 %s", sideMenu, beverage, choice, saurce));
		add(optionTextArea, "South");
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(277, 120);
		setLocation(4, num * 120);
		
	}
	
	public void printShoppingList() {
		nameTextArea.setText(name);
		quantityLabel.setText("" + quantity);
		priceLabel.setText(dc.format(price));
		if(code >= 100 && code < 200) {
			if(combo) {
				optionTextArea.setText(String.format("   └ 사이드 : %s,  음료 : %s,  초이스 : %s,  소스 : %s", sideMenu, beverage, choice, sauce));									
			} else {
				optionTextArea.setText(String.format("   └ 사이드 : %s,  음료 : %s,  초이스 : %s,  소스 : %s", sideMenu, beverage, choice, sauce));									
			}

		} else if (code >= 200 && code < 400) {
			// 치킨, 순살치킨
			optionTextArea.setText(String.format("   └ %s  사이드 : %s  음료 : %s 소스 : %s", mari, sideMenu, beverage, sauce));
		} else if (code >= 400 && code < 500) {
			// 신메뉴
			
			optionTextArea.setText(String.format("   └ null"));
		} else if (code >= 500 && code < 600) {
			// 사이드
			
			optionTextArea.setText(String.format("   └ 옵션선택불가"));
		} else if (code >= 600 && code < 700) {
			// 음료
			
			optionTextArea.setText(String.format("   └ 사이즈 : %s", beverageSize));
		} else if (code >= 700 && code < 800) {
			// 맘스세트
			
			optionTextArea.setText(String.format("   └ 옵션선택불가"));					
		} else {
			System.out.println("존재하지 않는 코드");
		}
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCombo() {
		return combo;
	}

	public void setCombo(boolean combo) {
		this.combo = combo;
	}

	public String getSideMenu() {
		return sideMenu;
	}

	public void setSideMenu(String sideMenu) {
		this.sideMenu = sideMenu;
	}

	public String getBeverage() {
		return beverage;
	}

	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}


	public String getMari() {
		return mari;
	}

	public void setMari(String mari) {
		this.mari = mari;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getBeverageSize() {
		return beverageSize;
	}

	public void setBeverageSize(String beverageSize) {
		this.beverageSize = beverageSize;
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
//		JLabel label = new JLabel();
//		label.setBounds(100, 100, 100, 100);
//		label.setText("test");
//		f.add(label);
//		f.setName("레이블이름");
//		System.out.println(f.getName());
		
		f.add(new ShoppingListLabel(0));
		
		f.setLayout(null);
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
