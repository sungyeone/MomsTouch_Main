package selectoption_page.component.fourthPageInPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;

public class FourthPagePane extends JScrollPane {
	
	
	public FourthPagePane(JLabel menuLabel) {
		//setLayout(null);
		setBounds(0, 230, 585, 370);
		setBackground(Color.WHITE);
		setViewportView(menuLabel);
//		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
		getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
		
		MouseAdapter ma = new MouseAdapter() {
			private Point origin;
			
			@Override
			public void mousePressed(MouseEvent e) {
				origin = new Point(e.getPoint());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if (origin != null) {
					
					JViewport viewPort = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class, menuLabel);
					if (viewPort != null) {
						int deltaX = origin.x - e.getX();
						int deltaY = origin.y - e.getY();
						
						Rectangle view = viewPort.getViewRect();
						view.x += deltaX;
						view.y += deltaY;
						
						menuLabel.scrollRectToVisible(view);
						
					}
				}
			}
		};
		menuLabel.addMouseListener(ma);
		menuLabel.addMouseMotionListener(ma);
	}
}
