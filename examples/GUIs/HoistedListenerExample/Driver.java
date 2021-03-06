import java.awt.Dimension;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hoisted Listener Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* getContentPane gets the Container inside the JFrame that can have components added to it */
		frame.getContentPane().add(new MainPanel());
		
		frame.setPreferredSize(new Dimension(500, 500)); // Sets the preferred size of the JFrame (will try to fit it if it can)
		frame.pack(); // Takes the preferred size and packs the JFrame to fit the preferred size of the frame and layout of the components
		frame.setVisible(true);
	}

}
