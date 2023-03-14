package main_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import order_page.OrderPanel;
import tool.FontTool;

public class FirstWindowPanel extends JPanel{
	
	JLabel mainPageAdLabel = new JLabel();
	JLabel forHereOrToGoLabel = new JLabel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	
	ForHereOrToGoBtn btn;
	
	public FirstWindowPanel(MomstouchMainFrame mainFrame, OrderPanel orderPanel) {
	
		setBounds(0, 0, 600, 1000);
		
		mainPageAdLabel.setBounds(0, 0, 600, 740);
		add(forHereOrToGoLabel);
		add(mainPageAdLabel);

		for(int i = 0; i < 2; i++) {
			forHereOrToGoLabel.add(btn = new ForHereOrToGoBtn(mainFrame, i, orderPanel));
		}

		Image scaledImage = null;
		try {
			BufferedImage bufferedImage = ImageIO.read(new File("images/TDay싸이버거.png"));
			scaledImage =
					bufferedImage.getScaledInstance(600, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}      

		mainPageAdLabel.setIcon(new ImageIcon(scaledImage));
		
		label.setBounds(0, 15, 600, 60);
		label.setOpaque(true);
		label.setBackground(new Color(70, 50, 41));
		label.setText("카드전용 주문기기입니다.");
		//label.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		label.setFont(FontTool.boldNanumSquare(32f));
		label.setForeground(Color.white);
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		label2.setBounds(0, 60, 600, 40);
		label2.setOpaque(true);
		label2.setBackground(new Color(70, 50, 41));
		label2.setText("현금 및 기타 결제는 카운터에서 진행해주세요");
		// label2.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		label2.setFont(FontTool.boldNanumSquare(17f));
		label2.setForeground(Color.red);
		label2.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		forHereOrToGoLabel.add(label2);
		forHereOrToGoLabel.add(label);

		forHereOrToGoLabel.setBounds(0, 690, 600, 310);
		forHereOrToGoLabel.setOpaque(true);
		forHereOrToGoLabel.setBackground(new Color(70, 50, 41));
		setVisible(true);
		setLayout(null);

	}


	
}
