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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

import order_page.component.panel.BeverageChoicePanel;
import order_page.component.panel.BonelessChickenChoicePanel;
import order_page.component.panel.BurgerChoicePanel;
import order_page.component.panel.ChickenChoicePanel;
import order_page.component.panel.MomsSetChoicePanel;
import order_page.component.panel.SideMenuChoicePanel;

public class NextPageButton extends JButton{
	
	public NextPageButton(BurgerChoicePanel burgerChoicePanel, CardLayout pages) {
		
		setOpaque(true);
		setBackground(Color.white);
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		setSize(40, 31);
		setLocation(536, 432);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표.png";
		   
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
				pages.next(burgerChoicePanel);
				
			}
		});
	}
	
	public NextPageButton(ChickenChoicePanel chickenChoicePanel, CardLayout pages) {
		
		setOpaque(true);
		setBackground(Color.white);
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		setSize(40, 31);
		setLocation(536, 432);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표.png";
		   
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
				pages.next(chickenChoicePanel);
				
				
			}
		});
	}
	
	public NextPageButton(BonelessChickenChoicePanel bonelessChickenChoicePanel, CardLayout pages) {
		
		setOpaque(true);
		setBackground(Color.white);
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		setSize(40, 31);
		setLocation(536, 432);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표.png";
		   
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
				pages.next(bonelessChickenChoicePanel);
				
				
			}
		});
	}
	
	public NextPageButton(SideMenuChoicePanel sideMenuChoicePanel, CardLayout pages) {
		
		setOpaque(true);
		setBackground(Color.white);
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		setSize(40, 31);
		setLocation(536, 432);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표.png";
		   
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
				pages.next(sideMenuChoicePanel);
				
				
			}
		});
	}
	
	public NextPageButton(MomsSetChoicePanel momsSetChoicePanel, CardLayout pages) {
		
		setOpaque(true);
		setBackground(Color.white);
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		setSize(40, 31);
		setLocation(536, 432);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표.png";
		   
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
				pages.next(momsSetChoicePanel);
				
				
			}
		});
	}
	
	public NextPageButton(BeverageChoicePanel beverageChoicePanel, CardLayout pages) {
		
		setOpaque(true);
		setBackground(Color.white);
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
		
		setSize(40, 31);
		setLocation(536, 432);
		
		BufferedImage bufferedImage;
		   
		   String image = "images/화살표.png";
		   
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
				pages.next(beverageChoicePanel);
				
				
			}
		});
	}
	
}
