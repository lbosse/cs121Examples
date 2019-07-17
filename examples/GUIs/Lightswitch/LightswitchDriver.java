import javax.swing.JFrame;
import javax.swing.JLabel;

public class LightswitchDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("LIGHTSWITCHSIMULATOR.EXE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Lightswitch());
		frame.pack();
		frame.setVisible(true);

	}

}
