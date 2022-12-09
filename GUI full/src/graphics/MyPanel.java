package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	Image image;
	
	public MyPanel() {
		
		image = new ImageIcon("dumb.png").getImage();
		this.setPreferredSize(new Dimension(500,500));
		
	}
	
	public void paint(Graphics g) { // 'paint' method automatically called by components
		// Note: More Recently created graphics will overlap pre-existing graphics
		
		Graphics2D g2D = (Graphics2D)g; // Creates new Graphics2D object by casting g into the Graphics2D class
	
		g2D.drawImage(image, 0, 0, null); // Displays image with an Image, x,y values & an ImageObserver
		
		g2D.setPaint(Color.blue); // Sets color of graphics
		//g2D.setStroke(new BasicStroke(5)); // Sets thickness of graphics
		
		//g2D.drawLine(0, 0, 500, 500); // Draws a line with initial and final x,y values
		
		//g2D.setPaint(Color.pink); // Sets color of graphics		
		//g2D.drawRect(0, 0, 100, 200); // Draws a rectangle or square with x,y values & width and height values
		//g2D.fillRect(0, 0, 100, 200); // Draws a filled in rectangle or square with same parameters
	
		//g2D.setPaint(Color.orange); // Sets color of graphics
		//g2D.drawOval(0, 0, 100, 100); // Draws an oval or circle with same parameters
		//g2D.fillOval(0, 0, 100, 100); // Draws a filled oval or circle with same parameters
	
		g2D.setPaint(Color.red);
		//g2D.drawArc(0, 0, 100, 100, 180, 180); // Draws an arc with initial x,y values, width and height values 
											 //	& starting and arc angle values  
		g2D.fillArc(0, 0, 100, 100, 0, 180); // Draws a filled arc with same parameters
		g2D.setPaint(Color.white);
		g2D.fillArc(0, 0, 100, 100, 180, 180); // Draws a filled arc with same parameters
		
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		g2D.setPaint(Color.yellow);
		//g2D.drawPolygon(xPoints, yPoints, 3); // Draws a polygon with an array of x and y values & a number of points
		g2D.fillPolygon(xPoints, yPoints, 3); // Draws a filled polygon with the same parameters
		
		//g2D.setColor(Color.magenta);
		//g2D.setFont(new Font("Comic Sans", Font.BOLD, 50));
		//g2D.drawString("U R A GAMER!", 50, 50); // Displays text with string & x,y value
	}
}
