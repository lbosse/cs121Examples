import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ClonePanel extends JPanel {
	JButton cloneButton;
	JPanel cloneGroup;
	
	public ClonePanel() {
		// HOW TO SET BOX LAYOUT FOR ACTIVITY 19
		//this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Set layout
		this.setLayout(new BorderLayout());
		// Button setup
		cloneButton = new JButton("CLONE ME");
		cloneButton.addActionListener(new CloneButtonListener());
		// Sub panel
		cloneGroup = new JPanel();
		cloneGroup.setLayout(new GridLayout(0, 5));
		// Add components to this ClonePanel
		this.add(cloneButton, BorderLayout.SOUTH);
		this.add(cloneGroup, BorderLayout.CENTER);
	}
	
	private void addClone() {
		cloneGroup.add(new JLabel(new ImageIcon("cage.jpg")));
		// Try commenting the below line out!
		this.revalidate();
	}
	
	private class CloneButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			addClone();
		}
		
	}
}
