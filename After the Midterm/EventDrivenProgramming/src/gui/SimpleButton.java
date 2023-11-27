package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleButton extends Frame
{
    public SimpleButton(String name)
    {
	super(name);
	
	Label l = new Label("Click here -->");
	l.setBounds(25, 250, 95, 100); //Position the label at (25, 250) with 95 width and 100 height
	this.add(l); //add the label to the window
	
	Button b = new Button("CLICK ME");
	b.setBounds(150, 250, 200, 100); //Position the button at (150, 250) with 200 width and 100 height
	this.add(b); //add the button to the window
	
	this.setSize(500, 500);

        //Setting a function that runs when the window is closed
	this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
        	dispose();
            }
        });
        
	//Removing the layout allows us to manually place objects at specific positions
	this.setLayout(null);  
	this.setVisible(true);
    }

    public static void main(String[] args)
    {
	SimpleButton f = new SimpleButton("Simple Button Example");
    }

}
