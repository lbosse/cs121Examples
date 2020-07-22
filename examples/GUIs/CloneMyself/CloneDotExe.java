import javax.swing.JFrame;

public class CloneDotExe {
	public static void main(String[] args) {
		JFrame frame = new JFrame("CLONE.EXE");
		frame.getContentPane().add(new ClonePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
