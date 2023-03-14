package selectoption_page.component.fourthPageInPane.add.menuText;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;

import selectoption_page.component.fourthPageInPane.add.menuInfo.SideInfo;

public class SetSidePriceLabel extends JLabel{
	
	public SetSidePriceLabel(SideInfo[] sideInfo, int num) {
		
		setLocation(locationX(num), locationY(num));
		setSize(100, 15);

		int originPrice = sideInfo[0].getPrice();
		int sidePrice = sideInfo[num].getPrice();
		sidePrice = sidePrice - originPrice;
		if (sidePrice >= 0) {
			setText("+" + String.valueOf(sidePrice));
		} else if(sidePrice < 0) {
			setText(String.valueOf(sidePrice));
		}
		
		try {
		       //create the font to use. Specify the size!
		       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(11f);
		       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		       //register the font
		       ge.registerFont(customFont);
//		       setFont(customFont);
		   } catch (IOException e) {
		       e.printStackTrace();
		   } catch(FontFormatException e) {
		       e.printStackTrace();
		   }
		setHorizontalAlignment(JLabel.CENTER);
		setBackground(Color.WHITE);
		setOpaque(true);
	}
	
	public static int locationX(int num) {
		return (num % 4) * 140 + 25;
	}
	
	public static int locationY(int num) {
		if (num / 4 == 0) {
			return (num / 4) * 100 + 130;
		} else {
			return (num / 4) * 115 + 140;
		}
	}
}
