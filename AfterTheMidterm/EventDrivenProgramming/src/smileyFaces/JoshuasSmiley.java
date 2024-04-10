package smileyFaces;

import java.awt.Color;
import java.awt.Graphics2D;

public class JoshuasSmiley implements SmileyFacePainter {

	@Override
	public void paintSmiley(Graphics2D g) {
		//Joshua's
		g.setColor(Color.blue);
		g.drawOval(100, 100, 300, 200);
		g.drawOval(160, 140, 30, 20);
		g.drawOval(260, 140, 30, 20);
		g.drawArc(170, 175, 200, 100, 180, 180);
	}

}
