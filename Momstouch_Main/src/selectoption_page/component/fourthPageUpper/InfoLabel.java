package selectoption_page.component.fourthPageUpper;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextArea;

public class InfoLabel extends JTextArea{
	
	public InfoLabel() {
		try {
		       //create the font to use. Specify the size!
		       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(11f);
		       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		       //register the font
		       ge.registerFont(customFont);
		       setFont(customFont);
		   } catch (IOException e) {
		       e.printStackTrace();
		   } catch(FontFormatException e) {
		       e.printStackTrace();
		   }
		setLineWrap(true);
		setEditable(false);
		setBounds(250, 170, 200, 35);
		setBackground(Color.WHITE);
		setOpaque(true);
	}
}
