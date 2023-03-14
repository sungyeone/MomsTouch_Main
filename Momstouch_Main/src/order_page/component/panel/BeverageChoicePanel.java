package order_page.component.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import database.MenuDAO;
import model.BeverageInfo;
import model.SideMenuInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.BeverageChoiceButton;
import order_page.component.button.menuchoice_button.NextPageButton;
import order_page.component.button.menuchoice_button.PreviousPageButton;

public class BeverageChoicePanel extends JPanel {
	
	BeverageInfo[] beverageInfo;
	private static BeverageInfo[] beverageInfo2;
	BeverageChoiceButton[] beverageChoiceBtn;
	
	public BeverageChoicePanel(CardLayout pages, OrderPanel op) {
		
		super(pages);
		beverageInfo = MenuDAO.getBeverageInfo();
		
		int numberOfPage = beverageInfo.length % 9 == 0? beverageInfo.length / 9 :
			beverageInfo.length / 9 + 1;
		
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
		
		
		
		beverageChoiceBtn = new BeverageChoiceButton[beverageInfo.length];
		for(int i = 0; i < beverageInfo.length; i++) {
			beverageChoiceBtn[i] = new BeverageChoiceButton(beverageInfo, i, op);
			for(int j = 0; j < page.length; j++) {
				if(i / 9 == j) {
					page[j].add(beverageChoiceBtn[i]);
					break;
				}
			}
		
		}
		
		
		setBounds(0, 240, 600, 425);
		setOpaque(true);
		setBackground(Color.green);
		setVisible(false);
	}
	
	public void lock() {
		for(int i = 0; i < beverageInfo.length; i++) {
			beverageChoiceBtn[i].setVisible(false);
		}
	}
	
	public void unlock() {
		for(int i = 0; i < beverageInfo.length; i++) {
			beverageChoiceBtn[i].setVisible(true);
		}
	}
	

}
