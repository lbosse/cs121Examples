import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Lightswitch extends JButton {
	private boolean state; // If false, light is off
	
	public Lightswitch() {
		state = false;
		this.setText("OFF");
		this.setForeground(Color.GRAY);
		this.addActionListener(new LightswitchListener());
	}
	
	private class LightswitchListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			state = !state;
			JButton source = ((JButton)e.getSource());
			if (state) {
				source.setText("ON");
				source.setForeground(Color.BLACK);
			} else {
				source.setText("OFF");
				source.setForeground(Color.GRAY);
			}
		}
		
	}
}
