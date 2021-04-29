/**
 * Reader class that implements Persons interface.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
import java.util.ArrayList;

public class Reader implements Persons {
	private Persons reader;
	private String forename;
	private String surname;
	private static double money = 0;
	private ArrayList<Book> collection = new ArrayList<Book>( );
	
	/**
     * Construct an instance of this class Readers with the given parameters
     *
     * @param forename The forename of the person.
     * @param surname The surname of the person.
     */
	public Reader(final String forename, final String surname) {
		this.forename = forename;
		this.surname = surname;
		this.reader = ConcretePersons.create();
	}
	public void printBooksOwned() {
		System.out.println( forename + " " + surname + " owns: ");
		for (Book book : reader.getCollection()) {
			System.out.println("\t" + book.getTitle());
		}
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public double getEarnings() {
		return reader.getEarnings();
	}
	@Override
	public void setEarnings(double money) {
		reader.setEarnings(money);
	}
	@Override
	public ArrayList<Book> getCollection() {
		return reader.getCollection();
	}
	@Override
	public void setCollection(ArrayList<Book> collection) {
		reader.setCollection(collection);
	}
	@Override
	public void buy(Book book) {
		reader.buy(book);
	}
	@Override
	public void receive(double cost) {
		reader.receive(cost);
	}
	@Override
	public void charge(double cost) {
		reader.charge(cost);
	}
	public String toString() {
		return getForename() + " " + getSurname();
	}
}