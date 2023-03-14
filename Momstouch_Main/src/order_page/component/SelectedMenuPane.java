package order_page.component;


import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;



public class SelectedMenuPane extends JScrollPane{
	
	
	
	public SelectedMenuPane(JLabel selectedMenuSpace) {
		
		setBounds(0, 735, 375, 226);
		selectedMenuSpace.setOpaque(true);
		setBorder(new TitledBorder(new LineBorder(Color.white, 1, true)));
		//		setBackground(Color.black);
		setViewportView(selectedMenuSpace);
		selectedMenuSpace.setBackground(Color.white);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		//selectedMenuLabel.revalidate();
		//setLayout(null);
		MouseAdapter ma = new MouseAdapter() {
			private Point origin;

			@Override
			public void mousePressed(MouseEvent e) {
				origin = new Point(e.getPoint());
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				if (origin != null) {

					JViewport viewPort = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class, selectedMenuSpace);
					if (viewPort != null) {
						int deltaX = origin.x - e.getX();
						int deltaY = origin.y - e.getY();

						Rectangle view = viewPort.getViewRect();
						view.x += deltaX;
						view.y += deltaY;

						selectedMenuSpace.scrollRectToVisible(view);

					}
				}
			}
		};
		selectedMenuSpace.addMouseListener(ma);
		selectedMenuSpace.addMouseMotionListener(ma);
	}
}
