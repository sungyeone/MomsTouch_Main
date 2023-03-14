package selectsingleorcombo_page;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import model.BurgerInfo;
import tool.FontTool;

public class SingleBtn extends JButton  {
	
	DecimalFormat dc = new DecimalFormat("###,###,###,###");
	
	public SingleBtn(BurgerInfo[] burgerInfo, int num) {
		String burgerPrice = dc.format(burgerInfo[num].getBurger_price());

		setText("<html><center>단품<br>" + burgerPrice + "</html>");
		//setFont(new Font("HY헤드라인M", Font.PLAIN, 18));
		setFont(FontTool.boldNanumSquare(18f));
		// 테투리 색깔 지정
		Border border = BorderFactory.createLineBorder(new Color(243, 156, 18), 1);
	    setBorder(border); 
		setBackground(new Color(243, 156, 18));
		setForeground(new Color(255, 255, 255));
		setBounds(40, 304, 180, 86);
		
	}

}
