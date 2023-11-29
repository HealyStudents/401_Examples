package graphics;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball 
{
	private double x, y;
	private double xVelocity, yVelocity;
	private Color color;
	private int size;
	
	public Ball(Color c, int size)
	{
		this.color = c;
		this.size = size;
		this.x = 200;
		this.y = 200;
		this.xVelocity = (Math.random()*5 + 2);
		this.yVelocity = (Math.random()*5 + 2);
	}
	
	public void update()
	{
		this.x += this.xVelocity;
		this.y += this.yVelocity;
		
		if(this.x > 500 - this.size/2)
		{
			this.xVelocity = -(Math.random()*5 + 2);
		}
		
		if(this.x < 0 + this.size/2)
		{
			this.xVelocity = (Math.random()*5 + 2);
		}
		
		if(this.y > 500 - this.size/2)
		{
			this.yVelocity = -(Math.random()*5 + 2);
		}
		
		if(this.y < 0 + this.size/2)
		{
			this.yVelocity = (Math.random()*5 + 2);
		}
	}
	
	public void paint(Graphics2D g)
	{
		g.setColor(this.color);
		g.fillOval((int)this.x - this.size/2, (int)this.y - this.size/2, this.size, this.size);
	}
}
