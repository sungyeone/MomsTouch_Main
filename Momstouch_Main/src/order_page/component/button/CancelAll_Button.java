package order_page.component.button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import order_page.OrderPanel;
import tool.FontTool;

public class CancelAll_Button extends JButton {
	
	public CancelAll_Button(OrderPanel op) {
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				op.cancelAll();
				
			}
		});
		
		setText("전체 취소");
		
		setContentAreaFilled(false);	
		setFocusPainted(false);
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(70, 50, 41));
		setFont(FontTool.boldNanumSquare(17f));
		//setFont(new Font("HY헤드라인M", Font.PLAIN, 16));
		setBounds(408, 870, 177, 40);
		setOpaque(true);
	
	
	}
}
