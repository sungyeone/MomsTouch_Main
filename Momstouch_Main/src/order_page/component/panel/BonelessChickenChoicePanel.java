package order_page.component.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import database.MenuDAO;
import model.BonelessChickenInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.BonelessChickenChoiceButton;
import order_page.component.button.menuchoice_button.ChickenChoiceButton;
import order_page.component.button.menuchoice_button.NextPageButton;
import order_page.component.button.menuchoice_button.PreviousPageButton;

public class BonelessChickenChoicePanel extends JPanel {
	
	BonelessChickenInfo[] bonelessChickenInfo;
	BonelessChickenChoiceButton[] bonelessChickenChoiceBtn;
	
	public BonelessChickenChoicePanel(CardLayout pages, OrderPanel op) {
		
		super(pages);
		bonelessChickenInfo = MenuDAO.getBonelessChickenInfo();
		
		int numberOfPage = bonelessChickenInfo.length % 9 == 0? bonelessChickenInfo.length / 9 :
			bonelessChickenInfo.length / 9 + 1;
		
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
		
		
		
		bonelessChickenChoiceBtn = new BonelessChickenChoiceButton[bonelessChickenInfo.length];
		for(int i = 0; i < bonelessChickenInfo.length; i++) {
			bonelessChickenChoiceBtn[i] = new BonelessChickenChoiceButton(bonelessChickenInfo, i, op);
			for(int j = 0; j < page.length; j++) {
				if(i / 9 == j) {
					page[j].add(bonelessChickenChoiceBtn[i]);
					break;
				}
			}
		
		}
		
		setBounds(0, 240, 600, 425);
		setOpaque(true);
		setBackground(Color.yellow);
		setVisible(false);
		
	}
	
	public void lock() {
		for(int i = 0; i < bonelessChickenInfo.length; i++) {
			bonelessChickenChoiceBtn[i].setVisible(false);
		}
	}
	
	public void unlock() {
		for(int i = 0; i < bonelessChickenInfo.length; i++) {
			bonelessChickenChoiceBtn[i].setVisible(true);
		}
	}

}
