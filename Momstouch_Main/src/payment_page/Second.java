package payment_page;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Second {

   private JFrame frame;
   
   JLabel Labels = new JLabel();
   
   private JTextField textField1;
   private JTextField textField2;
   private JTextField textField3;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Second window = new Second();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Second() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 600, 1000);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      frame.getContentPane().setBackground(Color.white);
      frame.setLocationRelativeTo(null);
      
      JLabel Label1 = new JLabel("제품명");
      Label1.setHorizontalAlignment(SwingConstants.CENTER);
      Label1.setOpaque(true); 
      Label1.setBackground(new Color(196, 198, 197));
      Label1.setFont(new Font("굴림", Font.BOLD, 20));
      Label1.setBounds(23, 66, 136, 40);
      frame.getContentPane().add(Label1);
      
      JLabel Label2 = new JLabel("수량  금액");
      Label2.setHorizontalAlignment(SwingConstants.CENTER);
      Label2.setOpaque(true); 
      Label2.setBackground(new Color(196, 198, 197));
      Label2.setFont(new Font("굴림", Font.BOLD, 20));
      Label2.setBounds(157, 66, 151, 40);
      frame.getContentPane().add(Label2);
      
      JLabel Label3 = new JLabel("포장을 선택하세요.");
      Label3.setHorizontalAlignment(SwingConstants.LEFT);
      Label3.setText("<HTML>포장을<br>선택하세요.</HTML>");
      Label3.setOpaque(true);
      Label3.setFont(new Font("굴림", Font.BOLD, 20));
      Label3.setBackground(new Color(196, 198, 197));
      Label3.setBounds(415, 66, 145, 84);
      frame.getContentPane().add(Label3);
      
      JLabel Label4 = new JLabel(" 1");
      Label4.setHorizontalAlignment(SwingConstants.CENTER);
      Label4.setOpaque(true); 
      Label4.setBackground(new Color(196, 198, 197));
      Label4.setFont(new Font("굴림", Font.BOLD, 40));
      Label4.setBounds(347, 66, 68, 84);
      frame.getContentPane().add(Label4);
      
      JLabel Label5 = new JLabel("장바구니에 넣은 메뉴");
      Label5.setFont(new Font("굴림", Font.PLAIN, 15));
      Label5.setVerticalAlignment(SwingConstants.TOP);
      Label5.setBorder(new TitledBorder(new LineBorder(new Color(226, 226, 226),2)));
      Label5.setHorizontalAlignment(SwingConstants.CENTER);
      Label5.setBounds(33, 123, 264, 381);
      frame.getContentPane().add(Label5);
      
      JLabel Label6 = new JLabel("주문금액");
      Label6.setForeground(new Color(64, 0, 64));
      Label6.setOpaque(true);
      Label6.setHorizontalAlignment(SwingConstants.CENTER);
      Label6.setFont(new Font("굴림", Font.BOLD, 16));
      Label6.setBackground(new Color(196, 198, 197));
      Label6.setBounds(38, 606, 163, 68);
      frame.getContentPane().add(Label6);
      
      JLabel Label7 = new JLabel("<HTML>결제를<br>선택하세요.</HTML>");
      Label7.setOpaque(true);
      Label7.setHorizontalAlignment(SwingConstants.LEFT);
      Label7.setFont(new Font("굴림", Font.BOLD, 20));
      Label7.setBackground(new Color(196, 198, 197));
      Label7.setBounds(415, 339, 145, 84);
      frame.getContentPane().add(Label7);
      
      JLabel Label8 = new JLabel("2");
      Label8.setOpaque(true);
      Label8.setHorizontalAlignment(SwingConstants.CENTER);
      Label8.setFont(new Font("굴림", Font.BOLD, 40));
      Label8.setBackground(new Color(196, 198, 197));
      Label8.setBounds(347, 339, 68, 84);
      frame.getContentPane().add(Label8);
      
      JLabel Label9 = new JLabel("-");
      Label9.setOpaque(true);
      Label9.setHorizontalAlignment(SwingConstants.RIGHT);
      Label9.setForeground(new Color(64, 0, 64));
      Label9.setFont(new Font("굴림", Font.BOLD, 20));
      Label9.setBackground(new Color(196, 198, 197));
      Label9.setBounds(38, 672, 173, 84);
      frame.getContentPane().add(Label9);
      
      JLabel Label10 = new JLabel("결제한 금액");
      Label10.setOpaque(true);
      Label10.setHorizontalAlignment(SwingConstants.CENTER);
      Label10.setForeground(new Color(64, 0, 64));
      Label10.setFont(new Font("굴림", Font.BOLD, 16));
      Label10.setBackground(new Color(196, 198, 197));
      Label10.setBounds(198, 606, 163, 68);
      frame.getContentPane().add(Label10);
      
      JLabel Label11 = new JLabel("");
      Label11.setOpaque(true);
      Label11.setHorizontalAlignment(SwingConstants.CENTER);
      Label11.setForeground(new Color(64, 0, 64));
      Label11.setFont(new Font("굴림", Font.BOLD, 20));
      Label11.setBackground(new Color(196, 198, 197));
      Label11.setBounds(199, 672, 167, 84);
      frame.getContentPane().add(Label11);
      
      JLabel Label12 = new JLabel("결제금액");
      Label12.setOpaque(true);
      Label12.setHorizontalAlignment(SwingConstants.CENTER);
      Label12.setForeground(new Color(64, 0, 64));
      Label12.setFont(new Font("굴림", Font.BOLD, 16));
      Label12.setBackground(new Color(196, 198, 197));
      Label12.setBounds(361, 606, 188, 68);
      frame.getContentPane().add(Label12);
      
      JLabel Label13 = new JLabel(" =");
      Label13.setOpaque(true);
      Label13.setHorizontalAlignment(SwingConstants.LEFT);
      Label13.setForeground(new Color(64, 0, 64));
      Label13.setFont(new Font("굴림", Font.BOLD, 20));
      Label13.setBackground(new Color(196, 198, 197));
      Label13.setBounds(361, 672, 188, 84);
      frame.getContentPane().add(Label13);
      
      
      Labels.add(Label1);
      Labels.add(Label2);
      Labels.add(Label3);
      Labels.add(Label4);
      Labels.add(Label5);
      Labels.add(Label6);
      Labels.add(Label7);
      Labels.add(Label8);
      Labels.add(Label9);
      Labels.add(Label10);
      Labels.add(Label11);
      Labels.add(Label12);
      Labels.add(Label13);
      
      frame.getContentPane().add(Labels);
      Labels.setSize(600,1000);
      Labels.setLocation(0,0);
      
      JButton Button1 = new JButton("포장");
      Button1.setFont(new Font("굴림", Font.BOLD, 20));
      Button1.setBounds(386, 174, 163, 52);
      Button1.setBackground(new Color(255, 255, 255));
      frame.getContentPane().add(Button1);
      
      JButton Button2 = new JButton("매장");
      Button2.setFont(new Font("굴림", Font.BOLD, 20));
      Button2.setBounds(386, 255, 163, 52);
      Button2.setBackground(new Color(255, 255, 255));
      frame.getContentPane().add(Button2);
      
      JButton Button3 = new JButton("신용카드");
      Button3.setFont(new Font("굴림", Font.BOLD, 20));
      Button3.setBounds(386, 452, 163, 52);
      Button3.setBackground(new Color(255, 255, 255));
      frame.getContentPane().add(Button3);
      
      JButton Button4 = new JButton("결제 취소");
      Button4.setFont(new Font("굴림", Font.BOLD, 20));
      Button4.setBounds(99, 831, 163, 52);
      Button4.setBackground(new Color(70, 50, 41));
      Button4.setForeground(new Color(255, 255, 255));
      Button4.setOpaque(true); 
      frame.getContentPane().add(Button4);
      
      JButton Button5 = new JButton("결제 하기");
      Button5.setFont(new Font("굴림", Font.BOLD, 20));
      Button5.setBounds(319, 831, 163, 52);
      Button5.setBackground(new Color(230, 149, 0));
      Button5.setForeground(new Color(255, 255, 255));
      Button5.setOpaque(true);
      frame.getContentPane().add(Button5);
   
      
      textField1 = new JTextField();
      textField1.setBounds(59, 684, 128, 52);
      frame.getContentPane().add(textField1);
      textField1.setColumns(10);
      
      textField2 = new JTextField();
      textField2.setColumns(10);
      textField2.setBounds(223, 684, 128, 52);
      frame.getContentPane().add(textField2);
      
      textField3 = new JTextField();
      textField3.setColumns(10);
      textField3.setBounds(402, 684, 128, 52);
      frame.getContentPane().add(textField3);
      
      
      
   }
}