import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel{

	public MyLabel() {
		// JLabel - a GUI display area for a string of text, an image, or both

		ImageIcon labelImage = new ImageIcon("arrow.png"); // Creates new ImageIcon
		Border border = BorderFactory.createLineBorder(Color.BLUE, 3);

		this.setText("Gamin"); // Sets text of label
		this.setIcon(labelImage); // Adds image icon to label
		this.setHorizontalTextPosition(JLabel.CENTER); // Sets text left, center, or right of image icon
		this.setVerticalTextPosition(JLabel.TOP); // Sets text top, center, or bottom of image icon
		this.setForeground(new Color(0xFF0000)); // Sets font color of text
		this.setFont(new Font("Times New Roman", Font.PLAIN, 20)); // Sets font of text
		this.setIconTextGap(-5); // Sets gap of text to image
		this.setBackground(Color.BLACK); // Sets background color
		this.setOpaque(true); // Display background color
		this.setBorder(border); // Sets border for label
		this.setVerticalAlignment(JLabel.CENTER); // Sets vertical position of icon & text within label
		this.setHorizontalAlignment(JLabel.CENTER); // Sets horizontal position of icon & text within label
		this.setBounds(0, 0, 250, 250); // Sets x,y position within frame & dimensions

	}
}
