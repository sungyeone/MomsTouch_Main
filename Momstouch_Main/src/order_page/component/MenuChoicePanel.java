package order_page.component;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import order_page.component.panel.BeverageChoicePanel;
import order_page.component.panel.BonelessChickenChoicePanel;
import order_page.component.panel.BurgerChoicePanel;
import order_page.component.panel.ChickenChoicePanel;
import order_page.component.panel.MomsSetChoicePanel;
import order_page.component.panel.NewMenuChoicePanel;
import order_page.component.panel.SideMenuChoicePanel;

public class MenuChoicePanel extends JPanel{
	
	
	
	
	
	public MenuChoicePanel(CardLayout categoryCard) {
		super(categoryCard);
		
		//setLayout(null);
		setBounds(0, 240, 600, 460);
		setOpaque(true);
		setBackground(Color.black);
		setVisible(true);
		
		
	}
}
