package selectsingleorcombo_page;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import model.BurgerInfo;
import tool.FontTool;

public class SetBtn extends JButton {
	
	DecimalFormat dc = new DecimalFormat("###,###,###,###");
	
	public SetBtn(BurgerInfo[] burgerInfo, int num) {
		String comboPrice = dc.format(burgerInfo[num].getCombo_price());
		setText("<html><center>세트<br>" + comboPrice + "</html>");
		//setFont(new Font("HY헤드라인M", Font.PLAIN, 18));
		setFont(FontTool.boldNanumSquare(18f));
		// 테투리 색깔 지정
		Border border = BorderFactory.createLineBorder(new Color(243, 208, 67), 1);
	    setBorder(border); 
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(243, 208, 67));
		setBounds(264, 304, 180, 86);
		
		
	}

}
