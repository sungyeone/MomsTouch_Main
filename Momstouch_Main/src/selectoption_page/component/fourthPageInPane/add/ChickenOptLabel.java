package selectoption_page.component.fourthPageInPane.add;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.OverlayLayout;

import selectoption_page.component.GetOpt;
import selectoption_page.component.fourthPageInPane.DAO.BeverageDAO;
import selectoption_page.component.fourthPageInPane.DAO.SideDAO;
import selectoption_page.component.fourthPageInPane.add.menuImage.BeverageButton;
import selectoption_page.component.fourthPageInPane.add.menuImage.CheckLabel;
import selectoption_page.component.fourthPageInPane.add.menuImage.SideButton;
import selectoption_page.component.fourthPageInPane.add.menuInfo.BeverageInfo;
import selectoption_page.component.fourthPageInPane.add.menuInfo.SideInfo;
import selectoption_page.component.fourthPageInPane.add.menuText.BeverageNameLabel;
import selectoption_page.component.fourthPageInPane.add.menuText.BeveragePriceLabel;
import selectoption_page.component.fourthPageInPane.add.menuText.SideNameLabel;
import selectoption_page.component.fourthPageInPane.add.menuText.SidePriceLabel;

public class ChickenOptLabel extends JLabel{
	
	JLabel longGrayLabel1 = new JLabel() {
		{	
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/label/회색라벨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(545, 33, Image.SCALE_DEFAULT);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBackground(new Color(196, 198, 197));
			setBounds(40, 0, 545, 30);
			setOpaque(true);
		}
	};
	LayoutManager overlay = new OverlayLayout(longGrayLabel1);
	{
		longGrayLabel1.setLayout(overlay);
	}
	JLabel Text1 = new JLabel() {
		{
			setText("치킨 선택");
			setAlignmentX(0.05f);
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
	{
		longGrayLabel1.add(Text1);
	}
	
	JLabel shortOrangeLabel1 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	
	CheckLabel checkChicken = new CheckLabel();
	boolean chickenCheck;
	JButton chicken = new JButton() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/menu/chicken/간장마늘치킨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(95, 60, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBounds(30, 40, 95, 70);
			setHorizontalAlignment(JLabel.CENTER);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			add(checkChicken);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (checkedLanch == false) {
						checkChicken.setVisible(true);
						chickenCheck = true;
						checkHalfChicken.setVisible(false);
						getOption.setChicken("한마리");
					} else if (checkedLanch == true) {
						checkChicken.setVisible(false);
						chickenCheck = false;
						getOption.setChicken("");
					}
				}
			});
			setVerticalAlignment(JLabel.TOP);
			setText(null);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};
	
	public String getChicken() {
		return "한 마리";
	}
	public boolean getChickenCheck() {
		return chickenCheck;
	}
	
	JLabel optHalfchickenText = new JLabel() {
		{
			setBounds(170, 105, 95, 25);
			setText("반마리");
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(13f);
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
	
	JLabel optchickenText = new JLabel() {
		{
			setBounds(29, 105, 95, 25);
			setText("한마리");
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(13f);
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
	CheckLabel checkHalfChicken = new CheckLabel();
	boolean halfChickenCheck;
	JButton halfChicken = new JButton() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/menu/chicken/간장마늘치킨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(95, 60, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBounds(170, 40, 95, 70);
			setHorizontalAlignment(JLabel.CENTER);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			add(checkHalfChicken);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (checkedLanch == false) {
						checkHalfChicken.setVisible(true);
						checkChicken.setVisible(false);
						halfChickenCheck = true;
						getOption.setChicken("반마리");
					} else if (checkedLanch == true) {
						checkHalfChicken.setVisible(false);
						halfChickenCheck = false;
						getOption.setChicken("");
					}
				}
			});
			setVerticalAlignment(JLabel.TOP);
			setText(null);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};
	
	public String getHalfChicken() {
		return "반 마리";
	}
	
	public boolean getHalfChickenCheck() {
		return halfChickenCheck;
	}
	
	JLabel chickenLabel = new JLabel() {
		{
			add(longGrayLabel1);
			add(shortOrangeLabel1);
			add(chicken);
			add(optHalfchickenText);
			add(halfChicken);
			add(optchickenText);
			setBackground(Color.WHITE);
			setLocation(0, 0);
			setSize(585, 170);
			setOpaque(true);
		}
	};
	
	SideInfo[] sideInfo;
	SideButton[] sideButton;
	SideNameLabel[] sideNameLabel;
	SidePriceLabel[] sidePriceLabel;
	List<SideButton> sideBtns = new ArrayList<>();
	List<SideNameLabel> sideNLabels = new ArrayList<>();
	List<SidePriceLabel> sidePLabels = new ArrayList<>();
	{
		sideInfo = SideDAO.getSideInfo();
		
		sideButton = new SideButton[sideInfo.length];
		sideNameLabel = new SideNameLabel[sideInfo.length];
		sidePriceLabel = new SidePriceLabel[sideInfo.length];
		for (int i = 0; i < sideInfo.length; ++i) {
			sideButton[i] = new SideButton(sideInfo, i);
			sideNameLabel[i] = new SideNameLabel(sideInfo, i);
			sidePriceLabel[i] = new SidePriceLabel(sideInfo, i);
			sideButton[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < sideInfo.length; ++i) {
						sideButton[i].getCheck().setVisible(false);
						sideButton[i].checkFalse();
					}
				}
			});
			sideBtns.add(sideButton[i]);
			sideNLabels.add(sideNameLabel[i]);
			sidePLabels.add(sidePriceLabel[i]);
		}
	}
	
	
	
	public List<SideButton> getSideBtns(){
		return sideBtns;
	}
	
	public static int LabelLocationY(int num) {
		
		if (num % 4 == 0) {
			return (num / 4) * 140;
		} else {
			return ((num / 4) + 1) * 140;
		}
	}
	
	JLabel longGrayLabel2 = new JLabel() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/label/회색라벨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(545, 33, Image.SCALE_DEFAULT);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBackground(new Color(196, 198, 197));
			setBounds(40, 0, 545, 30);
			setOpaque(true);
		}
	};
	LayoutManager overlay2 = new OverlayLayout(longGrayLabel2);
	{
		longGrayLabel2.setLayout(overlay2);
	}
	JLabel Text2 = new JLabel() {
		{
			setText("사이드 선택");
			setAlignmentX(0.05f);
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
	{
		longGrayLabel2.add(Text2);
	}
	
	JLabel ShortOrangeLabel2 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	
	JLabel sideLabel = new JLabel() {
		{
			setBackground(Color.WHITE);
			setLocation(0, chickenLabel.getHeight());
			add(longGrayLabel2);
			add(ShortOrangeLabel2);
			int num = 1;
			for (JButton sideBtn : sideBtns) {
				add(sideBtn);
				setSize(585, LabelLocationY(num++));
			}
			for (JLabel sideTLabel : sideNLabels) {
				add(sideTLabel);
			}
			for (JLabel sidePLabel : sidePLabels) {
				add(sidePLabel);
			}
			setOpaque(true);
		}
	};
	
	BeverageInfo[] beverageInfo;
	BeverageButton[] beverageButton;
	BeverageNameLabel[] beverageNameLabel;
	BeveragePriceLabel[] beveragePriceLabel;
	List<BeverageButton> beverageBtns = new ArrayList<>();
	List<BeverageNameLabel> beverageNLabels = new ArrayList<>();
	List<BeveragePriceLabel> beveragePLabels = new ArrayList<>();
	{
		beverageInfo = BeverageDAO.getBeverageInfo();

		beverageButton = new BeverageButton[beverageInfo.length];
		beverageNameLabel = new BeverageNameLabel[beverageInfo.length];
		beveragePriceLabel = new BeveragePriceLabel[beverageInfo.length];
		for (int i = 0; i < beverageInfo.length; ++i) {
			beverageButton[i] = new BeverageButton(beverageInfo, i);
			beverageNameLabel[i] = new BeverageNameLabel(beverageInfo, i);
			beveragePriceLabel[i] = new BeveragePriceLabel(beverageInfo, i);
			beverageButton[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < beverageInfo.length; ++i) {
						beverageButton[i].getCheck().setVisible(false);
						beverageButton[i].checkFalse();
					}
				}
			});
			beverageBtns.add(beverageButton[i]);
			beverageNLabels.add(beverageNameLabel[i]);
			beveragePLabels.add(beveragePriceLabel[i]);
		}
	}
		
	public List<BeverageButton> getBeverageBtns(){
		return beverageBtns;
	}
	
	JLabel longGrayLabel3 = new JLabel() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/label/회색라벨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(545, 33, Image.SCALE_DEFAULT);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBackground(new Color(196, 198, 197));
			setBounds(40, 0, 545, 30);
			setOpaque(true);
		}
	};
	LayoutManager overlay3 = new OverlayLayout(longGrayLabel3);
	{
		longGrayLabel3.setLayout(overlay3);
	}
	JLabel Text3 = new JLabel() {
		{
			setText("음료 선택");
			setAlignmentX(0.05f);
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
	{
		longGrayLabel3.add(Text3);
	}
	
	JLabel shortOrangeLabel3 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	
	JLabel beverageLabel = new JLabel() {
		{
			setBackground(Color.WHITE);
			setLocation(0, chickenLabel.getHeight() + sideLabel.getHeight());
			add(longGrayLabel3);
			add(shortOrangeLabel3);
			int num = 1;
			boolean checked = false;
			for (JButton beverageBtn : beverageBtns) {
				add(beverageBtn);
				setSize(585, LabelLocationY(num++));
			}
			for (JLabel beverageNLabel : beverageNLabels) {
				add(beverageNLabel);
			}
			for (JLabel beveragePLabel : beveragePLabels) {
				add(beveragePLabel);
			}
			setOpaque(true);
		}
	};
	
	GetOpt getOption = new GetOpt();
	JLabel longGrayLabel4 = new JLabel() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/label/회색라벨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(545, 33, Image.SCALE_DEFAULT);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBackground(new Color(196, 198, 197));
			setBounds(40, 0, 545, 30);
			setOpaque(true);
		}
	};
	LayoutManager overlay4 = new OverlayLayout(longGrayLabel4);
	{
		longGrayLabel4.setLayout(overlay4);
	}
	JLabel Text4 = new JLabel() {
		{
			setText("소스 선택");
			setAlignmentX(0.05f);
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
	{
		longGrayLabel4.add(Text4);
	}

	JLabel shortGrayLabel4 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	

	
	CheckLabel checkLanch = new CheckLabel();
	boolean checkedLanch = false;
	String sauceLanch = "랜치소스추가";
	
	JLabel optLanchText = new JLabel() {
		{
			setBounds(170, 130, 95, 30);
			setText(sauceLanch);
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(11f);
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

	JButton lanch = new JButton() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/menu/sauce/맘스랜치소스.png"));
				Image scaledImage = bufferedImage.getScaledInstance(95, 60, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBounds(170, 40, 95, 95);
			setHorizontalAlignment(JLabel.CENTER);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			add(checkLanch);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (checkedLanch == false) {
						checkLanch.setVisible(true);
						checkedLanch = true;
						getOption.setLanchSauce("랜치소스추가");
					} else if (checkedLanch == true) {
						checkLanch.setVisible(false);
						checkedLanch = false;
						getOption.setLanchSauce("");
					}
				}
			});
			setVerticalAlignment(JLabel.TOP);
			setText(null);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};
	
	CheckLabel checkMoms = new CheckLabel();
	boolean checkedMoms = false;
	String sauceMoms = "맘스소스추가";
	
	JLabel optSauceText = new JLabel() {
		{
			setBounds(30, 130, 95, 30);
			setText("맘스소스추가");
			setHorizontalAlignment(JLabel.CENTER);
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(11f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
		}
	};

	JButton momsSauce = new JButton() {
		{
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/menu/sauce/맘스양념소스.png"));
				Image scaledImage = bufferedImage.getScaledInstance(95, 60, Image.SCALE_SMOOTH);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBounds(30, 40, 95, 95);
			setHorizontalAlignment(JLabel.CENTER);
			add(checkMoms);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (checkedMoms == false) {
						checkMoms.setVisible(true);
						checkedMoms = true;
						getOption.setMomsSauce("맘스소스추가");
					} else if (checkedMoms == true) {
						checkMoms.setVisible(false);
						checkedMoms = false;
						getOption.setMomsSauce("");
					}
				}
			});
			setVerticalAlignment(JLabel.TOP);
			setText(null);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};
	JLabel sauceLabel = new JLabel() {
		{
			add(longGrayLabel4);
			add(shortGrayLabel4);
			add(lanch);
			add(optLanchText);
			add(momsSauce);
			add(optSauceText);
			setBackground(Color.WHITE);
			setLocation(0, chickenLabel.getHeight() + sideLabel.getHeight() + beverageLabel.getHeight());
			setSize(585, 170);
			setOpaque(true);
		}
	};
	
	public String getLanchSauce() {
		return getOption.getLanchSauce();
	}
	
	public String getMomsSauce() {
		return getOption.getMomsSauce();
	}
	
	public boolean getCheckedLanch() {
		return checkedLanch;
	}
	
	public boolean getCheckedMoms() {
		return checkedMoms;
	}
	
	public ChickenOptLabel() {
		StringBuilder toShowScroll = new StringBuilder();
		toShowScroll.append("<html>");
		for (int i = 0; i < ((chickenLabel.getHeight() + sideLabel.getHeight() + beverageLabel.getHeight())
				+ sauceLabel.getHeight()) / 16; ++i) {
			toShowScroll.append("<br>");
		}
		toShowScroll.append("</html>");
		String showScroll = toShowScroll.toString();
		add(chickenLabel);
		add(sideLabel);
		add(beverageLabel);
		add(sauceLabel);
		setText(showScroll);
		setSize(sauceLabel.getHorizontalAlignment(), sauceLabel.getHeight());
		setBackground(Color.WHITE);
		setOpaque(true);
	}
}
