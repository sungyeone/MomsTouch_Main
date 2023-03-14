package main_page;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import order_page.OrderPanel;
import tool.FontTool;

public class ForHereOrToGoBtn extends JButton{
	
//	 public ForHereOrToGoBtn() { super(); decorate(); } 
//     public ForHereOrToGoBtn(String text) { super(text); decorate(); } 
//     public ForHereOrToGoBtn(Action action) { super(action); decorate(); } 
//     public ForHereOrToGoBtn(Icon icon) { super(icon); decorate(); } 
//     public ForHereOrToGoBtn(String text, Icon icon) { super(text, icon); decorate(); } 
//     protected void decorate() { setBorderPainted(false); setOpaque(false); }
//     @Override 
//     protected void paintComponent(Graphics g) {
//        Color c=new Color(230, 149, 0); //배경색 결정
//        Color o=new Color(255, 255, 255); //글자색 결정
//        int width = getWidth(); 
//        int height = getHeight(); 
//        Graphics2D graphics = (Graphics2D) g; 
//        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
//        if (getModel().isArmed()) { graphics.setColor(c.darker()); } 
//        else if (getModel().isRollover()) { graphics.setColor(c.brighter()); } 
//        else { graphics.setColor(c); } 
//        graphics.fillRoundRect(0, 0, width, height, 100, 100); 
//        FontMetrics fontMetrics = graphics.getFontMetrics(); 
//        Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
//        int textX = (width - stringBounds.width) / 2; 
//        int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
//       graphics.setColor(o); 
//        graphics.setFont(getFont()); 
//        graphics.drawString(getText(), textX, textY); 
//        graphics.dispose(); 
//        super.paintComponent(g); 
//        }
	
	
	
	
	public ForHereOrToGoBtn(MomstouchMainFrame f, int num, OrderPanel op) {
		int x = (num % 2) * 285 + 58;
		if(num == 0)setText("<html><center>포장<br>Take Out<html>");
		if(num == 1)setText("<html><center>매장<br>Eat In<html>");
//		if(num == 0)setText("포장");
//		if(num == 1)setText("매장");

		setBorderPainted(false);
		setFocusPainted(false);
		setHorizontalAlignment(JButton.CENTER);
		// setSize(140, 78);
		setSize(195, 100);
		
		setContentAreaFilled(false);	
//		setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		// setFont(new Font("고딕체", Font.BOLD, 20));
//		setFont(FontTool.boldNanumSquare(20f));
//		setForeground(Color.white);
//		setBackground(new Color(230, 149, 0));
//		setOpaque(true);
		//setLocation(200, 800);
		
		//setIcon(new ImageIcon("images\\오렌지버튼.png"));
	//new ImageIcon("images\\오렌지버튼.png").getImage().getScaledInstance(30,  30, java.awt.Image.SCALE_SMOOTH);
	 // new ImageIcon("images\\오렌지버튼.png").getImage().getScaledInstance(30,  30, java.awt.Image.SCALE_SMOOTH);
		
		String packingImage = "images/포장버튼.png";
		String eatInImage = "images/매장버튼.png";
		BufferedImage bufferedImage;
		BufferedImage bufferedImage2;
		try {
			bufferedImage = ImageIO.read(new File(packingImage));
			Image scaledImage =
					bufferedImage.getScaledInstance(195, 100, Image.SCALE_SMOOTH);
			bufferedImage2 = ImageIO.read(new File(eatInImage));
			Image scaledImage2 =
					bufferedImage2.getScaledInstance(195, 100, Image.SCALE_SMOOTH);
			if(num == 0)setIcon(new ImageIcon(scaledImage));
			if(num == 1)setIcon(new ImageIcon(scaledImage2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		setBounds(148, 114, 126, 80);
//		if(num == 0)setText("<html><center>포장<br>Take Out<html>");
//		if(num == 1)setText("<html><center>매장<br>Eat In<html>");
//		setVerticalTextPosition(SwingConstants.CENTER);
//		setHorizontalTextPosition(SwingConstants.CENTER);
		
		
		setLocation(x, 110);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(num == 0) {
					op.setPacking();
				} else if(num == 1) {
					op.setEatIn();
				}
				
				f.moveToOrderPage();
				
				
			}
		});
		

	}
	

}
