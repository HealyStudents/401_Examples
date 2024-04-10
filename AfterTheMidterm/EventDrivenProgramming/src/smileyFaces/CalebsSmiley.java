package smileyFaces;

import java.awt.Color;
import java.awt.Graphics2D;

public class CalebsSmiley implements SmileyFacePainter {

	@Override
	public void paintSmiley(Graphics2D g) {
		g.setColor(Color.green);//Head
        g.fillOval(100, 100, 300, 260);
        g.setColor(Color.blue);//Eyes
        g.fillOval(164, 164, 32, 32);
        g.fillOval(300, 164, 32, 32);
        g.setColor(Color.red);//Mouth
        g.fillOval(180, 190, 128, 128);
        g.setColor(Color.green);//Mouth shape
        g.fillRect(164, 190, 165, 64);
	}

}
