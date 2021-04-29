/**
 * Concrete book class that delegates book methods to instances of book.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
public class ConcreteBook implements Book{
	private Title title;
	private Author author;
	private double length;
	private double price;
	/**
     * Create method that makes an instance of the ConcreteBook class using the book interface.
     * 
     *
     * 	@param author The author of the book.
     * 	@param title The title of the book. 
     * 	@param length The length of the book. 
     */
	public ConcreteBook(Author author, Title title, double length ) {
		this.author = author;
		this.title = title;
		this.length = length;
	}
	/**
     * Create method that makes an instance of the book interface.
	 * 
     *  @param author The author of the book.
     * 	@param title The title of the book. 
     * 	@param length The length of the book. 
     * 
     *  @return Concrete Book with the constructed variables.
     **/
	public static Book create(Author author, Title title, double length ) {
		return new ConcreteBook(author, title, length);
	}
	@Override
	public Title getTitle() {
		return title;
	}
	@Override
	public void setTitle(Title title) {
		this.title = title;
	}
	@Override
	public Author getAuthor() {
		return author;
	}
	@Override
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public double getLength() {
		return length;
	}
	@Override
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return getTitle() + "\n" + getAuthor() + "\n" + getLength() + "\n" + getPrice();
	}
}
