package order_page.component.label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import tool.FontTool;

public class OrderAmountLabel extends JLabel  {

	public OrderAmountLabel() {
		
		
		//setFont(new Font("고딕체", Font.PLAIN, 25));
		setFont(FontTool.boldNanumSquare(25f));
		setHorizontalAlignment(JLabel.CENTER);
		setBounds(410, 817, 175, 53);
		setOpaque(true);
		setBackground(Color.white);
		
		
	}
	
	@Override
	public String toString() {
		return "1";
	}
}
