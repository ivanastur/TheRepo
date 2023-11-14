import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		JButton button = new JButton("XD");
		String message = "Hola " + System.getProperty("user.name");
		button.addActionListener(l -> {
			JOptionPane.showMessageDialog(null, message, message, JOptionPane.ERROR_MESSAGE);
		});
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
