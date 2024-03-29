package array_examples;

/**
 * This demonstrates using a try-catch to handle multiple kinds of exceptions at once. In class, I used this example to discuss why one should never catch a generic `Exception e`.
 */
public class ExceptionExample
{
    public static void main(String[] args) 
    {
        String str = "A";
        int[] arr = {1, 2, 3, 4, 5};
        try
        {
        	System.out.println(arr[5]); //Exception thrown here!
            double number = Double.parseDouble(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Failed to convert the number!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("There was an index out of bounds exception!");
        }
        
        System.out.println("Done!");
    }
}

