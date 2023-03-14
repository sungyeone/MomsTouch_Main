package payment_page;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import tool.FontTool;

public class Sec_StoreBtn extends JButton{

	public Sec_StoreBtn() {
		
		setText("매장");
		setBounds(386, 200, 163, 52);
		// setFont(new Font("굴림", Font.BOLD, 20));
		setFont(FontTool.boldNanumSquare(20f));
		
		setContentAreaFilled(false);
		setBackground(new Color(255, 255, 255));
		
		
	}
	
	
}
