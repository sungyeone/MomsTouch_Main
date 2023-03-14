package selectoption_page.component.fourthPageUpper;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class AmountLabel extends JLabel{
		
	public AmountLabel() {
		
		Border border = BorderFactory.createLineBorder(new Color(190, 190, 190), 2);
		setBorder(border);
		setText("2");
		setBackground(Color.WHITE);
        setHorizontalAlignment(JLabel.CENTER);
        setForeground(Color.BLACK);
        setBounds(305, 115, 85, 45);
        setFont(new Font("맑은 고딕", Font.BOLD, 20));
        setOpaque(true);
	}
}
