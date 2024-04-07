package graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class DrawCircles extends Frame
{
	private Image goku;

	public DrawCircles(String name) throws InterruptedException, IOException
	{
		super(name);
		this.setSize(500, 500);

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
		g.setColor(Color.black);
		g.drawOval(200, 100, 300, 300);
		
		//TODO: explore other graphics methods! What else can we draw!
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
