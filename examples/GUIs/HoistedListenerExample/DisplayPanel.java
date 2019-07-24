import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisplayPanel extends JPanel {
	private JTextArea textArea;
	
	public DisplayPanel() {
		this.setBackground(Color.YELLOW);
		
		// Text area that will display clicked button text
		this.textArea = new JTextArea("Button text will display here");
		
		this.add(textArea);
	}
	
	/**
	 * This method sets the text on this DisplayPanel's text area
	 * @param text The text to be put in the text area
	 */
	public void setText(String text) {
		this.textArea.setText(text);
	}
}
