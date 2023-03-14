package payment_page;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.selectedoption.SelectedMenuInfo;
import tool.FontTool;

public class Sec_JTextField2 extends JLabel{

	public Sec_JTextField2(List<SelectedMenuInfo> selectedMenus) {

		setBounds(20, 15, 128, 52);
		setText("0");
		setOpaque(true);
		setBackground(Color.white);
		setHorizontalAlignment(JLabel.CENTER);
		setFont(new Font("", Font.BOLD, 20));

	
	}
	
	
}
