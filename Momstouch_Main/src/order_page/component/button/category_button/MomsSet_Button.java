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

public class MomsSet_Button extends JButton {
	
	public MomsSet_Button(OrderPanel op, CardLayout pages, JPanel momsSetChoicePanel) {
		
		setText("맘스세트");
		setFont(FontTool.nanumSquare(16f));
		
		setContentAreaFilled(false);	
		setForeground(new Color(70, 50, 41));
		setBackground(new Color(190, 190, 190));
		Border border = BorderFactory.createLineBorder(Color.white, 2);
	    setBorder(border); 
	    setFocusPainted(false);
		setBounds(38, 187, 80, 43);
		setVisible(false);
		setOpaque(true);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.moveToMomsSetChoicePanel();
				op.allCategoryBtnOff();
				setBackground(Color.white);
				pages.first(momsSetChoicePanel);
				
			}
		});
			
	}


}
