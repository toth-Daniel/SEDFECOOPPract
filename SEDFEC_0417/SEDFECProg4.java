import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SEDFECProg4 extends JFrame implements ActionListener
{
	JButton exitButton;

	SEDFECProg4()
	{
		exitButton = new JButton("Exit");
		exitButton.setBounds(100, 100, 100, 30);
		exitButton.addActionListener(this);
		add(exitButton);
		setLayout(null);
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}

	public static void main(String[] args) {
		new SEDFECProg4();
	}
}
