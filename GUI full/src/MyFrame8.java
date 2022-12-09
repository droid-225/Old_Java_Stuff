import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame8 extends JFrame implements ActionListener {

	JButton button;
	
	public MyFrame8() {
		// JFileChooser - A GUI mechanism that let's a user choose a file (helpful for opening or saving files)

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File(".")); // Sets default directory file chooser opens to
			
			//int response = fileChooser.showOpenDialog(null); // Select file to open, returns int value, 0 if file is selected
			int response = fileChooser.showSaveDialog(null); // Select file to save
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); // Gets file path of selected file
				System.out.println(file);
			}
			
		}	
	}
}
