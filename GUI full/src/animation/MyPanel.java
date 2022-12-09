package animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener {
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	
	Image dvd;
	Image backgroundImage;

	Timer timer;
	
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	public MyPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.blue);
		
		dvd = new ImageIcon("dvd.png").getImage();
		backgroundImage = new ImageIcon("watcher.png").getImage();
		
		timer = new Timer(10, this);
		timer.start();
	}

	public void paint(Graphics g) {
		
		super.paint(g); // Paints background
		
		Graphics2D g2D = (Graphics2D)g;
	
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(dvd, x, y, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH - dvd.getWidth(null) || x < 0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		
		if(y >= PANEL_HEIGHT - dvd.getHeight(null) || y < 0) {
				yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
			
		repaint();
		
	}

}
