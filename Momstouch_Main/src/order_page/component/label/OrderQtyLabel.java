package order_page.component.label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import tool.FontTool;

public class OrderQtyLabel extends JLabel {

	public OrderQtyLabel() {
		
		
		//setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		setFont(FontTool.boldNanumSquare(30f));
		setHorizontalAlignment(JLabel.CENTER);
		setBounds(412, 735, 175, 53);
		setOpaque(true);
		setBackground(Color.white);
		
	}
	@Override
	public String toString() {
		return "2";
	}
}
