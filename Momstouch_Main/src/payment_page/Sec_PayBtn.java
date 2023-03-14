package payment_page;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import tool.FontTool;

public class Sec_PayBtn extends JButton{

	public Sec_PayBtn() {
	
	setText("결제 하기");
	//setFont(new Font("굴림", Font.BOLD, 20));
	setFont(FontTool.boldNanumSquare(20f));
	setBounds(319, 670, 163, 52);
	
	setContentAreaFilled(false);
	setOpaque(true);
	setBorder(BorderFactory.createLineBorder(new Color(230, 149, 0), 1));
	setBackground(new Color(230, 149, 0));
	setForeground(new Color(255, 255, 255));
	
	}
}
