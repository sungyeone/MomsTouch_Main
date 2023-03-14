package selectoption_page.component.fourthPageUpper;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import tool.FontTool;

public class MinusButton extends JButton{
	
	public MinusButton(JLabel label) {
		setText("-");
		setBounds(251, 115, 50, 45);
      	setFont(FontTool.boldNanumSquare(30f));
      	setBorderPainted(false);
		setFocusPainted(false);
      	setBackground(new Color(196, 198, 197));
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
