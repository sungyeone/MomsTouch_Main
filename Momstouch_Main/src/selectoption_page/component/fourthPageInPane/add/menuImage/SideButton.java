package selectoption_page.component.fourthPageInPane.add.menuImage;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import selectoption_page.component.GetOpt;
import selectoption_page.component.fourthPageInPane.add.menuInfo.SideInfo;

public class SideButton extends JButton{
	
	boolean checked;
	CheckLabel check;
	GetOpt getOpt = new GetOpt();
	public SideButton(SideInfo[] sideInfo, int num) {
		check = new CheckLabel();
		BufferedImage bufferedImage;
		
		String sidePath = sideInfo[num].getSidePath();
		
		try {
			bufferedImage = ImageIO.read(new File(sidePath));
			Image scaledImage = bufferedImage.getScaledInstance(90, 52, Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(scaledImage));
			bufferedImage.flush();
			ImageIO.setUseCache(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setLocation(locationX(num), locationY(num));
		setSize(90, 55);
		setHorizontalAlignment(JLabel.CENTER);
		setBorderPainted(false);
		setFocusPainted(false);
		setContentAreaFilled(false);
		add(check);
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checked == false) {
					check.setVisible(true);
					getOpt.setSide_name(sideInfo[num].getSideName());
					getOpt.setSide_price(sideInfo[num].getPrice());
					checked = true;
				} else if (checked) {
					checked = false;
				}
			}
		});
		setVerticalAlignment(JLabel.TOP);
		setText(null);
		setOpaque(true);
		setBackground(Color.WHITE);
	}
	
	public static int locationX(int num) {
		return (num % 4) * 140 + 30;
	}
	
	public static int locationY(int num) {
		if (num / 4 == 0) {
			return (num / 4) * 100 + 50;
		} else {
			return (num / 4) * 115 + 60;
		}
	}
	
	public boolean getsChecked() {
		return checked;
	}
	
	public void checkTrue() {
		checked = true;
	}
	
	public void checkFalse() {
		checked = false;
	}
	
	public CheckLabel getCheck() {
		return check;
	}
	
	public GetOpt getSideOpt() {
		return getOpt;
	}
}
