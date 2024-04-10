package smileyFaces;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import graphics.SmileyFaces;

public class SmileyFacesAdapterPattern extends Frame
{
	private SmileyFacePainter smile;
	
	public SmileyFacesAdapterPattern(String name, String smilerName) throws InterruptedException, IOException
	{
		super(name);
		this.setSize(500, 500);
		
		if(smilerName.equals("Pat"))
		{
			this.smile = new PatsSmiley();
		}
		else if(smilerName.equals("Matt"))
		{
			this.smile = new MattsSmiley();
		}
		else if(smilerName.equals("Joshua"))
		{
			this.smile = new JoshuasSmiley();
		}
		else if(smilerName.equals("Caleb"))
		{
			this.smile = new CalebsSmiley();
		}

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
		this.smile.paintSmiley(g);
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
		SmileyFacesAdapterPattern f = new SmileyFacesAdapterPattern("Smile!", "Caleb");
		f.run();
	}
}
