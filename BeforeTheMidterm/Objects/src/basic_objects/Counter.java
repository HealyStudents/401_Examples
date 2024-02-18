package basic_objects;

/**
 * An object that represents a tally counter: https://en.wikipedia.org/wiki/Tally_counter
 */
public class Counter
{
    int value;
    
    public int getValue()
    {
        return value;
    }
    public void click() 
    {
        value = value + 1;
    }
    public void reset()
    {
        value = 0;
    }
    
    public static void main(String[] args)
    {
    	//Creates a Counter object
    	Counter count = new Counter();
    	//Click the counter twice
    	count.click();
    	count.click();
    	//Print out the counter’s value
    	System.out.println(count.getValue());
    	//System.out.println(count.value); //a sloppier way of doing it
    	//Reset the counter
    	count.reset();
    	//Print out the counter’s value again
    	System.out.println(count.getValue());
    }
}

