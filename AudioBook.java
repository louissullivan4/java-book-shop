/**
 * AudioBook class that is made by the create method in ConcreteBook.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
public class AudioBook implements Book {
	private Book audiobook;
	private Title title;
	private Author author;
	private double length;
	private static final double price = 15.00;
	/**
     * Create method that makes an instance of the AudioBook class using the book interface.
     * 
     * 	@param title The title of the book. 
     * 	@param author The author of the book. 
     * 	@param length The length of the book. 
     */
	AudioBook(Author author, Title title, double length) {
		this.author = author;
		this.title = title;
		this.length = length;
		this.audiobook = ConcreteBook.create(author, title, length);
	}
	/**
     * Create method that makes an instance of the AudioBook class using the book interface.
     * 
     * 	@param title The title of the book. 
     * 	@param author The author of the book. 
     * 	@param length The length of the book. 
     * 	@param price The price of the book. 
     * 
     *  @return AudioBook class with the price defaulted to 15 euro.
     **/
	public static Book create( final Title title, final Author author, final double length, final double price) {
		return ConcreteBook.create(author, title, length);
		
	}
	@Override
	public Title getTitle() {
		return audiobook.getTitle();
	}
	@Override
	public void setTitle(Title title) {
		audiobook.setTitle(title);
	}
	@Override
	public Author getAuthor() {
		return audiobook.getAuthor();
	}
	@Override
	public void setAuthor(Author author) {
		audiobook.setAuthor(author);
		
	}
	@Override
	public double getLength() {
		return audiobook.getLength();
	}
	@Override
	public void setLength(double length) {
		audiobook.setLength(length);
		
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
	}
	public String toString() {
		return "Audiobook [ author = " + getAuthor() + ", title = "+ getTitle() + ", price = " + getPrice() + ", duration = " + getLength() + " ]";
	}
}