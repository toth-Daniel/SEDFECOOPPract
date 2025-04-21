import javax.swing.*;

public class SEDFECProg2 extends JFrame
{
	JLabel label;


	SEDFECProg2()
	{
		label = new JLabel("Informatika tanár MEd");
		add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 300);
	}

	public static void main(String[] args)
	{
		new SEDFECProg2();
	}
}
