package payment_page.PayWithCardPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import payment_page.PaymentPage;
import payment_page.PayWithCardPage.component.buttons.CancelBtn;
import payment_page.PayWithCardPage.component.buttons.PurchaseBtn;
import payment_page.PayWithCardPage.component.labels.BottomGuidenceLabel;
import payment_page.PayWithCardPage.component.labels.LoadingGif;
import payment_page.PayWithCardPage.component.labels.PayWithCard_CardReaderLabel;
import payment_page.PayWithCardPage.component.labels.ProcessingLabel;
import tool.FontTool;

public class PayWithCardFrame extends JFrame {

	JFrame parent = this;
	
	JLabel top_label = new JLabel() {
		{
			setText("<html> <center>카드를 리더기에<br>넣어주세요");
			// setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
			setFont(FontTool.boldNanumSquare(35f));
			
			setHorizontalAlignment(JLabel.CENTER);
			setBounds(0,50,500,150);
		}
	};
	
	JLabel bottom_label; 
	JButton purchase_button = new PurchaseBtn();
	JButton cancel_button = new CancelBtn();
	JLabel loading_gif = new LoadingGif();
	JLabel process = new ProcessingLabel();
	JLabel card_reader_label;
			
	
	
	JLabel top_label_line = new JLabel() {
		{
			 setOpaque(true); 
		     setBackground(new Color(243, 156, 18));
		     setBounds(0, 0, 600, 20);
		}
	};
	
	JLabel left_label_line = new JLabel() {
		{
			 setOpaque(true); 
		     setBackground(new Color(243, 156, 18));
		     setBounds(0, 0, 20, 1000);
		}
	};
	
	JLabel right_label_line = new JLabel() {
		{
			setOpaque(true); 
		     setBackground(new Color(243, 156, 18));
		     setBounds(465, 0, 20, 1000);
		}
	};
	
	JLabel bottom_label_line = new JLabel() {
		{
			setOpaque(true); 
		     setBackground(new Color(243, 156, 18));
		     setBounds(0, 641, 600, 20);
		}
	};
	
	public PayWithCardFrame(PaymentPage paymentPage) {
		
		
		bottom_label = new BottomGuidenceLabel(this, paymentPage);
		card_reader_label =
				new PayWithCard_CardReaderLabel(bottom_label, loading_gif, process, this, paymentPage);
		add(top_label);
		add(card_reader_label);
		add(bottom_label);
		add(top_label_line);
		add(left_label_line);
		add(right_label_line);
		add(bottom_label_line);
		add(purchase_button);
		add(cancel_button);
		add(loading_gif);
		add(process);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				dispose();
				paymentPage.unlock();
			
			}
		});
		
		setVisible(true);
		setBounds(100, 100, 500, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
	}
	
	
	
}
