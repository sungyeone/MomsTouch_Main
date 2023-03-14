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
import javax.swing.border.Border;

import order_page.OrderPanel;
import order_page.component.label.CategoryLabel;

public class PreviousCategoryButton extends JButton {
	
	public PreviousCategoryButton() {

		setBounds(5, 187, 30, 30);
		setBackground(new Color(205, 199, 187));
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		Border border = BorderFactory.createLineBorder(new Color(205, 199, 187), 1);
		setBorder(border); 
		setVisible(false);

		BufferedImage bufferedImage;

		String image = "images/반대카테고리화살표.png";

		try {
			bufferedImage = ImageIO.read(new File(image));
			Image scaledImage =
					bufferedImage.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
			setIcon(new ImageIcon(scaledImage));
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
