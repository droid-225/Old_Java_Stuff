import java.awt.*;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame;
		JLabel label;
		JLabel label2;
		
		frame = new JFrame("Something");
		//frame.setIconImage();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.blue);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		label2 = new JLabel();
		label2.setBackground(Color.red);
		label2.setBounds(200,200,100,100);
		label2.setOpaque(true);
		
		MouseMotionListener mouse = null;
		
		label.addMouseMotionListener(mouse);
		
		/*
		JLabel label = new JLabel("Hello");
		label.setBounds(200,200,100,100);
		panel.add(label);
		*/
		
		frame.add(label);
		frame.add(label2);
		frame.setVisible(true);
	}

}
