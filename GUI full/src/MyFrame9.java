import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame9 extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	public MyFrame9() {
		// JColorChooser - A GUI mechanism that lets a user choose a color
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text :D");
		label.setFont(new Font("Papyrus", Font.PLAIN, 100));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser(); // Creates new instance of JColorChooser
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black); // Opens color chooser dialog and sets color to color chosen
			
			//label.setForeground(color);
			label.setBackground(color);
		}
	}
}
