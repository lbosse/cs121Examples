import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LiteBriteButton extends JButton {

	public enum State { ON, OFF };
	private State state;
	
	public LiteBriteButton(ActionListener listener) {
		this.state = State.OFF;
		this.setText(State.OFF.name());
		this.addActionListener(listener);
	}
	
	public void toggleState() {
		if (this.state == State.ON) {
			this.state = State.OFF;
			this.setText(State.OFF.name());
		} else {
			this.state = State.ON;
			this.setText(State.ON.name());
		}
	}
}
