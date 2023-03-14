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

import model.BurgerInfo;
import order_page.OrderPanel;
import selectsingleorcombo_page.SelectSingleOrComboFrame;

public class BurgerChoiceButton extends JButton{
	
	public BurgerChoiceButton(BurgerInfo[] burgerInfo, int num, OrderPanel op) {
		
		
		BufferedImage bufferedImage;
		
			//String burgerImagePath = burgerInfo[num].getBurger_image_link();
			String burgerImagePath = burgerInfo[num].getBurger_image_link2();
			
			try {
				bufferedImage = ImageIO.read(new File(burgerImagePath));
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
				op.lock();
				new SelectSingleOrComboFrame(burgerInfo, num, op);
				
			}
		});
		
		
		setSize(180, 160);
		

		
		//setLocation(40 + num % 3 * 180, 20 + num / 3 % 3 * 140);//50 + (num / 3 % 2 == 0 ? 0 : 1) * 150);
		setLocation(5 + num % 3 * 198 , -10 + num / 3 % 3 * 144);
		setOpaque(true);
		setBackground(Color.white);
	}
}
