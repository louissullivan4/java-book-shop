/**
 * Paperbacks class that is made by the create method in ConcreteBook.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
public class Paperback implements Book {
	private Book paperback;
	private Title title;
	private Author author;
	private double length;
	private static final double price = 10.00;
	/**
     * Create method that makes an instance of the Paperback class using the book interface.
     * 
     *
     * 	@param author The author of the book.
     * 	@param title The title of the book. 
     * 	@param length The length of the book. 
     */
	Paperback(Author author, Title title, double length ) {
		this.author = author;
		this.title = title;
		this.length = length;
		this.paperback = ConcreteBook.create(author, title, length);
	}
	/**
     * Create method that makes an instance of the Paperback class using the book interface.
     * 
     * 	@param author The author of the book.
     * 	@param title The title of the book. 
     * 	@param length The length of the book. 
     * 	@param price The prices of the book. 
     * 
     *  @return Paperback class with the price defaulted to 12 euro.
     **/
	public static Book create( final Title title, final Author author, final double length, final double price) {
		return ConcreteBook.create(author, title, length);
	}
	@Override
	public Title getTitle() {
		return paperback.getTitle();
	}
	@Override
	public void setTitle(Title title) {
		paperback.setTitle(title);
		
	}
	@Override
	public Author getAuthor() {
		return paperback.getAuthor();
	}
	@Override
	public void setAuthor(Author author) {
		paperback.setAuthor(author);
		
	}
	@Override
	public double getLength() {
		return paperback.getLength();
	}
	@Override
	public void setLength(double length) {
		paperback.setLength(length);
		
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
	}
	public String toString() {
		return "Paperback [ author = " + getAuthor() + ", title = "+ getTitle() + ", price = " + getPrice() + ", duration = " + getLength() + " ]";
	}

}
