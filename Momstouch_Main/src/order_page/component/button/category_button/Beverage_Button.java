package order_page.component.button.category_button;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import order_page.OrderPanel;
import tool.FontTool;

public class Beverage_Button extends JButton {
	
	public Beverage_Button(OrderPanel op, CardLayout pages, JPanel beverageChoicePanel) {
		
		setText("음료");
		setFont(FontTool.nanumSquare(16f));
		//setFont(new Font("HY헤드라인M", Font.BOLD, 14));
		setBounds(312, 187, 80, 43);
		
		setContentAreaFilled(false);	
		setFocusPainted(false);
		setBackground(new Color(190, 190, 190));
		setForeground(new Color(70, 50, 41));
		Border border = BorderFactory.createLineBorder(Color.white, 2);
	    setBorder(border);
	    setVisible(false);
	    setOpaque(true);
	    
	    
	    addActionListener(new ActionListener() {

	    	@Override
	    	public void actionPerformed(ActionEvent e) {

	    		op.moveToBeverageChoicePanel();
	    		op.allCategoryBtnOff();
				setBackground(Color.white);
	    		pages.first(beverageChoicePanel);
	    	}
	    });

	}

}
