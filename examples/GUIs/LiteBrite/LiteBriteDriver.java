import javax.swing.JFrame;

public class LiteBriteDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("LIGHTBRITESIMULATOR.EXE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new LiteBritePanel(5, 5));
		frame.pack();
		frame.setVisible(true);
	}

}
