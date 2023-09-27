package constructors;

public class Rectangle 
{
    private double sideA, sideB;
    
    //new Rectangle(5, 7)
    public Rectangle(double a, double b) 
    {
        if (a > 0 && b > 0) 
        {
	        sideA = a;
	        sideB = b;
        }
        else
            throw new IllegalStateException();

    }
    
    //new Rectangle(5)
    public Rectangle(double a)
    {
        if (a > 0) 
        {
	        sideA = a;
	        sideB = a;    
        }
        else
            throw new IllegalStateException();
    }
    
    public double area() 
    {
        return sideA * sideB;
    }
    
    public String toString()
    {
    	if(sideA == sideB)
    	{
    		return "Square: " + sideA;
    	}
    	return "Rectangle: " + sideA + ", " + sideB;
    }
    
    public static void main(String[] args)
    {
    	Rectangle rect = new Rectangle(5);
    	System.out.println(rect);
    	rect = new Rectangle(5,7);
    	System.out.println(rect);
    }
    
}
