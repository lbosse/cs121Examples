import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class LiteBritePanel extends JPanel {

	private LiteBriteButton[][] buttons;
	
	public LiteBritePanel(int width, int height) {
		buttons = new LiteBriteButton[width][height];
		this.setLayout(new GridLayout(width, height));
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				buttons[i][j] = new LiteBriteButton(new LiteBriteButtonListener());
				this.add(buttons[i][j]);
			}
		}
	}
	
	private class LiteBriteButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			((LiteBriteButton)e.getSource()).toggleState();
		}
		
	}
}
