package order_page.component.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import database.MenuDAO;
import model.MomsSetInfo;
import order_page.OrderPanel;
import order_page.component.button.menuchoice_button.MomsSetChoiceButton;
import order_page.component.button.menuchoice_button.NextPageButton;
import order_page.component.button.menuchoice_button.PreviousPageButton;
import order_page.component.button.menuchoice_button.SideMenuChoiceButton;

public class MomsSetChoicePanel extends JPanel {
	
	MomsSetInfo[] momsSetInfo;
	MomsSetChoiceButton[] momsSetChoiceBtn;
	
	public MomsSetChoicePanel(CardLayout pages, OrderPanel op) {
		
		super(pages);
		momsSetInfo = MenuDAO.getMomsSetInfo();
		
		int numberOfPage = momsSetInfo.length % 9 == 0? momsSetInfo.length / 9 :
			momsSetInfo.length / 9 + 1;
		
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
		
		
		
		momsSetChoiceBtn = new MomsSetChoiceButton[momsSetInfo.length];
		for(int i = 0; i < momsSetInfo.length; i++) {
			momsSetChoiceBtn[i] = new MomsSetChoiceButton(momsSetInfo, i, op);
			for(int j = 0; j < page.length; j++) {
				if(i / 9 == j) {
					page[j].add(momsSetChoiceBtn[i]);
					break;
				}
			}
		
		}
		
		
		setBounds(0, 240, 600, 425);
		setOpaque(true);
		setBackground(Color.black);
		setVisible(false);
	
		
	}
	
	public void lock() {
		for(int i = 0; i < momsSetInfo.length; i++) {
			momsSetChoiceBtn[i].setVisible(false);
		}
	}
	
	public void unlock() {
		for(int i = 0; i < momsSetInfo.length; i++) {
			momsSetChoiceBtn[i].setVisible(true);
		}
	}

}
