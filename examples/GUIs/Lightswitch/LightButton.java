import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LightButton extends JButton {
	
	private boolean status;
	
	public LightButton() {
		status = false;
		setText("OFF");
		addActionListener(new LightListener());
	}
	
	private class LightListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			status = !status;
			if (status) {
				((LightButton)e.getSource()).setText("ON");
				((LightButton)e.getSource()).setForeground(Color.GREEN);
			} else {
				((LightButton)e.getSource()).setText("OFF");
				((LightButton)e.getSource()).setForeground(Color.GRAY);
			}
		}
	}
}
