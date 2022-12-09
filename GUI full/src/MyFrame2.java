import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener {
	
	private static JButton button; // Declares new button
	private static JLabel label;
	
	public MyFrame2() {
		
		ImageIcon icon = new ImageIcon("clickbate.png");
		ImageIcon icon2 = new ImageIcon("dead.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		//JButton - a button that performs an action when clicked on
		
		button = new JButton(); // Creates new button
		button.setBounds(100,100,250,150); // Sets bounds for button
		button.addActionListener(this); // Adds ActionListener to monitor button
		//Lambda expression without implementing ActionListener
		//button.addActionListener(e -> System.out.println("Gamin"));
		button.setText("I is a button, wow"); // Adds text to button
		button.setFocusable(false); // Makes text in button not focused
		button.setIcon(icon); // Adds icon to button
		button.setHorizontalTextPosition(JButton.CENTER); // Sets horizontal text position in button
		button.setVerticalTextPosition(JButton.BOTTOM); // Sets vertical text position in button
		button.setFont(new Font("Comic Sans", Font.BOLD, 25)); // Sets font for text in button
		button.setIconTextGap(-5); // Sets gap between text & icon in button
		button.setForeground(Color.MAGENTA); // Sets color of text in button
		button.setBackground(Color.LIGHT_GRAY); // Sets background color of button
		button.setBorder(BorderFactory.createEtchedBorder()); // Sets border fo button
		//button.setEnabled(false); // Sets if button is enabled
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button ) {
			//System.out.println("Gamin");
			button.setEnabled(false); // Sets if button is enabled
			label.setVisible(true);
		}
		
	}
}
