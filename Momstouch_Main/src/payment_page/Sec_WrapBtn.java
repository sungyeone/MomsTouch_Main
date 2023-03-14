package payment_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import tool.FontTool;



public class Sec_WrapBtn extends JButton{
	
	public Sec_WrapBtn() {

	setText("포장");
	// setFont(new Font("굴림", Font.BOLD, 20));
	setFont(FontTool.boldNanumSquare(20f));
	setBounds(386, 120, 163, 52);
	
	setContentAreaFilled(false);
	setBackground(new Color(255, 255, 255));
	
	
	
	}
}
