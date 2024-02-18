package basic_objects;

/**
 * This class uses the book and person classes defined in those other two classes.
 */
public class BookRunner 
{

	public static void main(String[] args) 
	{
		Person bob = new Person();
		bob.name = "Bob Smith";
		bob.age = 47;
		bob.hometown = "Lexington, KY";
		
		Book book1 = new Book();
		book1.title = "The Pain of Being";
		book1.author = bob;
		book1.numberOfPages = 3232;
		book1.yearOfPublishing = 2024;
		
		System.out.println(book1.author.name);
	}

}
