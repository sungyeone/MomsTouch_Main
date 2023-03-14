package selectsingleorcombo_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import tool.FontTool;

public class MinusBtn extends JButton {
	
	
	public MinusBtn(NumberLabel label) {
		
		setText("-");
		// setFont(new Font("휴먼엑스포", Font.BOLD, 37));
		setFont(FontTool.boldNanumSquare(37f));
		setBackground(new Color(190, 190, 190));
		setBounds(267, 90, 50, 45);
		setFocusPainted(false);
		Border border = BorderFactory.createLineBorder(new Color(190, 190, 190), 1);
		setBorder(border);
		
		addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(label.getText()) - 1;
				if(label.getText().equals("" + 1)) {
					return;  
				}
		
				label.setText("" + num);
			    
			}
		});
		
	}

}
