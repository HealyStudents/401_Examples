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
	private Ball b;
	
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
		
		
		// TODO: what if we wanted to simulate more than one ball?
		b = new Ball(Color.red, 10);

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
		
		b.paint(g);
	}
	
	public void update()
	{
		b.update();
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
	
	public static void main(String[] args) throws InterruptedException {
		MovingBallOOP mb = new MovingBallOOP("Simple Ball Animation");
	}

}
