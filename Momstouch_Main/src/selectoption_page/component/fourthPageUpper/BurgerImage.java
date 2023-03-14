package selectoption_page.component.fourthPageUpper;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BurgerImage extends JLabel {

	public BurgerImage(String imagePath) {
		try {
			BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
			Image scaledImage = bufferedImage.getScaledInstance(160, 140, Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(scaledImage));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		setBounds(20, 55, 160, 140);
		setBackground(Color.WHITE);
		setText(null);
		setOpaque(true);
	}
}
