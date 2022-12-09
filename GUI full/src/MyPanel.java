import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	public MyPanel() {
		// JPanel - a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("eye.png");

		JLabel label = new JLabel();
		label.setText("Hello");
		label.setIcon(icon);
		// label.setVerticalAlignment(JLabel.BOTTOM); // Use if using border layout
		// label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 100, 75);

		this.setBackground(Color.red); // Sets background color of panel
		this.setBounds(0, 0, 250, 250); // Sets bounds for panel
		this.setLayout(null); // Sets layout type of panel
		this.add(label); // Adds label to panel
	}
}
