import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setTitle("JFrame title"); //Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of application
		this.setResizable(false); //Prevents frame from being resized
		this.setSize(500,500); //Sets x-dimension and y-dimension of frame
		//frame.setLayout(null); // Sets Layout for frame
		//frame.add(label); //Adds label to frame
		//this.pack(); // Sizes frame to fit all components
		this.setVisible(true); //Makes frame visible

		ImageIcon deadImage = new ImageIcon("dead.png"); //Creates an ImageIcon
		this.setIconImage(deadImage.getImage()); //Changes icon of this
		this.getContentPane().setBackground(new Color(173, 231, 201)); //Changes color of backgroun
	}
}
