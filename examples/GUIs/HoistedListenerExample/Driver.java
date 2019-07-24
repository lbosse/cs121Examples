import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hoisted Listener Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MainPanel());
		
		frame.pack();
		frame.setVisible(true);
	}

}
