import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener {

	private static JButton button;
	private static JTextField textField;
	
	public MyFrame3() {
		// JTextField - A GUI textbox component that can be used to add, set, or get text
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		textField.setForeground(Color.GREEN);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("Type whatever");
		//textField.setEditable(false);
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button) {
			System.out.println(textField.getText());
			textField.setEditable(false);
			button.setEnabled(false);
		}
		
	}
	
}
