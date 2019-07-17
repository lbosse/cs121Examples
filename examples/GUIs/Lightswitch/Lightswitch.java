import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Lightswitch extends JButton {
	private boolean state; // If false, light is off
	
	public Lightswitch() {
		state = false;
		this.setText("OFF");
		this.addActionListener(new LightswitchListener());
	}
	
	private class LightswitchListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			state = !state;
			if (state) {
				((JButton)e.getSource()).setText("ON");
			} else {
				((JButton)e.getSource()).setText("OFF");
			}
		}
		
	}
}
