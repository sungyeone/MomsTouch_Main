package order_page.component.button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import main_page.MomstouchMainFrame;
import order_page.OrderPanel;
import tool.FontTool;

public class FirstWindowButton extends JButton {
	
	public FirstWindowButton (MomstouchMainFrame main, OrderPanel op) {
		
		setText("첫화면");
		setFont(FontTool.boldNanumSquare(14f));
		setBackground(new Color(243, 156, 18));
		Border border = BorderFactory.createLineBorder(new Color(243, 156, 18), 1);
		
		setContentAreaFilled(false);	
		setForeground(Color.white);
	    setBorder(border); 
		setBounds(483, 20, 80, 35);
		setOpaque(true);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.moveToMainPage();
				op.reset();
				
			}
		});
		

	}
}
