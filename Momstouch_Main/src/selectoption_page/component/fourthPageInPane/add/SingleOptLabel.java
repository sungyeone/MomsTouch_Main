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

import main_page.MomstouchMainFrame;
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

public class SingleOptLabel extends JLabel{
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
	
	JLabel longGrayLabel1 = new JLabel() {
		{	
			try {
				BufferedImage bufferedImage = ImageIO.read(new File("images/label/회색라벨.png"));
				Image scaledImage = bufferedImage.getScaledInstance(545, 33, Image.SCALE_DEFAULT);
				setIcon(new ImageIcon(scaledImage));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			setBounds(40, 0, 545, 30);
		}
	};
	LayoutManager overlay = new OverlayLayout(longGrayLabel1);
	{
		longGrayLabel1.setLayout(overlay);
	}
	JLabel Text1 = new JLabel() {
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
		longGrayLabel1.add(Text1);
	}
	
	JLabel ShortOrangeLabel1 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	
	JLabel sideLabel = new JLabel() {
		{
			setBackground(Color.WHITE);
			setLocation(0, 0);
			add(longGrayLabel1);
			add(ShortOrangeLabel1);
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
		longGrayLabel2.add(Text2);
	}
	JLabel ShortGrayLabel2 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	
	JLabel beverageLabel = new JLabel() {
		{
			setBackground(Color.WHITE);
			setLocation(0, sideLabel.getHeight());
			add(longGrayLabel2);
			add(ShortGrayLabel2);
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
			setText("초이스");
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
	
	JLabel ShortGrayLabel3 = new JLabel() {
		{
			setBackground(new Color(230, 149, 0));
			setBounds(0, 0, 40, 30);
			setOpaque(true);
		}
	};
	
	String pickleText = "피클제거";
	JLabel optPickleText = new JLabel() {
		{
			setBounds(0, 65, 95, 30);
			setText(pickleText);
			setHorizontalAlignment(JLabel.CENTER);
			setFont(new Font("굴림", Font.BOLD, 11));
			
		}
	};
	
	CheckLabel checkPickle = new CheckLabel();
	boolean checkedPickle = false;
	JButton pickle = new JButton() {
		{
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(16f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
			setText("피클제거");
			setBounds(30, 40, 95, 95);
			setHorizontalAlignment(JLabel.CENTER);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
//			add(optPickleText);
			add(checkPickle);
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (checkedPickle == false) {
						checkPickle.setVisible(true);
						checkedPickle = true;
						getOption.setChoice_pickle(pickleText);
					} else if (checkedPickle == true) {
						checkPickle.setVisible(false);
						checkedPickle = false;
					}
				}
			});
			setVerticalAlignment(JLabel.CENTER);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};

	String lettuceText = "양상추제거";

	JLabel optLettuceText = new JLabel() {
		{
			setBounds(0, 0, 95, 30);
			setText(lettuceText);
			setHorizontalAlignment(JLabel.CENTER);
			setFont(new Font("굴림", Font.BOLD, 11));
		}
	};
	
	CheckLabel checkLettuce = new CheckLabel();
	boolean checkedLettuce = false;

	JButton lettuce = new JButton() {
		{
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(16f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
			setText("양상추제거");
			setBounds(170, 40, 110, 95);
			setHorizontalAlignment(JLabel.CENTER);
			setBorderPainted(false);
			setFocusPainted(false);
			setContentAreaFilled(false);
//			add(optLettuceText);
			add(checkLettuce);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (checkedLettuce == false) {
						checkLettuce.setVisible(true);
						checkedLettuce = true;
						getOption.setChoice_lettuce(lettuceText);
					} else if(checkedLettuce == true) {
						checkLettuce.setVisible(false);
						checkedLettuce = false;
					}
				}
			});
			setVerticalAlignment(JLabel.CENTER);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};
	
	String tomatoText = "토마토제거";
	JLabel optTomatoText = new JLabel() {
		{
			setBounds(0, 90, 95, 30);
			setText(tomatoText);
			setHorizontalAlignment(JLabel.CENTER);
			setFont(new Font("굴림", Font.BOLD, 11));
		}
	};
	
	CheckLabel checkTomato = new CheckLabel();
	boolean checkedTomato = false;
	JButton tomato = new JButton() {
		{
			try {
			       //create the font to use. Specify the size!
			       Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("images/font/NanumSquareNeo-dEb.ttf")).deriveFont(16f);
			       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			       //register the font
			       ge.registerFont(customFont);
			       setFont(customFont);
			   } catch (IOException e) {
			       e.printStackTrace();
			   } catch(FontFormatException e) {
			       e.printStackTrace();
			   }
			setText("토마토제거");
			setBounds(310, 40, 110, 95);
			setHorizontalAlignment(JLabel.CENTER);
			setBorderPainted(false);
			setFocusPainted(false); 
			setContentAreaFilled(false);
//			add(optTomatoText);
			add(checkTomato);
			addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (checkedTomato == false) {
						checkTomato.setVisible(true);
						checkedTomato = true;
						getOption.setChoice_tomato(tomatoText);
					} else if(checkedTomato == true) {
						checkTomato.setVisible(false);
						checkedTomato = false;
					}
				}
			});
			setVerticalAlignment(JButton.CENTER);
			setOpaque(true);
			setBackground(Color.WHITE);
		}
	};
	
	JLabel choiceLabel = new JLabel() {
		{
			add(longGrayLabel3);
			add(ShortGrayLabel3);
			add(pickle);
			add(lettuce);
			add(tomato);
			setBackground(Color.WHITE);
			setLocation(0, sideLabel.getHeight() + beverageLabel.getHeight());
			setSize(585, 170);
			setOpaque(true);
		}
	};
	
	public String getChoicePickle() {
		return getOption.getChoice_pickle();
	}
	
	public String getChoiceTomato() {
		return getOption.getChoice_tomato();
	}
	
	public String getChoiceLettuce() {
		return getOption.getChoice_lettuce();
	}
	
	public boolean getCheckedPickle() {
		return checkedPickle;
	}
	
	public boolean getCheckedTomato() {
		return checkedTomato;
	}
	
	public boolean getCheckedLettuce() {
		return checkedLettuce;
	}
	
	JLabel LongGrayLabel4 = new JLabel() {
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
	LayoutManager overlay4 = new OverlayLayout(LongGrayLabel4);
	{
		LongGrayLabel4.setLayout(overlay4);
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
		LongGrayLabel4.add(Text4);
	}

	JLabel ShortOrangeLabel4 = new JLabel() {
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
			add(LongGrayLabel4);
			add(ShortOrangeLabel4);
			add(lanch);
			add(optLanchText);
			add(optSauceText);
			add(momsSauce);
			setBackground(Color.WHITE);
			setLocation(0, sideLabel.getHeight() + beverageLabel.getHeight() + choiceLabel.getHeight());
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

	public SingleOptLabel() {
		StringBuilder toShowScroll = new StringBuilder();
		toShowScroll.append("<html>");
		for (int i = 0; i < ((sideLabel.getHeight() + beverageLabel.getHeight() + choiceLabel.getHeight())
				+ sauceLabel.getHeight()) / 16; ++i) {
			toShowScroll.append("<br>");
		}
		toShowScroll.append("</html>");
		String showScroll = toShowScroll.toString();
		add(sideLabel);
		add(beverageLabel);
		add(choiceLabel);
		add(sauceLabel);
		setSize(sideLabel.getHorizontalAlignment(),
				sideLabel.getHeight() + beverageLabel.getHeight() + choiceLabel.getHeight() + sauceLabel.getHeight());
		setText(showScroll);
		setBackground(Color.WHITE);
		setOpaque(true);
		setAutoscrolls(true);
	}
}
