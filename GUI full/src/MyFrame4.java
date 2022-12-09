import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener{
	
	private static JCheckBox checkBox;
	private static JButton button;
	
	private static ImageIcon xIcon;
	private static ImageIcon checkIcon;
	
	public MyFrame4() {
		// JCheckBox - A GUI component that can be selected or deselected
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("x.png");
		checkIcon = new ImageIcon("check.png");
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm a Gamer");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
		
	}
}
