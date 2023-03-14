package order_page.component.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import database.MenuDAO;
import model.ChickenInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.BurgerChoiceButton;
import order_page.component.button.menuchoice_button.ChickenChoiceButton;
import order_page.component.button.menuchoice_button.NextPageButton;
import order_page.component.button.menuchoice_button.PreviousPageButton;

public class ChickenChoicePanel extends JPanel {
	
	ChickenInfo[] chickenInfo;
	ChickenChoiceButton[] chickenChoiceBtn;
	
	public ChickenChoicePanel(CardLayout pages, OrderPanel op) {
		
		super(pages);
		chickenInfo = MenuDAO.getChickenInfo();
		
		int numberOfPage = chickenInfo.length % 9 == 0? chickenInfo.length / 9 :
			chickenInfo.length / 9 + 1;
		
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
		
		
		
		chickenChoiceBtn = new ChickenChoiceButton[chickenInfo.length];
		for(int i = 0; i < chickenInfo.length; i++) {
			chickenChoiceBtn[i] = new ChickenChoiceButton(chickenInfo, i, op);
			for(int j = 0; j < page.length; j++) {
				if(i / 9 == j) {
					page[j].add(chickenChoiceBtn[i]);
					break;
				}
			}
		
		}
		
		setBounds(0, 240, 600, 425);
		setOpaque(true);
		setBackground(Color.orange);
		setVisible(false);
	}
	
	public void lock() {
		for(int i = 0; i < chickenInfo.length; i++) {
			chickenChoiceBtn[i].setVisible(false);
		}
	}
	
	public void unlock() {
		for(int i = 0; i < chickenInfo.length; i++) {
			chickenChoiceBtn[i].setVisible(true);
		}
	}

}
