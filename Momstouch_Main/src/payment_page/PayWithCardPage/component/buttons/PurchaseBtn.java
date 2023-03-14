package payment_page.PayWithCardPage.component.buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import tool.FontTool;

public class PurchaseBtn extends JButton {
	
	public PurchaseBtn() {
		
		setText("<html><center>결제<br>purchase</center></html>");
		// setFont(new Font("HY헤드라인M", Font.BOLD, 17));
		setFont(FontTool.boldNanumSquare(17f));
		setBackground(new Color(243, 156, 18));
		setBounds(70, 500, 150, 70);
		setVisible(false);
	}
}
