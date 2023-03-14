package order_page.component.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import database.MenuDAO;
import model.BurgerInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.BurgerChoiceButton;
import order_page.component.button.menuchoice_button.NextPageButton;
import order_page.component.button.menuchoice_button.PreviousPageButton;

public class BurgerChoicePanel extends JPanel {
	
	BurgerInfo[] burgerInfo;
	BurgerChoiceButton[] burgerChoiceBtn;
	
		
	public BurgerChoicePanel(CardLayout pages, OrderPanel op) {
		super(pages);
		burgerInfo = MenuDAO.getBurgerInfo();
		
		int numberOfPage = burgerInfo.length % 9 == 0? burgerInfo.length / 9 :
			burgerInfo.length / 9 + 1;
		
		JLabel[] page = new JLabel[numberOfPage];
		
		for(int i = 0; i < numberOfPage; i++) {
			page[i] = new JLabel();
			if(i != numberOfPage - 1) {
				page[i].add(new NextPageButton(this, pages));				
			}
			if(i != 0) {
				page[i].add(new PreviousPageButton(this, pages));				
			}
			page[i].setLayout(null);
			page[i].setOpaque(true);
			page[i].setBackground(Color.white);
			//page[i].setBounds(0, 0, 600, 460);
			add("" + i, page[i]);
		}
		
		
		
		burgerChoiceBtn = new BurgerChoiceButton[burgerInfo.length];
		for(int i = 0; i < burgerInfo.length; i++) {
			burgerChoiceBtn[i] = new BurgerChoiceButton(burgerInfo, i, op);
			for(int j = 0; j < page.length; j++) {
				if(i / 9 == j) {
					page[j].add(burgerChoiceBtn[i]);
					break;
				}
			}
		
		}
		
		
		
		//setLayout(null);
		setBounds(0, 240, 600, 500);
		setOpaque(true);
		setBackground(Color.green);
		setVisible(false);
	
		
	}
	
	public void lock() {
		for(int i = 0; i < burgerInfo.length; i++) {
			burgerChoiceBtn[i].setVisible(false);
		}
	}
	
	public void unlock() {
		for(int i = 0; i < burgerInfo.length; i++) {
			burgerChoiceBtn[i].setVisible(true);
		}
	}
	
	
	

}
