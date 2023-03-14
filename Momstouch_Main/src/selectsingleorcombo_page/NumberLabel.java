package selectsingleorcombo_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

import tool.FontTool;

public class NumberLabel extends JLabel {

	
	public NumberLabel() {

		setText("1");
		// setFont(new Font("굴림", Font.BOLD, 18));
		setFont(FontTool.boldNanumSquare(18f));
		setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
	    // 테두리선 색깔 지정
	    Border border = BorderFactory.createLineBorder(new Color(190, 190, 190), 2);
	    setBorder(border); 
	    setBounds(320, 90, 63, 45); 
			
	}

}
