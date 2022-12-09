import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public SliderDemo() {
		// JSlider - GUI component that lets the user enter a value
		//			 by using an adjustable sliding knob on a track.
	
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // Sets min, max, and starting values for slider
		
		slider.setPreferredSize(new Dimension(400,200)); // Sets preferred dimensions for slider
		
		slider.setPaintTicks(true); // Paints ticks on slider
		slider.setMinorTickSpacing(10); // Sets spacing value for minor ticks on slider
		
		slider.setPaintTrack(true); // Paints tracks on slider
		slider.setMajorTickSpacing(25); // Sets spacing value for major ticks on slider
		
		slider.setPaintLabels(true); // Paints values on major ticks on slider
		slider.setFont(new Font("Times New Roman", Font.PLAIN, 15)); // Sets font for values on slider
		
		slider.setOrientation(SwingConstants.VERTICAL); // Makes the slider vertical
		//slider.setOrientation(SwingConstants.HORIZONTAL); // Makes the slider horizontal
			
		label.setText("°C = " + slider.getValue());
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20)); // Sets font for values on slider
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("°C = " + slider.getValue());
		
	}
}
