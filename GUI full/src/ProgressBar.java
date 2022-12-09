import java.awt.*;
import javax.swing.*;

public class ProgressBar {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500); // Sets min and max value for progress bar
	
	public ProgressBar() {
		// Progress Bar - Visual aid to let the user know that an operation is processing
		
		bar.setValue(0); // Sets initial value for progress bar
		bar.setBounds(0,0,420,50); // Sets bounds for progress bar
		bar.setStringPainted(true); // Displays percentage of progress bar filled if true
		bar.setFont(new Font("MV Boli", Font.BOLD, 25)); // Sets font for string in the progress bar
		bar.setForeground(Color.RED); // Changes fill color for progress bar
		bar.setBackground(Color.black); // Changes background color of progess bar
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	
		fill();
	}
	
	public void fill() {
		int counter = 500;
		
		while(counter > 0) {
			bar.setValue(counter);
			try {
				Thread.sleep(50); // Stops program for a specified amount of milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter -= 1;
		}
		bar.setString("Done! :)");
	}
}
