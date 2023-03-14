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
import tool.FontTool;

public class Side_Button extends JButton {
	
	public Side_Button(OrderPanel op, CardLayout pages, JPanel sideMenuChoicePanel) {

		setText("사이드");
		setFont(FontTool.nanumSquare(16f));
		setBounds(174, 187, 80, 43);
		
		setContentAreaFilled(false);	
		setBackground(new Color(190, 190, 190));
		setForeground(new Color(70, 50, 41));
		Border border = BorderFactory.createLineBorder(Color.white, 2);
	    setBorder(border); 
	    setFocusPainted(false);
	    setVisible(false);
	    setOpaque(true);
	    
	    addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.moveToSideMenuChoicePanel();
				op.allCategoryBtnOff();
				setBackground(Color.white);
				pages.first(sideMenuChoicePanel);
			}
		});
	    
	}

}
