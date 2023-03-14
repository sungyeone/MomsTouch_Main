package selectoption_page.component.fourthPageUpper;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TopLabel extends JLabel{
	
	public TopLabel() {
		
		setHorizontalAlignment(JLabel.CENTER);
		setFont(new Font("맑은 고딕", Font.BOLD, 18));
		setForeground(Color.WHITE);
		setBounds(0, 0, 585, 55);
//		setOpaque(true);
//		setBackground(new Color(230, 149, 0));

		BufferedImage bufferedImage;
		   
		   String image = "images\\orangeBar.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(585, 55, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
	
	}
}
