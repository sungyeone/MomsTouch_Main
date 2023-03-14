package payment_page;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import tool.FontTool;

public class Sec_CreditCardBtn extends JButton {

	public Sec_CreditCardBtn() {
		
		setText("신용카드");
		// setFont(new Font("굴림", Font.BOLD, 20));
		setFont(FontTool.boldNanumSquare(20f));
		setBounds(386, 385, 163, 52);
		
		setContentAreaFilled(false);
		setBackground(new Color(255, 255, 255));
		
	}
	
	
}
