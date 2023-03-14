package order_page.component.button;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

import tool.FontTool;

public class EatInButton extends JButton {
	
	
	
	public EatInButton() {
		//JButton stobtn = new JButton("매장");
		setText("매장");
		setFont(FontTool.boldNanumSquare(14f));
		
		setContentAreaFilled(false);	
		setBackground(new Color(243, 156, 18));
		setForeground(Color.white);
		Border border = BorderFactory.createLineBorder(new Color(243, 156, 18), 1);
		setBorder(border);
		setOpaque(true);
		
		
		setBounds(391, 20, 80, 35);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				main.packing = false;
//				categoryLabel.setEatin();
				
			}
		});

	
	}
}
