package selectsingleorcombo_page;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class LineLabel extends JLabel {
	
	public LineLabel() {
		
		setOpaque(true); // 라벨 배경색 바꾸기 위한 것 
		setBackground(new Color(243, 156, 18));
		setBounds(0, 0, 484, 51);
		
		setIcon(new ImageIcon("images\\orangeBar.png"));
		setVerticalTextPosition(SwingConstants.CENTER);
		setHorizontalTextPosition(SwingConstants.CENTER);
		
	}

	@Override
	public String toString() {
		return "3";
	}
}
