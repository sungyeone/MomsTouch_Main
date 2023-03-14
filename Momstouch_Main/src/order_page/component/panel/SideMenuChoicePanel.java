package order_page.component.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import database.MenuDAO;
import model.SideMenuInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.BonelessChickenChoiceButton;
import order_page.component.button.menuchoice_button.NextPageButton;
import order_page.component.button.menuchoice_button.PreviousPageButton;
import order_page.component.button.menuchoice_button.SideMenuChoiceButton;

public class SideMenuChoicePanel extends JPanel {
	
	SideMenuInfo[] sideMenuInfo;
	SideMenuChoiceButton[] sideMenuChoiceBtn;
	
	public SideMenuChoicePanel(CardLayout pages, OrderPanel op) {
		
		super(pages);
		sideMenuInfo = MenuDAO.getSideMenuInfo();
		
		int numberOfPage = sideMenuInfo.length % 9 == 0? sideMenuInfo.length / 9 :
			sideMenuInfo.length / 9 + 1;
		
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
		
		
		
		sideMenuChoiceBtn = new SideMenuChoiceButton[sideMenuInfo.length];
		for(int i = 0; i < sideMenuInfo.length; i++) {
			sideMenuChoiceBtn[i] = new SideMenuChoiceButton(sideMenuInfo, i, op);
			for(int j = 0; j < page.length; j++) {
				if(i / 9 == j) {
					page[j].add(sideMenuChoiceBtn[i]);
					break;
				}
			}
		
		}
		
		
		setBounds(0, 240, 600, 425);
		setOpaque(true);
		setBackground(Color.red);
		setVisible(false);
	}
	
	public void lock() {
		for(int i = 0; i < sideMenuInfo.length; i++) {
			sideMenuChoiceBtn[i].setVisible(false);
		}
	}
	
	public void unlock() {
		for(int i = 0; i < sideMenuInfo.length; i++) {
			sideMenuChoiceBtn[i].setVisible(true);
		}
	}
	

}
