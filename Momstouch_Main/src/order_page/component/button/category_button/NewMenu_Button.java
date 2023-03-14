package order_page.component.button.category_button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import order_page.OrderPanel;
import tool.FontTool;

public class NewMenu_Button extends JButton {
	
	
	public NewMenu_Button (OrderPanel op) {
		
		setText("신메뉴");
		setFont(FontTool.nanumSquare(16f));
		
		setContentAreaFilled(false);	
		setForeground(new Color(70, 50, 41));
		setBackground(new Color(190, 190, 190));
		Border border = BorderFactory.createLineBorder(Color.white, 2);
	    setBorder(border); 
	    setFocusPainted(false);
		setBounds(38, 189, 80, 43);
		setOpaque(true);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//setBackground(Color.white);
				op.allCategoryBtnOff();
				setBackground(Color.white);
				op.moveToNewMenuChoicePanel();
				
			}
		});
		
		
		
		
		
		
	}
	
}
