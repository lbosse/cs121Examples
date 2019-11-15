import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("LIGHTSWITCHSIMULATOR.EXE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Causes the program to exit when the window is closed
		
		/* getContentPane gets the Container inside the JFrame that can have components added to it */
		frame.getContentPane().add(new Lightswitch()); 
		
		frame.setPreferredSize(new Dimension(500, 500)); // Sets the preferred size of the JFrame (will try to fit it if it can)
		frame.pack(); // Takes the preferred size and packs the JFrame to fit the preferred size of the frame and layout of the components
		frame.setVisible(true);

	}

}
