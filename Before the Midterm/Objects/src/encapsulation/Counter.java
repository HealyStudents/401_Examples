package encapsulation;

public class Counter{
    int value = 0;
    public int getValue(){
        return value;
    }
    public void click() {
        value = value + 1;
    }
    public void reset(){
        value = 0;
    }
	public static void main(String[] args) {
		//Creates a Counter object
		Counter counter = new Counter();
//		Click the counter twice
		counter.click();
		counter.click();
//		Print out the counter’s value
		System.out.println(counter.getValue());
//		Reset the counter
		counter.reset();
//		Print out the counter’s value again
		System.out.println(counter.getValue());
	}

}
