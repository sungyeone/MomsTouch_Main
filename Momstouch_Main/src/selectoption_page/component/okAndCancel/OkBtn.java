package selectoption_page.component.okAndCancel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class OkBtn extends JButton {

	public OkBtn() {
		setText("확인");
		setBounds(264, 650, 180, 86);
		setBorderPainted(false);
		setFocusPainted(false);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setForeground(Color.WHITE);
		setBackground(new Color(230, 149, 0));
	}
}
