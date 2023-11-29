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

		//this.run();
	}

	public void paint(Graphics2D g)
	{
		g.setColor(Color.black);
		//g.drawLine(25, 100, 400, 100);
		//g.drawOval(200, 100, 300, 300);
		//g.setColor(Color.red);
		//g.fillOval(100,100,50,50);
		//g.drawArc(200, 200, 200, 200, 180, 360);
		//g.fillRect(100, 300, 100,100);
		//g.drawString("Circles (Pat Healy, 2023)", 100, 450);
		//g.drawImage(goku, -25,0, null);
		//g.drawArc(0,0);

		//Chris Fu
		//		g.setColor(Color.black);
		//		// g.drawLine(25, 100, 400, 100);
		//		//g.drawOval(200, 100, 300, 100);
		//		g.fillOval(100,200,50,50);
		//		g.fillOval(300,200,50,50);
		//		//.fillRect(100, 300, 100,100);
		//		g.drawArc(130, 200, 200, 300, 180, 180);
		//g.drawString("Circles (Pat Healy, 2023)", 100, 450);

		//eric
		//		g.setColor(Color.black);
		//        g.drawOval(100,100,50,50);
		//        g.drawOval(400,100,50,50);
		//        g.drawArc(125, 250, 300, 100, 180, 180);
		//        g.drawString("my guy built diff", 100, 450);

		//Aidan
		g.setColor(Color.yellow);
		g.drawOval(100, 100, 250, 250);
		g.fillOval(100, 100, 250, 250);
		g.setColor(Color.black);
		g.drawOval(150, 150, 50, 50);
		g.fillOval(150, 150, 50, 50);
		g.drawOval(250, 150, 50, 50);
		g.fillOval(250, 150, 50, 50);
		g.drawArc(175, 200, 100, 100, 180, 180);


		//Zach
		//		g.setColor(Color.black);
		//        g.drawLine(75, 100, 150, 100);
		//        g.fillOval(300,100, 50,50);
		//        g.fillOval(100,100,50,50);
		//
		//        g.fillRect(200, 300, 100,100);
		//
		//        g.drawString("Smiley (Zach Hans, 2023)", 100, 450);

		//Christopher
		//		 g.setColor(Color.BLUE);
		//
		//		    //eyes
		//		    g.fillOval(150,100,50,50);
		//		    g.fillOval(270,100,50,50);
		//		    //mouth
		//		    g.drawArc(170, 200, 135, 100, 180, 180);
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
