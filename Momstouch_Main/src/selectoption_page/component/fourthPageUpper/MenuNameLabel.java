package selectoption_page.component.fourthPageUpper;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuNameLabel extends JLabel{
	
	public MenuNameLabel() {
		
		setText("");
		setBounds(250, 35, 200, 80);
        setBackground(Color.WHITE);
        try {
		       //create the font to use. Specify the size!
		       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(17f);
		       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		       //register the font
		       ge.registerFont(customFont);
		       setFont(customFont);
		   } catch (IOException e) {
		       e.printStackTrace();
		   } catch(FontFormatException e) {
		       e.printStackTrace();
		   }
        
        setOpaque(true);
	}
}
