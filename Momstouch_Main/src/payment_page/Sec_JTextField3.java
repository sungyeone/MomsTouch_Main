package payment_page;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.selectedoption.SelectedMenuInfo;
import tool.FontTool;

public class Sec_JTextField3 extends JLabel{

public Sec_JTextField3(List<SelectedMenuInfo> selectedMenus) {
	
	DecimalFormat dc = new DecimalFormat("###,###,###");
	
	int totalPrice = 0;
	for(SelectedMenuInfo selectedMenuInfo : selectedMenus) {
		totalPrice += selectedMenuInfo.getPrice();
	}
	
	String totalAmountOfPayment = dc.format(totalPrice);
	
	setBounds(30, 15, 128, 52);
	setText(totalAmountOfPayment);
	setOpaque(true);
	setBackground(Color.white);
	setHorizontalAlignment(JLabel.CENTER);
	setFont(new Font("", Font.BOLD, 20));
	setForeground(new Color(230, 149, 0));
}
	
}
