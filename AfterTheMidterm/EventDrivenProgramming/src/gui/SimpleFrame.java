package gui;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleFrame
{
	public static void main(String[] args)
	{
		//Create a Frame object, where we can make graphical components
		Frame f = new Frame("Simple Frame");
		//add text to the window body. We have to create the Label object and add it to the Frame that contains it
		f.add(new Label("Hello!"));
		//Make the window 500 x 500 pixels
		f.setSize(500, 500);

		//Setting a function that runs when the window is closed
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Closing!");
				f.dispose();
			}
		});

		//Make the window visible (if we don't include this, it doesn't appear)
		f.setVisible(true);
	}
}
