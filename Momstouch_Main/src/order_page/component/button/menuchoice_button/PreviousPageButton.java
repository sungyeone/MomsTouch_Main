package order_page.component.button.menuchoice_button;

import java.awt.CardLayout;
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

import order_page.component.panel.BeverageChoicePanel;
import order_page.component.panel.BonelessChickenChoicePanel;
import order_page.component.panel.BurgerChoicePanel;
import order_page.component.panel.ChickenChoicePanel;
import order_page.component.panel.MomsSetChoicePanel;
import order_page.component.panel.SideMenuChoicePanel;

public class PreviousPageButton extends JButton{
	
	public PreviousPageButton(BurgerChoicePanel burgerChoicePanel, CardLayout pages) {
		
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(40, 31);
		setLocation(10, 432);
		
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표2.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pages.previous(burgerChoicePanel);
				
			}
		});
	}
	
	public PreviousPageButton(ChickenChoicePanel chickenChoicePanel, CardLayout pages) {
		
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(40, 31);
		setLocation(10, 432);
		
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표2.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pages.previous(chickenChoicePanel);
				
			}
		});
	}
	
	public PreviousPageButton(BonelessChickenChoicePanel bonelessChickenChoicePanel, CardLayout pages) {
		
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(40, 31);
		setLocation(10, 432);
		
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표2.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pages.previous(bonelessChickenChoicePanel);
				
			}
		});
	}
	
	public PreviousPageButton(SideMenuChoicePanel sideMenuChoicePanel, CardLayout pages) {
		
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(40, 31);
		setLocation(10, 432);
		
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표2.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pages.previous(sideMenuChoicePanel);
				
			}
		});
	}
	
	public PreviousPageButton(MomsSetChoicePanel momsSetChoicePanel, CardLayout pages) {
		
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(40, 31);
		setLocation(10, 432);
		
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표2.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pages.previous(momsSetChoicePanel);
				
			}
		});
	}
	
	public PreviousPageButton(BeverageChoicePanel beverageChoicePanel, CardLayout pages) {
		
		
		setOpaque(true);
		setBackground(Color.white);
		setSize(40, 31);
		setLocation(10, 432);
		
		
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표2.png";
		   
		      try {
		         bufferedImage = ImageIO.read(new File(image));
		         Image scaledImage =
		               bufferedImage.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		        setIcon(new ImageIcon(scaledImage));
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pages.previous(beverageChoicePanel);
				
			}
		});
	}
}
