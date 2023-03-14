package payment_page;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import tool.FontTool;

public class Sec_CancelBtn extends JButton{

	public Sec_CancelBtn() {
		
		setText("결제 취소");
		// setFont(new Font("굴림", Font.BOLD, 20));
		setFont(FontTool.boldNanumSquare(20f));
		setBounds(99, 670, 163, 52);
		
		setContentAreaFilled(false);
		setOpaque(true); 
		setBorder(BorderFactory.createLineBorder(new Color(70, 50, 41), 1));
		setBackground(new Color(70, 50, 41));
		setForeground(new Color(255, 255, 255));
		
	}
	
}
