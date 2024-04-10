package smileyFaces;

import java.awt.Color;
import java.awt.Graphics2D;

public class MattsSmiley implements SmileyFacePainter {

	@Override
	public void paintSmiley(Graphics2D g) {
		g.setColor(Color.blue);
        g.drawOval(150, 100, 50, 50);
        g.drawOval(250, 100, 50, 50);
        g.fillOval(167, 119, 15, 15);
        g.fillOval(267, 119, 15, 15);
        g.drawArc(175, 200, 100, 100, 200, 150);
        g.drawOval(75, 50, 300, 300);
	}

}
