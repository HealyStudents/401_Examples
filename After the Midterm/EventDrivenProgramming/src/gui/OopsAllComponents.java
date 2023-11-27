package gui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.List;

//Button, Canvas, Checkbox, Choice, Label, List, Scrollbar, TextArea, and TextField
public class OopsAllComponents extends Frame
{
    private Button b;
    private Checkbox check;
    private Choice choice;
    private List list;
    private TextArea textArea;
    private TextField textField;
    private int clickedCount;
    
    public OopsAllComponents(String name)
    {
	super(name);
	
	this.add(new Label("Button -->"));
	b = new Button("CLICK ME");
	this.add(b); //add the button to the window
	
	this.add(new Label("Checkbox -->"));
	check = new Checkbox();
	this.add(check);
	
	this.add(new Label("Choice -->"));
	choice = new Choice();
	choice.addItem("Choice 1");
	choice.addItem("Choice 2");
	choice.addItem("Choice 3");
	this.add(choice);
	
	this.add(new Label("List -->"));
	list = new List();
	list.add("Item 1");
	list.add("Item 2");
	list.add("Item 3");
	list.add("Item 4");
	list.add("Item 5");
	list.add("Item 6");
	list.add("Item 7");
	list.add("Item 8");
	list.add("Item 9");
	list.add("Item 10");
	this.add(list);
	
	this.add(new Label("TextArea -->"));
	textArea = new TextArea("Text areas are meant to capture large amounts of user text input.");
	this.add(textArea);
	
	this.add(new Label("TextField -->"));
	textField = new TextField("Text fields are meant to capture smaller amounts of user text input.");
	this.add(textField);
	
	this.setSize(500, 500);

        //Setting a function that runs when the window is closed
	this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
        	dispose();
            }
        });
	
	clickedCount = 0;
	
	//Event listener for each of the components (see each listener private subclass below)
	b.addActionListener(new ButtonClickListener());
	check.addItemListener(new CheckboxListener());
	choice.addItemListener(new ChoiceListener());
        textArea.addTextListener(new TextAreaListener());
        textField.addTextListener(new TextFieldListener());
	
	
	//Removing the layout allows us to manually place objects at specific positions
	this.setLayout(new GridLayout(0,2));  
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
    
    private class CheckboxListener implements ItemListener
    {
	@Override
	public void itemStateChanged(ItemEvent e)
	{
	    System.out.println("Box checked: " + check.getState());
	    check.setLabel("Box checked: " + check.getState());
	}
	
    }
    
    private class ChoiceListener implements ItemListener
    {
	@Override
	public void itemStateChanged(ItemEvent e)
	{
	    System.out.println("Choice selected: " + choice.getSelectedObjects()[0]);
	}
    }
    
    private class TextAreaListener implements TextListener
    {

	@Override
	public void textValueChanged(TextEvent e)
	{
	    System.out.println("Text Area: " + textArea.getText());
	}
    }
    
    private class TextFieldListener implements TextListener
    {

	@Override
	public void textValueChanged(TextEvent e)
	{
	    System.out.println("Text Field: " + textField.getText());
	}
    }
    
    
    
    public static void main(String[] args)
    {
	OopsAllComponents f = new OopsAllComponents("GUI with all AWT Components");
    }

}
