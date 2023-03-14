package payment_page.PayWithCardPage.component.labels;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import payment_page.PaymentPage;
import payment_page.PayWithCardPage.PayWithCardFrame;
import tool.FontTool;

public class BottomGuidenceLabel extends JLabel {
	
	public BottomGuidenceLabel(PayWithCardFrame f, PaymentPage paymentPage) {
		
		 setHorizontalAlignment(JLabel.CENTER);
		 setText("<html><center>카드를 넣기 전 취소하시려면<br>이 안내문을 터치해주세요</center></html>");
		 // setFont(new Font("HY그래픽M", Font.BOLD, 20));
		 setFont(FontTool.boldNanumSquare(20f));
		 setBounds(45, 450, 400, 200);
		 addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paymentPage.unlock();
				f.dispose();
				
			}
		});
	}
	
	public void close() {
		setVisible(false);
	}
}
