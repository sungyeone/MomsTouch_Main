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

import model.MomsSetInfo;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;

public class MomsSetChoiceButton extends JButton{

	public MomsSetChoiceButton(MomsSetInfo[] momsSetInfo, int num, OrderPanel op) {
		
		BufferedImage bufferedImage;

		//String burgerImagePath = burgerInfo[num].getBurger_image_link();
		String momsSetImagePath = momsSetInfo[num].getMoms_set_link2();

		try {
			bufferedImage = ImageIO.read(new File(momsSetImagePath));
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
				int momsSetCode = momsSetInfo[num].getMoms_set_code();
				String momsSetName = momsSetInfo[num].getMoms_set_name();
				int momsSetPrice = momsSetInfo[num].getMoms_set_price();
				
				SelectedMenuInfo selectedMenuInfo = new SelectedMenuInfo();
				selectedMenuInfo.setCode(momsSetCode);
				selectedMenuInfo.setName(momsSetName);
				selectedMenuInfo.setPrice(momsSetPrice);
				
				op.addSelectedMenu(selectedMenuInfo);

			}
		});


		setSize(180, 160);



		//setLocation(40 + num % 3 * 180, 20 + num / 3 % 3 * 140);//50 + (num / 3 % 2 == 0 ? 0 : 1) * 150);
		//setLocation(40 + num % 3 * 162, 0 + num / 3 % 3 * 144);
		setLocation(5 + num % 3 * 198 , 0 + num / 3 % 3 * 144);
		setOpaque(true);
		setBackground(Color.white);
	}
}
