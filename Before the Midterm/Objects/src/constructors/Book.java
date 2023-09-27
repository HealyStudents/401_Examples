package constructors;

public class Book 
{
	private String title;
	private int nPages;
	private Person author, editor;
	
	// new Book("Perks of Being a Wallflower", 200, new Person("Stephen Chbosky"))
	public Book(String title, int nPages, Person author)
	{
		this(title, nPages, author, null);
	}
	
	public Book(String title, int nPages, Person author, Person editor)
	{
		if(title == null || nPages <= 0 || nPages > 1300 || author == null) throw new IllegalStateException();
		
		this.title = title;
		this.nPages = nPages;
		this.author = author;
		this.editor = editor;
	}
	
	
	
}
