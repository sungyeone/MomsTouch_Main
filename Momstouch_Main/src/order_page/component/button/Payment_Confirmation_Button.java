package order_page.component.button;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import tool.FontTool;

public class Payment_Confirmation_Button extends JButton {

	public Payment_Confirmation_Button() {
		
		setText("결제 확인");
		
		setContentAreaFilled(false);	
		setFocusPainted(false);
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(230, 149, 0));
		setFont(FontTool.boldNanumSquare(17f));
		//setFont(new Font("HY헤드라인M", Font.PLAIN, 16));
		setBounds(408, 905, 177, 60);
		setOpaque(true);
	    
		
	}
}
