package order_page.component.button.category_button;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class NextCategoryButton extends JButton {

	public NextCategoryButton() {
		
		setBounds(540, 187, 50, 43);
		setBackground(new Color(205, 199, 187));
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		Border border = BorderFactory.createLineBorder(new Color(205, 199, 187), 1);
		setBorder(border); 
		
		   BufferedImage bufferedImage;
		   
		   String image = "images/카테고리화살표.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }	      
		      
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				c.moveToNextCategories();
				
			}
		});   
		
		
		
	}

}
