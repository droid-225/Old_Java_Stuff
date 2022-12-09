import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame5 extends JFrame implements ActionListener{
	
	private JRadioButton pizzaButton;
	private JRadioButton hamburgerButton;
	private JRadioButton hotdogButton;
	
	private ImageIcon pizzaIcon;
	private ImageIcon hamburgerIcon;
	private ImageIcon hotdogIcon;
	
	ButtonGroup group;
	
	public MyFrame5() {
		// JRadioButton - One or more buttons in a grouping in which only 1 may be selected per group
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("burger.png");
		hotdogIcon = new ImageIcon("hotdog.png");
		
		pizzaButton = new JRadioButton("pizza");
		pizzaButton.addActionListener(this);
		pizzaButton.setFocusable(false);
		
		hamburgerButton = new JRadioButton("hamburger");
		hamburgerButton.addActionListener(this);
		hamburgerButton.setFocusable(false);	
		
		hotdogButton = new JRadioButton("hotdog");
		hotdogButton.addActionListener(this);	
		hotdogButton.setFocusable(false);
		
		group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered a pizza!");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered a hamburger!");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered a hotdog!");
		}
	}
}
