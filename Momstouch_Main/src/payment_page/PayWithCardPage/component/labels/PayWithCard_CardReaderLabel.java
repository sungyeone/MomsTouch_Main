package payment_page.PayWithCardPage.component.labels;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import database.OrderHistoryDAO;
import payment_page.PaymentPage;
import payment_page.PayWithCardPage.PayWithCardFrame;

public class PayWithCard_CardReaderLabel extends JLabel {
	
	Image image;
	int count = 0;
	
	public PayWithCard_CardReaderLabel(JLabel bottom_label, JLabel loading_gif, JLabel process, 
			PayWithCardFrame f, PaymentPage paymentPage) {
		Icon imgIcon = new ImageIcon(new ImageIcon("images/insert_card3.gif").
				getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT));

		setIcon(imgIcon);
		setBounds(110, 180, 300, 300);
		setOpaque(true);
		setBackground(Color.white);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bottom_label.setVisible(false);
				// purchase_button.setVisible(false);
				// cancel_button.setVisible(false);
				process.setVisible(true);
				loading_gif.setVisible(true);
				//Progressing_Gif.setVisible(true);

				int delay = 5000;
				
				Timer timer = new Timer(delay, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(count == 0) {
							f.dispose();
							paymentPage.paymentCompletion();							
						}
						count++;
					}
				});

				timer.start();
				if(count != 0) {
					timer.stop();
				}
				
				
				int delay2 = 12000;

				Timer timer2 = new Timer(delay2, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(count < 3) {
							OrderHistoryDAO.addOrderHistory(paymentPage.getSelectedMenus());
							paymentPage.reset();							
						}
						count++;
					}
				});

				timer2.start();	
				if(count >= 3) {
					timer2.stop();
				}
				
				
				
				


			}



		});
	}
}
