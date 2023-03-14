package selectoption_page.component.fourthPageInPane.add.menuImage;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckLabel extends JLabel{
	
	public CheckLabel() {
		try {
			BufferedImage bufferedImage = ImageIO.read(new File("images/label/checkRed.png"));
			Image scaledImage = bufferedImage.getScaledInstance(50, 45, Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(scaledImage));
			bufferedImage.flush();
			ImageIO.setUseCache(false);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		setBounds(20, 0, 50, 50);
		//setHorizontalAlignment(JLabel.CE);
		//setVerticalAlignment(JLabel.TOP);
		setVisible(false);
		setText(null);
	}
}
