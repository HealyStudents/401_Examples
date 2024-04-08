package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * This is a lot like SimpleFrame.java BUT it's much more object-oriented
 */
public class FrameOOP extends Frame
{
	public FrameOOP(String name)
	{
		super(name);

		this.add(new Label("Hello, but object-oriented!"));
		this.setSize(500, 500);

		//Setting a function that runs when the window is closed
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		this.setVisible(true);
		
		//Get my graphics object
		Graphics2D g = (Graphics2D) this.getGraphics();
		this.paint(g);;
	}
	
	public void paint(Graphics2D g)
	{
		super.paint(g);
		System.out.println("Painting!");
		//Dip my paint brush in blue
		g.setColor(Color.blue);
		//Draw a blue rectangle, top-left corner is (100,100), width of 300, height of 200
		g.drawRect(100, 100, 300, 200);
	}

	public static void main(String[] args)
	{
		FrameOOP f = new FrameOOP("Simple OOP Frame");
		f.paint(f.getGraphics());
//		FrameOOP f2 = new FrameOOP("Second frame");
//		FrameOOP f3 = new FrameOOP("Third frame");
//		FrameOOP f4 = new FrameOOP("Fourth frame");
	}

}
