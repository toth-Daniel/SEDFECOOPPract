import javax.swing.*;
import java.awt.*;

public class SEDFEC_Kepek extends JFrame
{
	ImageIcon icon;
	Image image;

	SEDFEC_Kepek()
	{
		super("Képek méretezése");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setBackground(Color.white);

		icon = new ImageIcon("infoep.jpg");
		image = icon.getImage();

	}

	public void paint(Graphics g)
	{
		Rectangle r = getBounds();
		g.setColor(Color.blue);
		g.drawRect(10, 35, 20, 45);

		int wImage = image.getWidth(this);
		int hImage = image.getHeight(this);
		int xPos = 20;
		int yPos = 45;

		//25%
		g.drawImage(image, xPos, yPos, wImage/4, hImage/4, this);

		//50%
		xPos += (wImage/4) + 20;
		g.drawImage(image, xPos, yPos, wImage/2, hImage/2, this);

		//100%
		xPos += (wImage/2) + 20;
		g.drawImage(image, xPos, yPos, wImage, hImage, this);
	}

	public static void main(String[] args)
	{
		(new SEDFEC_Kepek()).setVisible(true);
	}
}
