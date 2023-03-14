package order_page.component.button.menuchoice_button;

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

import model.BonelessChickenInfo;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;
import selectoption_page.component.BonelessChickenFrame;

public class BonelessChickenChoiceButton extends JButton{

	
	public BonelessChickenChoiceButton(BonelessChickenInfo[] bonelessChickenInfo, int num, OrderPanel op) {

		BufferedImage bufferedImage;

		//String burgerImagePath = burgerInfo[num].getBurger_image_link();
		String bonelessChickenImagePath = bonelessChickenInfo[num].getBoneless_chicken_image_link2();

		try {
			bufferedImage = ImageIO.read(new File(bonelessChickenImagePath));
			Image scaledImage =
					bufferedImage.getScaledInstance(144, 128, Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(scaledImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);


		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int bonelessChickenCode = bonelessChickenInfo[num].getBoneless_chicken_code();
				String bonelessChickenName = bonelessChickenInfo[num].getBoneless_chicken_name();
				int bonelessChickenPrice = bonelessChickenInfo[num].getBoneless_chicken_price();
				
				SelectedMenuInfo selectedMenuInfo = new SelectedMenuInfo();
				selectedMenuInfo.setCode(bonelessChickenCode);
				selectedMenuInfo.setName(bonelessChickenName);
				selectedMenuInfo.setPrice(bonelessChickenPrice);
				
				new BonelessChickenFrame(bonelessChickenInfo, num, op, selectedMenuInfo);
				op.lock();

			}
		});


		setSize(180, 160);



		//setLocation(40 + num % 3 * 180, 20 + num / 3 % 3 * 140);//50 + (num / 3 % 2 == 0 ? 0 : 1) * 150);
		//setLocation(40 + num % 3 * 162, 0 + num / 3 % 3 * 144);
		setLocation(5 + num % 3 * 198 , -10 + num / 3 % 3 * 144);
		setOpaque(true);
		setBackground(Color.white);
	}
	
}
