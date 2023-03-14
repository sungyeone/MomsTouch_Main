package order_page.component.button.category_button;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import order_page.OrderPanel;
import order_page.component.panel.BonelessChickenChoicePanel;
import tool.FontTool;

public class BonelessChicken_Button extends JButton {
	
	public BonelessChicken_Button (OrderPanel op, CardLayout pages, JPanel bonelessChickenChoicePanel) {
		
		setText("순살치킨");
		setFont(FontTool.nanumSquare(16f));
		//setFont(new Font("HY헤드라인M", Font.BOLD, 14));
		setContentAreaFilled(false);	
		setFocusPainted(false);
		setBackground(new Color(190, 190, 190));
		setForeground(new Color(70, 50, 41));
		Border border = BorderFactory.createLineBorder(Color.white, 2);
	    setBorder(border); 
		setBounds(446, 187, 90, 43);
		setOpaque(true);
		    
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.moveToBonelessChickenChoicePanel();
				op.allCategoryBtnOff();
				setBackground(Color.white);
				pages.first(bonelessChickenChoicePanel);
				
			}
		});
		
	}
		
}
