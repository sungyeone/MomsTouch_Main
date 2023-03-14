package selectoption_page.component.okAndCancel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CancelBtn extends JButton{
	
	public CancelBtn() {
		setText("취소");
		setBounds(20, 650, 180, 86);
		setBorderPainted(false);
		setFocusPainted(false);
     	setFont(new Font("맑은 고딕", Font.BOLD, 20));
     	setForeground(Color.WHITE);
     	setBackground(new Color(70, 50, 41));
	}
}
