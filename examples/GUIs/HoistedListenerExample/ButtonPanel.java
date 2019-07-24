import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public ButtonPanel(ActionListener buttonListener) {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.GREEN);
		
		// Create two JButtons to add to this ButtonPanel
		JButton boom = new JButton("BOOM");
		JButton pow = new JButton("POW");
		
		// Add buttonListener to each button
		boom.addActionListener(buttonListener);
		pow.addActionListener(buttonListener);
		
		// Finally, add the JButtons to this ButtonPanel
		this.add(boom);
		this.add(pow);
	}
}
