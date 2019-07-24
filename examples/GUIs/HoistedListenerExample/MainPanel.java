import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private DisplayPanel dp;
	private ButtonPanel bp;
	
	public MainPanel() {
		this.setBackground(Color.GRAY);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		dp = new DisplayPanel();
		bp = new ButtonPanel(new ButtonListener());
		
		this.add(dp);
		this.add(bp);
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			dp.setText(((JButton)e.getSource()).getText());
		}
		
	}
	
}
