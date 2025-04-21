import javax.swing.*;
import java.awt.*;

public class SEDFECProg3 extends JFrame
{
	JLabel label1, label2;

	SEDFECProg3()
	{
		label1 = new JLabel("Informatikatanár MEd");
		label2 = new JLabel("Informatikatanár 2025");

		label1.setBounds(50, 50, 250, 30);
		label2.setBounds(50, 100, 250, 30);

		add(label1);
		add(label2);

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		setSize(400, 300);
	}

	public static void main(String[] args)
	{
		new SEDFECProg3();
	}
}
