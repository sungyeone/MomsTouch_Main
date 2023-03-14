package payment_page.shopping_list;

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

public class ShoppingListPane extends JScrollPane{
	
	
	public ShoppingListPane(JLabel shoppingListSpace) {
		
		setBounds(23, 60, 285, 390);
		shoppingListSpace.setOpaque(true);
		
		setViewportView(shoppingListSpace);
		setBorder(new TitledBorder(new LineBorder(new Color(226, 226, 226), 2)));
		shoppingListSpace.setBackground(Color.white);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		
		
		
		MouseAdapter ma = new MouseAdapter() {
			private Point origin;

			@Override
			public void mousePressed(MouseEvent e) {
				origin = new Point(e.getPoint());
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				if (origin != null) {

					JViewport viewPort = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class, shoppingListSpace);
					if (viewPort != null) {
						int deltaX = origin.x - e.getX();
						int deltaY = origin.y - e.getY();

						Rectangle view = viewPort.getViewRect();
						view.x += deltaX;
						view.y += deltaY;

						shoppingListSpace.scrollRectToVisible(view);

					}
				}
			}
		};
		shoppingListSpace.addMouseListener(ma);
		shoppingListSpace.addMouseMotionListener(ma);
		
	}
}
