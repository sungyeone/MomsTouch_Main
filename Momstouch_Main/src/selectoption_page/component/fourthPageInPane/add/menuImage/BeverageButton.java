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
import selectoption_page.component.fourthPageInPane.add.menuInfo.BeverageInfo;

public class BeverageButton extends JButton {
	
	boolean checked;
	CheckLabel check;
	GetOpt getOpt;
	
	public BeverageButton(BeverageInfo[] beverageInfo, int num) {
		getOpt = new GetOpt();
		check = new CheckLabel();
		BufferedImage bufferedImage;

		String beveragePath = beverageInfo[num].getBeveragePath();

		try {
			bufferedImage = ImageIO.read(new File(beveragePath));
			Image scaledImage = bufferedImage.getScaledInstance(95, 60, Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(scaledImage));
			ImageIO.setUseCache(false);
			bufferedImage.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		setLocation(locationX(num), locationY(num));
		setSize(95, 65);
		setHorizontalAlignment(JLabel.CENTER);
		setBorderPainted(false);
		setFocusPainted(false);
		setContentAreaFilled(false); // 버튼 눌렀을 때 누르는 표시 없애주기
		add(check);
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checked == false) {
					check.setVisible(true);
					getOpt.setBeverage_name(beverageInfo[num].getBeverageName());
					getOpt.setBeverage_price(beverageInfo[num].getPrice());
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
	
	public boolean getbChecked() {
		return checked;
	}

	public void checkFalse() {
		checked = false;
	}

	public CheckLabel getCheck() {
		return check;
	}

	public GetOpt getBeverageOpt() {
		return getOpt;
	}
}
