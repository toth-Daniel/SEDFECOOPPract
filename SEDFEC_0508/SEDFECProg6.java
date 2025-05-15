import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SEDFECProg6 extends JFrame implements ActionListener
{

	JButton exitButton;
	JButton previousButton;
	JButton changeButton;

	SEDFECProg6()
	{
		exitButton = new JButton("Exit");
		previousButton = new JButton("Previous");
		changeButton = new JButton("It works!");

		exitButton.setBounds(10, 100, 100, 30);
		exitButton.addActionListener(this);

		previousButton.setBounds(120, 100, 100, 30);
		previousButton.addActionListener(this);

		changeButton.setBounds(230, 100, 100, 30);
		changeButton.addActionListener(this);

		setLayout(null);

		add(exitButton);
		add(previousButton);
		add(changeButton);

		setSize(400, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitButton)
		{
			System.exit(0);
		} else if (e.getSource() == previousButton)
		{
			setTitle("Previous");
		} else if (e.getSource() == changeButton)
		{
			setTitle("It works!");
		}
	}

	public static void main(String[] args)
	{
		new SEDFECProg6();
	}
}
