package payment_page.PayWithCardPage.component.labels;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LoadingGif extends JLabel {
	
	Image image;
	public LoadingGif() {
		Icon imgIcon = new ImageIcon(new ImageIcon("images/loading.gif")
				.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		
		
		setIcon(imgIcon);
		setBounds(200, 470, 200, 100);
		setVisible(false);
		setOpaque(true);
		setBackground(Color.white);
		
		
		
		
	}

}