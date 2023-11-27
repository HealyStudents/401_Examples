package gui;

import java.awt.Frame;
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
    }

    public static void main(String[] args)
    {
	FrameOOP f = new FrameOOP("Simple OOP Frame");
    }

}
