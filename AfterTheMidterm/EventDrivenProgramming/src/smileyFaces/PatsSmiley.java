package smileyFaces;

import java.awt.Color;
import java.awt.Graphics2D;

public class PatsSmiley implements SmileyFacePainter 
{

	@Override
	public void paintSmiley(Graphics2D g) 
	{
		//Pat's smiley face:
		g.setColor(Color.black);
		g.fillOval(150, 100, 50, 50);
		g.fillOval(300, 100, 50, 50);

		g.setColor(Color.orange);
		g.fillRect(150, 50, 50, 30);
		g.fillRect(300, 50, 50, 30);

		g.setColor(Color.green);
		g.fillRect(235, 140, 30, 30);

		g.setColor(Color.red);
		g.fillArc(200, 200, 100, 100, 180, 180);

		g.drawString("Pat", 100, 400);
	}

}
