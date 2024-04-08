package graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class DrawCircles extends Frame
{
	private BufferedImage img;
	public DrawCircles(String name) throws InterruptedException, IOException
	{
		super(name);
		this.setSize(500, 500);
		
		img = ImageIO.read(new File("data/spongebob.png"));

		//Setting a function that runs when the window is closed
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		this.setVisible(true);
	}

	public void paint(Graphics2D g)
	{
		//Pat's smiley face:
		/*g.setColor(Color.black);
		g.fillOval(150, 100, 50, 50);
		g.fillOval(300, 100, 50, 50);

		g.setColor(Color.orange);
		g.fillRect(150, 50, 50, 30);
		g.fillRect(300, 50, 50, 30);

		g.setColor(Color.green);
		g.fillRect(235, 140, 30, 30);

		g.setColor(Color.red);
		g.fillArc(200, 200, 100, 100, 180, 180);

		g.drawString("Pat", 100, 400);*/

		//Joshua's
//		g.setColor(Color.blue);
//		g.drawOval(100, 100, 300, 200);
//		g.drawOval(160, 140, 30, 20);
//		g.drawOval(260, 140, 30, 20);
//		g.drawArc(170, 175, 200, 100, 180, 180);

		g.drawImage(img, 0, 0, null);
	}

	public void run() throws InterruptedException
	{
		Graphics2D g = (Graphics2D)this.getGraphics();
		while(true)
		{
			this.paint(g);
			TimeUnit.SECONDS.sleep(1);
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		DrawCircles f = new DrawCircles("Circles!");
		f.run();
	}
}
