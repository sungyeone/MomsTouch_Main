package model.selectedoption;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import order_page.OrderPanel;
import tool.FontTool;

public class SelectedMenuLabel extends JLabel{
	
	int code;
	String Name;
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
	JLabel optionLabel = new JLabel();
	JLabel quantityLabel = new JLabel();
	JLabel quantityLabel2 = new JLabel();
	JLabel priceLabel = new JLabel();
	JButton plusButton = new JButton();
	JButton minusButton = new JButton();
	JButton removeMenuButton = new JButton();
	
	
	public SelectedMenuLabel(int num, OrderPanel op) {
		
		plusButton.setSize(25, 35);
		plusButton.setLocation(230, 0);
		plusButton.setBorder(BorderFactory.createEmptyBorder(0 , 0, 0 , 0));
		plusButton.setOpaque(true);
		plusButton.setBackground(new Color(250, 237 ,125));
		plusButton.setFont(FontTool.boldNanumSquare(15f));
		plusButton.setText("+");
		plusButton.setBorderPainted(false);
		plusButton.setFocusPainted(false);
		plusButton.setContentAreaFilled(false);
		plusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.addQuantity(num);
				
			}
		});
		menuLabel.add(plusButton);
		
		
		
		minusButton.setSize(25, 35);
		minusButton.setLocation(171, 0);
		minusButton.setBorder(BorderFactory.createEmptyBorder(0 , 0, 0 , 0));
		minusButton.setOpaque(true);
		minusButton.setBackground(new Color(250, 237 ,125));
		minusButton.setFont(FontTool.boldNanumSquare(18f));
		minusButton.setText("-");
		minusButton.setBorderPainted(false);
		minusButton.setFocusPainted(false);
		minusButton.setContentAreaFilled(false);
		minusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.subtractQuantity(num);
				
			}
		});
		menuLabel.add(minusButton);
		
		
		priceLabel.setSize(78, 25);
		priceLabel.setLocation(274, 5);
		priceLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		priceLabel.setOpaque(true);
		priceLabel.setBackground(new Color(250, 237, 125));//priceLabel.setBackground(Color.white);
		// priceLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 15));
		priceLabel.setFont(FontTool.boldNanumSquare(15f));
		priceLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.add(priceLabel);
		
		quantityLabel.setSize(25, 25);
		quantityLabel.setLocation(192, 5);
		quantityLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		quantityLabel.setOpaque(true);
		quantityLabel.setBackground(Color.white);
		// quantityLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 15));
		quantityLabel.setFont(FontTool.boldNanumSquare(15f));
		quantityLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.add(quantityLabel);
		
		quantityLabel2.setSize(25, 25);
		quantityLabel2.setLocation(217, 5);
		quantityLabel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		quantityLabel2.setOpaque(true);
		quantityLabel2.setBackground(new Color(250, 237 ,125));
		// quantityLabel2.setFont(new Font("나눔스퀘어", Font.BOLD, 15));
		quantityLabel2.setFont(FontTool.boldNanumSquare(15f));
		quantityLabel2.setText("개");
		menuLabel.add(quantityLabel2);
		
		
		removeMenuButton.setSize(25, 35);
		removeMenuButton.setLocation(350, 0);
		removeMenuButton.setBorder(BorderFactory.createEmptyBorder(0 , 0, 0 , 0));
		removeMenuButton.setOpaque(true);
		removeMenuButton.setBackground(new Color(250, 237 ,125));
		removeMenuButton.setText("X");
		menuLabel.add(removeMenuButton);
		removeMenuButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.deleteSelectedMenu(num);
				
			}
		});
		
		
		menuLabel.setSize(375, 35);
		menuLabel.setLocation(0, 0);
		menuLabel.setOpaque(true);
		menuLabel.setBackground(new Color(250, 237 ,125));
		//menuLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 15));
		menuLabel.setFont(FontTool.boldNanumSquare(15f));
		add(menuLabel, "North"); 
		
		optionLabel.setSize(375, 25);
		optionLabel.setLocation(0, 35);
		optionLabel.setOpaque(true);
		optionLabel.setBackground(Color.white);
		optionLabel.setFont(FontTool.boldNanumSquare(12f));
		add(optionLabel, "South");
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(375, 60);
		setLocation(0,  num * 60);
//		setVisible(true);
		
	}
	
	public void printSelectedMenu() {
		if(quantity >= 10) {
			plusButton.setVisible(false);
		} else {
			plusButton.setVisible(true);
		}
		
		if(quantity <= 1) {
			minusButton.setVisible(false);
		} else {
			minusButton.setVisible(true);
		}
		
		menuLabel.setText("  " + Name);
		quantityLabel.setText("" + quantity);
		priceLabel.setText(price + "원");
		if(code >= 100 && code < 200) {
			if(combo) {
				optionLabel.setText(String.format("     └ 사이드 : %s  음료 : %s  초이스 %s  소스 : %s", sideMenu, beverage, choice, sauce));									
			} else {
				optionLabel.setText(String.format("     └ 사이드 : %s  음료 : %s  초이스 %s  소스 : %s", sideMenu, beverage, choice, sauce));									
			}

		} else if (code >= 200 && code < 400) {

			optionLabel.setText(String.format("     └ %s  사이드 : %s  음료 : %s  소스 : %s", mari, sideMenu, beverage, sauce));
		} else if (code >= 400 && code < 500) {
			// 신메뉴
			
			optionLabel.setText(String.format("     └ null"));
		} else if (code >= 500 && code < 600) {
			// 사이드
			
			optionLabel.setText(String.format("     └ 옵션선택불가"));
		} else if (code >= 600 && code < 700) {
			// 음료
			
			optionLabel.setText(String.format("     └ 사이즈 : %s", beverageSize));
		} else if (code >= 700 && code < 800) {
			// 맘스세트
			
			optionLabel.setText(String.format("     └ 옵션선택불가"));					
		} else {
			System.out.println("존재하지 않는 코드");
		}
	}
	
	public void lock() {
		removeMenuButton.setVisible(false);
	}
	
	public void unlock() {
		removeMenuButton.setVisible(true);
	}

//	public static void main(String[] args) {
//		JFrame f = new JFrame();
////		JLabel label = new JLabel();
////		label.setBounds(100, 100, 100, 100);
////		label.setText("test");
////		f.add(label);
////		f.setName("레이블이름");
////		System.out.println(f.getName());
//		
//		f.add(new SelectedBurgerInfo());
//		
//		f.setLayout(null);
//		f.setSize(500, 500);
//		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
		

	
	

	public String getSideMenu() {
		return sideMenu;
	}

	public void setSideMenu(String sideMenu) {
		this.sideMenu = sideMenu;
	}
	
	public int getCode() {
		return code;
	}

	public String getMari() {
		return mari;
	}

	public void setMari(String mari) {
		this.mari = mari;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public boolean isCombo() {
		return combo;
	}


	public void setCombo(boolean combo) {
		this.combo = combo;
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


	public JLabel getMenuLabel() {
		return menuLabel;
	}

	public void setMenuLabel(JLabel menuLabel) {
		this.menuLabel = menuLabel;
	}

	public JLabel getOptionLabel() {
		return optionLabel;
	}


	public void setOptionLabel(JLabel optionLabel) {
		this.optionLabel = optionLabel;
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

	


	
	
}
