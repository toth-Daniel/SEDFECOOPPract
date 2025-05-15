import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SEDFECProg8 extends Frame implements WindowListener
{

	public SEDFECProg8()
	{
		super("Neptun kód színek");
		setSize(400, 200);
		setBackground(Color.yellow);
		addWindowListener(this);
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

	public void paint(Graphics g) {
		Rectangle r = getBounds();
		g.setColor(Color.red);
		g.fillRect(0, 0, r.width-25, r.height-25);
		g.setColor(Color.blue);
		g.fillRect(200, 0, r.width-25, r.height-25);
		g.setColor(Color.green);
		g.fillRect(0, 100, r.width-25, r.height-25);
		g.setColor(Color.black);
		g.fillRect(200, 100, r.width-25, r.height-25);


	}

    public static void main(String[] args) {
		SEDFECProg8 p = new SEDFECProg8();
		p.setVisible(true);
	}
}
