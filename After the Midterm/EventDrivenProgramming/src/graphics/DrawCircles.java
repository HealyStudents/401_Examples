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
		
		this.goku = ImageIO.read(new File("data/goku.png"));
		
		this.run();
	}

	public void paint(Graphics2D g)
	{
		g.setColor(Color.black);
		g.drawLine(25, 100, 400, 100);
		g.drawOval(200, 100, 300, 300);
		g.fillOval(100,100,50,50);
		
		g.fillRect(100, 300, 100,100);
		
		g.drawString("Circles (Pat Healy, 2023)", 100, 450);
		g.drawImage(goku, -25,0, null);
		//g.drawArc(0,0);
	}

	public void run() throws InterruptedException
	{
		Graphics2D g = (Graphics2D)this.getGraphics();
		while(true)
		{
			this.paint(g);
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		DrawCircles f = new DrawCircles("Circles!");
	}
}
