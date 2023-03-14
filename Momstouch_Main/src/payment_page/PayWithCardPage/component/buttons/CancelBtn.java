package payment_page.PayWithCardPage.component.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import tool.FontTool;

public class CancelBtn extends JButton {

	public CancelBtn() {
		
		setText("<html><center>취소<br>cancel</center></html>");
		// setFont(new Font("HY헤드라인M", Font.BOLD, 17));
		setFont(FontTool.boldNanumSquare(17f));
		setBackground(new Color(128,0,0));
		setForeground(new Color(255,255,255));
		setBounds(270, 500, 150, 70);
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setVisible(false);
	}
}
