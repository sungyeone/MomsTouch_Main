package selectsingleorcombo_page;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.BurgerInfo;
import model.selectedoption.SelectedMenuInfo;
import order_page.OrderPanel;
import selectoption_page.component.BurgerSetFrame;
import selectoption_page.component.BurgerSingleFrame;
import tool.FontTool;

public class SelectSingleOrComboFrame extends JFrame {
	
	JFrame f = this;
	
	SingleBtn singleBtn;
	SetBtn setBtn;
	NumberLabel numberLabel = new NumberLabel();
	PlusBtn plusBtn = new PlusBtn(numberLabel);
	MinusBtn minusBtn = new MinusBtn(numberLabel);
	LineLabel lineLabel = new LineLabel();
	JTextArea descriptionArea = new JTextArea();
	JLabel imageLabel = new JLabel() {
		{
			setSize(220, 200);
			setLocation(30, 80);
		}
	};
	
	
	public SelectSingleOrComboFrame(BurgerInfo[] burgerInfo, int num, OrderPanel op) {
		int burgerCode = burgerInfo[num].getBurger_code();
		String burgerName = burgerInfo[num].getBurger_name();
		int burgerPrice = burgerInfo[num].getBurger_price();
		int comboPrice = burgerInfo[num].getCombo_price();
		
		singleBtn = new SingleBtn(burgerInfo, num);
		setBtn = new SetBtn(burgerInfo, num);
		
		lineLabel.setText(burgerName);
		lineLabel.setHorizontalAlignment(+JLabel.CENTER);
		lineLabel.setForeground(Color.white);
		// lineLabel.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		lineLabel.setFont(FontTool.boldNanumSquare(20f));
		
		descriptionArea.setLineWrap(true); 
		descriptionArea.setEditable(false);
		descriptionArea.setBounds(267, 160, 180, 100);
		descriptionArea.setText(burgerInfo[num].getBurger_info());
		// descriptionArea.setFont(new Font("고딕체", Font.PLAIN, 13));
		descriptionArea.setFont(FontTool.boldNanumSquare(15f));
		descriptionArea.setOpaque(true);
		descriptionArea.setBackground(Color.white);
		
		BufferedImage bufferedImage;
		
		String imagePath = burgerInfo[num].getBurger_image_link();
		
		try {
			bufferedImage = ImageIO.read(new File(imagePath));
			Image scaledImage =
					bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
			imageLabel.setIcon(new ImageIcon(scaledImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		singleBtn.setContentAreaFilled(false);
		singleBtn.setFocusPainted(false);
		setBtn.setContentAreaFilled(false);
		setBtn.setFocusPainted(false);
		singleBtn.setOpaque(true);
		setBtn.setOpaque(true);
		
		getContentPane().setForeground(new Color(243, 156, 18));
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 498, 479);
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		setResizable(false);
		setVisible(true);
		
		add(singleBtn);
		add(setBtn);	
		add(plusBtn);
		add(numberLabel);
		add(minusBtn);
		add(lineLabel);
		add(imageLabel);
		add(descriptionArea);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
            public void windowClosing(WindowEvent e) {
                op.unlock();
            }
		});
		
		
		setBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SelectedMenuInfo selectedMenuInfo = new SelectedMenuInfo();
				selectedMenuInfo.setCode(burgerCode);
				selectedMenuInfo.setName(burgerName + "세트");
				selectedMenuInfo.setPrice(comboPrice * getQuantity());
				selectedMenuInfo.setCombo(true);
				selectedMenuInfo.setQuantity(getQuantity());
				
//				SelectOptionPage page = new SelectOptionPage();
//				page.viewOptionPage(selectedBurgerInfo, op);
				
//				op.addSelectedMenu(selectedMenuInfo);
//				op.unlock();
				new BurgerSetFrame(burgerInfo, num, op, selectedMenuInfo);
				f.dispose();
				
			}
		});
		
		singleBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SelectedMenuInfo selectedMenuInfo = new SelectedMenuInfo();
				selectedMenuInfo.setCode(burgerCode);
				selectedMenuInfo.setName(burgerName + "단품");
				selectedMenuInfo.setPrice(burgerPrice * getQuantity());
				selectedMenuInfo.setQuantity(getQuantity());
//				op.addSelectedMenu(selectedMenuInfo);
//				op.unlock();
				new BurgerSingleFrame(burgerInfo, num, op, selectedMenuInfo);
				f.dispose();
			}
		});
		
	}
	
	public int getQuantity() {
		return Integer.parseInt(numberLabel.getText());
	}
	
	
		
	
}

