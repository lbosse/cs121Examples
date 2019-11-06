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
        /* We can call setText like this because our LightSwitchListener is inside
         * our Lightswitch class - so our Lightswitch's setText method is visible -
         * it is "in scope".
         */
				setText("ON");
			} else {
				setText("OFF");
			}
		}
		
	}
}
