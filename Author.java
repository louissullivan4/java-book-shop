/**
 * Author enum class that implements Persons interface.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
import java.util.ArrayList;

public enum Author implements Persons {
	JJR_Tolkien("JR Tolkin"),
	JD_Sallinger("JD Sallinger");
	
	private Persons author;
	private String name;
	private static double money = 0;
	private ArrayList<Book> collection = new ArrayList<Book>( );
	private ArrayList<Book> published = new ArrayList<Book>( );
	/**
     * Construct an instance of this class Authors with the given parameters
     *
     * @param name The name of the person.
     */
	private Author(String name) {
		this.name = name;
		this.author = ConcretePersons.create();
	}
	public void printBooksOwned() {
		System.out.println( name + " " + "owns: ");
		for (Book book : author.getCollection()) {
			System.out.println("\t" + book.getTitle());
		}
	}
	public void printBooksPublished() {
		System.out.println( name + " " +" published:" );
		for (Book book : this.getPublished()) {
			System.out.println("\t" + book.getTitle());
		}
	}
	public ArrayList<Book> getPublished() {
		return this.published;
	}
	@Override
	public double getEarnings() {
		return author.getEarnings();
	}
	@Override
	public void setEarnings(double money) {
		author.setEarnings(money);
	}
	@Override
	public ArrayList<Book> getCollection() {
		return author.getCollection();
	}
	@Override
	public void setCollection(ArrayList<Book> collection) {
		author.setCollection(collection);
	}
	@Override
	public void buy(Book book) {
		author.buy(book);
	}
	@Override
	public void receive(double cost) {
		author.receive(cost);
	}
	@Override
	public void charge(double cost) {
		author.charge(cost);
	}
}
