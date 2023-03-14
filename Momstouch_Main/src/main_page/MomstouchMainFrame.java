package main_page;

import javax.swing.JFrame;

import order_page.OrderPanel;
import selectoption_page.component.fourthPageInPane.DAO.BeverageDAO;
import selectoption_page.component.fourthPageInPane.DAO.SideDAO;
import selectoption_page.component.fourthPageInPane.add.menuInfo.BeverageInfo;
import selectoption_page.component.fourthPageInPane.add.menuInfo.SideInfo;

public class MomstouchMainFrame extends JFrame {
	
	public boolean packing;
	
	FirstWindowPanel firstWindowPanel; 
	OrderPanel orderPanel;
	
	public MomstouchMainFrame() {
		
		
		
		
		orderPanel = new OrderPanel(this);
		firstWindowPanel = new FirstWindowPanel(this , orderPanel);
		  
	      setTitle("맘스터치 키오스크");
	      setBounds(0, 0, 600, 1000);
	      setLocationRelativeTo(null);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(null);
	      
	      setResizable(false);	      
	      add(orderPanel);
	      add(firstWindowPanel);

	      setVisible(true);
	      
	      
	      firstWindowPanel.setVisible(true);
	      orderPanel.setVisible(false);
	      //paymentPage.setVisible(false);
	}
	
	public void moveToOrderPage() {
		
		firstWindowPanel.setVisible(false);
		orderPanel.setVisible(true);
	}
	
	public void moveToMainPage() {
		firstWindowPanel.setVisible(true);
		orderPanel.setVisible(false);
	}
	
	public static void main(String[] args) {
		new MomstouchMainFrame();
		
	}

}
