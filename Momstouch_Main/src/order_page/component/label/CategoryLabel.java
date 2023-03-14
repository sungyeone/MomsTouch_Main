package order_page.component.label;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

import main_page.ForHereOrToGoBtn;
import main_page.MomstouchMainFrame;
import order_page.OrderPanel;
import order_page.component.button.FirstWindowButton;
import order_page.component.button.PackagingButton;
import order_page.component.button.EatInButton;
import order_page.component.button.category_button.BonelessChicken_Button;
import order_page.component.button.category_button.Burger_Button;
import order_page.component.button.category_button.Chicken_Button;
import order_page.component.button.category_button.Beverage_Button;
import order_page.component.button.category_button.MomsSet_Button;
import order_page.component.button.category_button.NewMenu_Button;
import order_page.component.button.category_button.NextCategoryButton;
import order_page.component.button.category_button.PreviousCategoryButton;
import order_page.component.button.category_button.Side_Button;

public class CategoryLabel extends JLabel{
	
//	JButton firstWindowBtn;
//	JButton	packingBtn;
//	JButton eatInBtn;
//	
//	JButton nextButton;
//	JButton previousButton;
//	
//	JButton newMenuBtn;
//	JButton burgerBtn;
//	JButton chickenBtn; 
//	JButton bonelessChickenBtn;
//	JButton momsSetBtn; 
//	JButton beverageBtn;
//	JButton sideMenuBtn;
	
	public CategoryLabel(MomstouchMainFrame main) {
//		firstWindowBtn = new First_Window();
//		packingBtn = new PackagingButton(main , this);
//		eatInBtn = new EatInButton(main, this); 
		
//		nextButton = new NextCategoryButton(this);
//		previousButton = new PreviousCategoryButton(this);
		
//		newMenuBtn = new NewMenu_Button(op);
//		burgerBtn = new Buger_Button(op);
//		chickenBtn = new Chicken_Button(op);
//		bonelessChickenBtn = new BonelessChicken_Button(op);
//		momsSetBtn = new MomsSet_Button(op);
//		beverageBtn = new Drink_Button(op);
//		sideMenuBtn = new Side_Button(op);
		
//		add(firstWindowBtn);
//		add(packingBtn);
//		add(eatInBtn);
		
//		add(nextButton);
//		add(previousButton);
		
//		add(newMenuBtn);
//		add(burgerBtn);
//		add(chickenBtn);
//		add(bonelessChickenBtn);
//		add(beverageBtn);
//		add(momsSetBtn);
//		add(sideMenuBtn);
		
		JLabel momsicon = new JLabel();
		momsicon.setBounds(30, 30, 120, 60);
		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(new File("images/맘스터치로고.png")); // 이미지 경로 바꿈
			Image scaledImage = bufferedImage.getScaledInstance(120, 60, Image.SCALE_DEFAULT);
			momsicon.setIcon(new ImageIcon(scaledImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		add(momsicon);
	
		setOpaque(true);
		setBackground(new Color(205, 199, 187));
		setBounds(0, 0, 585, 230);
	}
	
//	public void moveToNextCategories() {
//		newMenuBtn.setVisible(false);
//		burgerBtn.setVisible(false);
//		chickenBtn.setVisible(false);
//		bonelessChickenBtn.setVisible(false);
//		
//		momsSetBtn.setVisible(true);
//		beverageBtn.setVisible(true);
//		sideMenuBtn.setVisible(true);
//		
//		nextButton.setVisible(false);
//		previousButton.setVisible(true);
//		
//		momsSetBtn.doClick();//
//	}	
//	
//	public void moveToPreviousCategories() {
//		
//		momsSetBtn.setVisible(true);
//		beverageBtn.setVisible(true);
//		sideMenuBtn.setVisible(true);
//		
//		newMenuBtn.setVisible(true);
//		burgerBtn.setVisible(true);
//		chickenBtn.setVisible(true);
//		bonelessChickenBtn.setVisible(true);
//		
//		nextButton.setVisible(true);
//		previousButton.setVisible(false);
//		
//		newMenuBtn.doClick();
//	}
	

}
