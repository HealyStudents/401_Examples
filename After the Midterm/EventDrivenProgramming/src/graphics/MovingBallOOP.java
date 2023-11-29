package graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MovingBallOOP extends Frame implements KeyListener
{
	private final int FRAME_RATE = 70;
	private ArrayList<Ball> balls;
	
	public MovingBallOOP(String name) throws InterruptedException
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
		
		this.balls = new ArrayList<Ball>();
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.balls.add(new Ball(Color.red, 50));
		this.balls.add(new Ball(Color.green, 50));
		this.balls.add(new Ball(Color.blue, 50));
		this.balls.add(new Ball(Color.yellow, 50));
		this.setVisible(true);
		this.run();
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
	
	public void paint(Graphics2D g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		
		for(Ball b : balls)
			b.paint(g);
	}
	
	public void update()
	{
		for(Ball b : balls)
			b.update();
	}
	
	public static void main(String[] args) throws InterruptedException {
		MovingBallOOP mb = new MovingBallOOP("Simple Ball Animation");
		//mb.run();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key typed!");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key pressed!");
		System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
