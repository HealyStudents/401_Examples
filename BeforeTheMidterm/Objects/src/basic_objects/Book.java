package basic_objects;

/**
 * A plain old java object of a Book. This book just holds data. It has no methods nor constructors.
 * 
 * Notably, Book is an early example of an object containing another object as a field (author and editor are Person objects).
 */
public class Book 
{
	// title, author, number of pages, editor, year of publishing
	String title;
	Person author;
	int numberOfPages;
	Person editor;
	int yearOfPublishing;
}
