import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	// It's important to have the DisplayPanel as an instance variable so
	// that we can access it in the listener.
	private DisplayPanel dp;
	
	public MainPanel() {
		this.setBackground(Color.GRAY);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		dp = new DisplayPanel();
		ButtonPanel bp = new ButtonPanel(new ButtonListener());
		
		this.add(dp);
		this.add(bp);
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Call the DisplayPanel's setText method to set the TextArea
			// text to the text of the clicked button
			dp.setText(((JButton)e.getSource()).getText());
		}
		
	}
	
}
