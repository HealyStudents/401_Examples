package graphics;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball 
{
	private double x, y;
	private double xVelocity, yVelocity;
	private Color color;
	private int size;
	
	private static Color[] colors = new Color[] {Color.red, Color.green, Color.blue, Color.cyan, Color.magenta, Color.pink};
	
	public Ball(Color c, int size)
	{
		this.color = c;
		this.size = size;
		this.x = 200;
		this.y = 200;
		this.xVelocity = (Math.random()*10 + 2);
		this.yVelocity = (Math.random()*10 + 2);
	}
	
	public Ball(int size)
	{
		this(colors[(int)(Math.random()*colors.length)], size);
	}
	
	private void bounceX()
	{
		this.xVelocity *= -1;
	}
	
	private void bounceY()
	{
		this.yVelocity *= -1;
	}
	
	public void update()
	{
		this.x += this.xVelocity;
		this.y += this.yVelocity;
		
		if(this.y < 100 || this.y > 400)
			this.bounceY();
		
		if(this.x < 100 || this.x > 400)
			this.bounceX();
	}
	
	public void paint(Graphics2D g)
	{
		g.setColor(this.color);
		g.fillOval((int)this.x - this.size/2, (int)this.y - this.size/2, this.size, this.size);
	}
}
