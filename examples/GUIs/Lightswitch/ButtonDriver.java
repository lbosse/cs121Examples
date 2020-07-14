import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lightswitch");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(new LightButton());
		frame.getContentPane().add(buttonPanel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
