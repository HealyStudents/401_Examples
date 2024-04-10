package graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MovingBall extends Frame
{
	private final int FRAME_RATE = 120;
	private int yCoordinate;
	
	public MovingBall(String name) throws InterruptedException
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

		this.yCoordinate = 150;
		this.setVisible(true);
	}
	
	public void run() throws InterruptedException
	{
		Graphics2D g = (Graphics2D) this.getGraphics();
		while(true)
		{
			this.update();
			this.paint(g);
			TimeUnit.MILLISECONDS.sleep(1000/ FRAME_RATE);
		}
	}
	
	//paint the world to the screen
	public void paint(Graphics2D g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.black);
		g.fillOval(200, this.yCoordinate, 100, 100);
	}
	
	//Update the state of the world
	public void update()
	{
		if(this.yCoordinate < (this.getHeight() - 100))
			this.yCoordinate += 5;
	}
	
	public static void main(String[] args) throws InterruptedException {
		MovingBall mb = new MovingBall("Simple Ball Animation");
		mb.run();
	}

}
