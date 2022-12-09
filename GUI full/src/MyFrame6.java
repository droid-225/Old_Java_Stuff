import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame6 extends JFrame implements ActionListener {
	
	JComboBox comboBox;
	
	public MyFrame6() {
		// JComboBox - A component that combines a button or editable field and a drop-down list
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"Dog","Cat","Bird"};
		// Primitive data types such as 'int' or 'double' does not work,
		// use wrapper class such as 'Integer' or 'Double' to create arrays
		// for combo box.
	
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true); // Allows user to search for item
		//System.out.println(comboBox.getItemCount()); // Prints number of items in combo box
		//comboBox.addItem("Horse"); // Adds new item to combo box
		//comboBox.insertItemAt("Pig", 0); // Adds item to specified index
		//comboBox.setSelectedIndex(0); // Sets what index will be selected when program first runs
		//comboBox.removeItem("Cat"); // Removes item with specified name from combo box
		//comboBox.removeItemAt(0); // Removes item from specified index from combo box
		//comboBox.removeAllItems(); // Removes all items from combo box
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			//System.out.println(comboBox.getSelectedItem()); // Prints out selected item
			System.out.println(comboBox.getSelectedIndex()); // Prints index of selected item	
		}
	}
	
}
