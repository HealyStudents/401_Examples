package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleButtonListener extends Frame
{
	private Button b;
	private Label l;
	private int clickedCount;

	public SimpleButtonListener(String name)
	{
		super(name);

		l = new Label("Click here -->");
		l.setBounds(25, 250, 95, 100); //Position the label at (25, 250) with 95 width and 100 height
		this.add(l); //add the label to the window

		b = new Button("CLICK ME");
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

		clickedCount = 0;

		//Event listener for the button (see the private inner class below
		b.addActionListener(new ButtonClickListener());

		//Removing the layout allows us to manually place objects at specific positions
		this.setLayout(null);  
		this.setVisible(true);
	}

	private class ButtonClickListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Clicked!");
			clickedCount++;
			b.setLabel("Clicked: " + clickedCount);
		}
	}

	public static void main(String[] args)
	{
		SimpleButtonListener f = new SimpleButtonListener("Simple Button Example (with Listener)");
	}
}
