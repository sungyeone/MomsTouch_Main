package payment_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;

import tool.FontTool;

public class PaymentCompletionPage extends JPanel{
	
	JPanel waiting_number = new JPanel();
	//Intro intro = new Intro();
	
	public PaymentCompletionPage(PaymentPage paymentPage) {
		
		//setTitle("대기번호");
	    
	    
	    JLabel NewLabel = new JLabel("결제가 완료되었습니다");
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setBounds(108, 60, 351, 97);
		NewLabel.setFont(FontTool.nanumSquare(26f));
		//NewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		add(NewLabel);
		
		JLabel NewLabel2 = new JLabel("대기번호");
		NewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel2.setFont(FontTool.boldNanumSquare(40f));
		//NewLabel2.setFont(new Font("굴림", Font.BOLD, 38));
		NewLabel2.setBounds(154, 160, 258, 49);
		add(NewLabel2);
		
		JLabel NewLabel3 = new JLabel("919");
		NewLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel3.setFont(FontTool.nanumSquare(26f));
		//NewLabel3.setFont(new Font("굴림", Font.BOLD, 25));
		NewLabel3.setBounds(251, 220, 59, 37);
		add(NewLabel3);
		
		JLabel NewLabel4 = new JLabel("영수증을 꼭 가져가세요");
		NewLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel4.setFont(FontTool.nanumSquare(26f));
		//NewLabel4.setFont(new Font("굴림", Font.PLAIN, 25));
		NewLabel4.setBounds(150, 300, 273, 31);
		add(NewLabel4);
		
		JLabel NewLabel5 = new JLabel("제품 수령시 영수증의 대기번호가 필요합니다");
		NewLabel5.setFont(FontTool.boldNanumSquare(23f));
		NewLabel5.setHorizontalAlignment(JLabel.CENTER);
		//NewLabel5.setFont(new Font("굴림", Font.BOLD, 23));
		NewLabel5.setBounds(48, 600, 492, 24);
		add(NewLabel5);
		
		JLabel NewLabel6 = new JLabel("꼭 소지부탁드립니다");
		NewLabel6.setFont(FontTool.nanumSquare(23f));
		//NewLabel6.setFont(new Font("굴림", Font.BOLD, 23));
		NewLabel6.setBounds(185, 650, 238, 24);
		add(NewLabel6);
		
		JLabel NewLabel7 = new JLabel("결제 완료");
		NewLabel7.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
		NewLabel7.setFont(FontTool.boldNanumSquare(23f));
		//NewLabel7.setFont(new Font("굴림", Font.BOLD, 20));
		NewLabel7.setBackground(new Color(230, 149, 0));
		NewLabel7.setForeground(new Color(255, 255, 255));
		NewLabel7.setOpaque(true); 
		NewLabel7.setBounds(0, 0, 586, 68);
		add(NewLabel7);
		
		JLabel NewLabel8 = new JLabel("");
		NewLabel8.setOpaque(true);
		NewLabel8.setForeground(Color.WHITE);
		// NewLabel8.setFont(new Font("굴림", Font.BOLD, 15));
		NewLabel8.setFont(FontTool.boldNanumSquare(15f));
		NewLabel8.setBackground(new Color(230, 149, 0));
		NewLabel8.setBounds(0, 730, 586, 18);
		add(NewLabel8);
		
		
		JLabel NewLabel9 = new JLabel("");
		
		NewLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		BufferedImage bufferedImage;
		try {
			BufferedImage buffered = ImageIO.read(new File("images/주문서.png"));
			Image scaledImage =
		               buffered.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
			NewLabel9.setIcon(new ImageIcon(scaledImage));  
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		NewLabel9.setBounds(154, 320, 258, 273);
		add(NewLabel9);
		
		
//		int delay = 3000;
//		
//		Timer timer = new Timer(delay, new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				intro.setVisible(true);
//				waiting_number.setVisible(false);
//			}
//		});
//		
//		timer.start();
		
		waiting_number.add(NewLabel);
		waiting_number.add(NewLabel2);
		waiting_number.add(NewLabel3);
		waiting_number.add(NewLabel4);
		waiting_number.add(NewLabel5);
		waiting_number.add(NewLabel6);
		waiting_number.add(NewLabel7);
		waiting_number.add(NewLabel8);
		waiting_number.add(NewLabel9);
		waiting_number.setBounds(0, 0, 600, 800);
		add(waiting_number);
		
		
		waiting_number.setLayout(null);
		setSize(600, 800);
		//setLocationRelativeTo(null);
		waiting_number.setBackground(Color.white);
	    
		
	    
	   
	    setLayout(null);
	    setVisible(false);
	   
	    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
	}
	
	
	
}
