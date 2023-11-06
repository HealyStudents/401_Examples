package inheritance;

public class Square extends Rectangle 
{
    public Square(double side) {
        super(side,side);
    }
    
    public static void main(String[] args)
    {
    	Square sq = new Square(15);
    	System.out.println(sq.perimeter());
    	System.out.println(sq.area());
    }

}
