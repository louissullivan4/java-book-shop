/**
 * Hardback class that is made by the create method in ConcreteBook.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
import java.util.ArrayList;

public class Hardback implements Book {
	private Book hardback;
	private Title title;
	private Author author;
	private double length;
	private static final double price = 12.00;
	public static ArrayList<Book> publishedbook;
	
	/**
     * Create method that makes an instance of the Hardback class using the book interface.
     * 
     *
     * 	@param author The author of the book.
     * 	@param title The title of the book. 
     * 	@param length The length of the book. 
     * 	@param price The length of the book. 
     */
	Hardback(Author author, Title title, double length, final double price ) {
		this.author = author;
		this.title = title;
		this.length = length;
		this.hardback = ConcreteBook.create(author, title, length);
		author.getPublished().add( hardback );
	}
	/**
     * Create method that makes an instance of the Hardback class using the book interface.
     * 
     * 	@param author The author of the book.
     * 	@param title The title of the book. 
     * 	@param length The length of the book.  
     * 
     *  @return Hardback class with the price defaulted to 12 euro.
     **/
	public static Book create( final Title title, final Author author, final double length) {
		return ConcreteBook.create(author, title, length);
		
	}
	@Override
	public Title getTitle() {
		return hardback.getTitle();
	}
	@Override
	public void setTitle(Title title) {
		hardback.setTitle(title);
		
	}
	@Override
	public Author getAuthor() {
		return hardback.getAuthor();
	}
	@Override
	public void setAuthor(Author author) {
		hardback.setAuthor(author);
		
	}
	@Override
	public double getLength() {
		return hardback.getLength();
	}
	@Override
	public void setLength(double length) {
		hardback.setLength(length);
		
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
	}
	public String toString() {
		return "Hardback [ author = " + getAuthor() + ", title = "+ getTitle() + ", price = " + getPrice() + ", duration = " + getLength() + " ]";
	}
}