package order_page.component.button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import tool.FontTool;

public class PackagingButton extends JButton {
	
	public PackagingButton() {
		
		setText("포장");
		setFont(FontTool.boldNanumSquare(14f));
		//setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		
		setContentAreaFilled(false);	
		setBackground(Color.white);
		Border border = BorderFactory.createLineBorder(new Color(243, 156, 18), 3);
		setForeground(new Color(243, 156, 18));
	    setBorder(border); 
	    setOpaque(true);
	    
		setBounds(299, 20, 80, 35);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				main.packing = true;
//				categoryLabel.setPacking();
				
			}
		});
		
	}
		  
	}


