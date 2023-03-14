package payment_page.PayWithCardPage.component.labels;

import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import tool.FontTool;

public class ProcessingLabel extends JLabel {
	
	public ProcessingLabel() {
	
//	Image image;
//	public ProgressingGif() {
//	Icon imgIcon2 = new ImageIcon(new ImageIcon("PayWithCard_img/결제중.gif")
//			.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
	
	
	 setHorizontalAlignment(JLabel.CENTER);
	 setText("결제중입니다.");
	 // setFont(new Font("HY헤드라인M", Font.PLAIN, 23));
	 setFont(FontTool.boldNanumSquare(23f));
	 setBounds(143, 550, 200, 100);	
	 setVisible(false);
	
	
//	setBounds(190, 530, 100, 100);
//	setVisible(false);
//	setOpaque(true);
//	//setBackground(Color.white);
	
	 }
}
