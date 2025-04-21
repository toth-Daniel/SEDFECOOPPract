import javax.swing.*;

public class HelloGr
{
	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Helló grafikusan!");
		mainFrame.setBounds(50, 50, 260, 150);
		mainFrame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Helló világ!!");
		label.setBounds(30, 10, 100, 20);
		mainFrame.getContentPane().add(label);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//mainFrame.setSize(300, 200);
		mainFrame.setVisible(true);
	}
}
