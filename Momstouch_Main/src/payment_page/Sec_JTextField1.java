package payment_page;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JLabel;

import model.selectedoption.SelectedMenuInfo;
import tool.FontTool;

public class Sec_JTextField1 extends JLabel{

	public Sec_JTextField1(List<SelectedMenuInfo> selectedMenus) {
		
		DecimalFormat dc = new DecimalFormat("###,###,###");
		
		int totalPrice = 0;
		for(SelectedMenuInfo selectedMenuInfo : selectedMenus) {
			totalPrice += selectedMenuInfo.getPrice();
		}
		
		String totalAmountOfPayment = dc.format(totalPrice);
		
		setBounds(20, 15, 128, 52);
		setText(totalAmountOfPayment);
		setOpaque(true);
		setBackground(Color.white);
		setHorizontalAlignment(JLabel.CENTER);
		setFont(new Font("", Font.BOLD, 20));
		
		
		
	}
	
}
