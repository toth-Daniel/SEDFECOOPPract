import javax.swing.*;
import java.awt.*;

public class Rajz0 extends JFrame
{
	public Rajz0()
	{
	super("Név");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(800, 200);
	setBackground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		Rectangle r = getBounds();
		g.setColor(Color.yellow);
		g.fillRect(10, 35, r.width-20, r.height-45);

		for (int i = 0; i < 5; i++)
		{
			Font f = new Font("Calibri", Font.BOLD | Font.ITALIC, 12+i*6);
			g.setFont(f);
			g.setColor(Color.black);
			g.drawString("Java API, Grafikus felületű alkalmazások", 20, 20+i*40);
		}
	}

	public static void main(String[] args)
	{
		Rajz0 r = new Rajz0();
		r.setVisible(true);
	}
}
