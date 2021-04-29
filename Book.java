/**
 * Book interface with the getters and setters of book.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
public interface Book{
	public Title getTitle();
	public void setTitle(Title title);
	public Author getAuthor();
	public void setAuthor(Author author);
	public double getLength();
	public void setLength(double length);
	public double getPrice();
	public void setPrice(double price);
}