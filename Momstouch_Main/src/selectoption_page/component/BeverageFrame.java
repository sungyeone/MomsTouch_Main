package selectoption_page.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.OverlayLayout;

import model.BeverageInfo;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;
import selectoption_page.component.fourthPageInPane.add.menuImage.CheckLabel;
import selectoption_page.component.fourthPageUpper.AmountLabel;
import selectoption_page.component.fourthPageUpper.BurgerImage;
import selectoption_page.component.fourthPageUpper.MenuNameLabel;
import selectoption_page.component.fourthPageUpper.MinusButton;
import selectoption_page.component.fourthPageUpper.PlusButton;
import selectoption_page.component.fourthPageUpper.PriceLabel;
import selectoption_page.component.fourthPageUpper.TopLabel;
import selectoption_page.component.okAndCancel.CancelBtn;
import selectoption_page.component.okAndCancel.OkBtn;

public class BeverageFrame extends JFrame{
	
	TopLabel topLabel = new TopLabel();
	LayoutManager overlay = new OverlayLayout(topLabel);
	{
		topLabel.setLayout(overlay);
	}
//	JLabel topText = new JLabel() {
//		{
//			setText(beverageInfo[num].getBeverage_name());
//			setAlignmentX(0.5f);
//			try {
//				// create the font to use. Specify the size!
//				Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf"))
//						.deriveFont(15f);
//				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//				// register the font
//				ge.registerFont(customFont);
//			       setFont(customFont);
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (FontFormatException e) {
//				e.printStackTrace();
//			}
//			setHorizontalAlignment(JLabel.CENTER);
//		}
//	};
//	{
//		topLabel.add(topText);
//	}
	AmountLabel amount = new AmountLabel();
	MinusButton minusBtn = new MinusButton(amount);
	PlusButton plusBtn = new PlusButton(amount);
	PriceLabel priceLabel = new PriceLabel();
	MenuNameLabel menuNameLabel = new MenuNameLabel();
	BurgerImage burgerImage;
	
	boolean sChecked;
	boolean mChecked;
	boolean lChecked;
	
	CheckLabel smallCheck = new CheckLabel();
	JButton small = new JButton() {
		{	
			
			BufferedImage bufferedImage;
			
			String imagePath = "images/menu/beverage/사이즈S.png";
			
			try {
				bufferedImage = ImageIO.read(new File(imagePath));
				Image scaledImage =
						bufferedImage.getScaledInstance(55, 99, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e) {
				e.printStackTrace();
			}
			setLocation(60, 240);
			setSize(100, 90);
			add(smallCheck);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			setBackground(Color.WHITE);
			setOpaque(true);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					largeCheck.setVisible(false);
					mediumCheck.setVisible(false);
					smallCheck.setVisible(true);
					sChecked = true;
					mChecked = false;
					lChecked = false;
				}
			});
		}
	};
	
	JLabel smallPrice = new JLabel() {
		{
			setText("-500");
			setSize(80, 30);
			setLocation(70, 340);
			try {	
					
				
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(12.5f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
			setHorizontalAlignment(JLabel.CENTER);
		}
	};
	
	CheckLabel mediumCheck = new CheckLabel();
	JButton medium = new JButton() {
		{
			BufferedImage bufferedImage;
			
			String imagePath = "images/menu/beverage/사이즈M.png";
			
			try {
				bufferedImage = ImageIO.read(new File(imagePath));
				Image scaledImage =
						bufferedImage.getScaledInstance(55, 99, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e) {
				e.printStackTrace();
			}
			setLocation(245, 240);
			setSize(100, 90);
			add(mediumCheck);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			setBackground(Color.WHITE);
			setOpaque(true);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					largeCheck.setVisible(false);
					smallCheck.setVisible(false);
					mediumCheck.setVisible(true);
					mChecked = true;
					sChecked = false;
					lChecked = false;
				}
			});
		}
	};
	
	JLabel mediumPrice = new JLabel() {
		{
			setText("+0");
			setSize(80, 30);
			setLocation(255, 340);
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(12.5f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
			setHorizontalAlignment(JLabel.CENTER);
		}
	};
	
	CheckLabel largeCheck = new CheckLabel();
	JButton large = new JButton() {
		{	
			
			BufferedImage bufferedImage;
			
			String imagePath = "images/menu/beverage/사이즈L.png";
			
			try {
				bufferedImage = ImageIO.read(new File(imagePath));
				Image scaledImage =
						bufferedImage.getScaledInstance(55, 99, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e) {
				e.printStackTrace();
			}
			setLocation(435, 240);
			setSize(100, 90);
			add(largeCheck);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			setBackground(Color.WHITE);
			setOpaque(true);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					smallCheck.setVisible(false);
					mediumCheck.setVisible(false);
					largeCheck.setVisible(true);
					lChecked = true;
					mChecked = false;
					sChecked = false;
				}
			});
		}
	};
	
	JLabel largePrice = new JLabel() {
		{
			setText("+500");
			setSize(80, 30);
			setLocation(445, 340);
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(12.5f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
			setHorizontalAlignment(JLabel.CENTER);
		}
	};
	
	OkBtn ok = new OkBtn() {
		{
			setLocation(350, 400);
		}
	};
	CancelBtn cancel = new CancelBtn() {
		{
			setLocation(65, 400);
		}
	};	
	String beverageName = "";
	String choiceSize;
	int price;
	
	DecimalFormat dc = new DecimalFormat("###,###,###");
	
	public BeverageFrame(BeverageInfo[] beverageInfo, int num, OrderPanel op, SelectedMenuInfo selectedMenuInfo) {
		
		mediumCheck.setVisible(true);
		
		int unitPrice = selectedMenuInfo.getPrice()/selectedMenuInfo.getQuantity();
		
		JLabel topText = new JLabel() {
			{
				setText(beverageInfo[num].getBeverage_name());
				setAlignmentX(0.5f);
				try {
					// create the font to use. Specify the size!
					Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf"))
							.deriveFont(20f);
					GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
					// register the font
					ge.registerFont(customFont);
				       setFont(customFont);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (FontFormatException e) {
					e.printStackTrace();
				}
				setForeground(Color.white);

			}
		};
		
		{
			topLabel.add(topText);
		}

		amount.setText("" + selectedMenuInfo.getQuantity());
		String imagePath = beverageInfo[num].getBeverage_link();
//		menuNameLabel.setText(beverageInfo[num].getBeverage_name());
		priceLabel.setText(dc.format(beverageInfo[num].getBeverage_price()));
		
		burgerImage = new BurgerImage(imagePath);
		burgerImage.setBounds(35, 55, 160, 140);
		
		setVisible(true);
		setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(400, 10, 600, 550);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		add(topLabel);
		add(amount);
		add(minusBtn);
		add(plusBtn);
		add(priceLabel);
		add(menuNameLabel);
		add(burgerImage);
		add(small);
		add(smallPrice);
		add(medium);
		add(mediumPrice);
		add(large);
		add(largePrice);
		add(ok);
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (sChecked) {
					choiceSize = "S";
					price = -500;
				} else if (mChecked) {
					choiceSize = "M";
					price = 0;
				} else if (lChecked) {
					choiceSize = "L";
					price = 500;
				} else {
					choiceSize = "M";
					price = 0;
				}
				
				
				selectedMenuInfo.setBeverageSize(choiceSize);
				selectedMenuInfo.setPrice((unitPrice + price) * getQuantity());
				selectedMenuInfo.setQuantity(getQuantity());
				
				op.addSelectedMenu(selectedMenuInfo);
				op.unlock();
				
				
				dispose();
			}
		});
		
		
		add(cancel);
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.unlock();
				dispose();
			}
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				op.unlock();
			}	
		});
	}
	
	public int getQuantity() {
		return Integer.parseInt(amount.getText());
	}
	public static void main(String[] args) {
		//new BeverageFrame();
	}
}
