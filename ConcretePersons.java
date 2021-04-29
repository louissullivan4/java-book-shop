/**
 * Concrete persons class that delegates persons methods to instances of persons.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
import java.util.ArrayList;

public final class ConcretePersons implements Persons {
	private double money = 0 ;
	private double cost;
	private ArrayList<Book> collection = new ArrayList<Book>( );
	private Author author;
	private double royalties;
	/**
     * Create method that makes an instance of the person interface.
     * 
     *  @return Concrete Persons with the constructed variables.
     **/
	public static Persons create( ) {       
		return new ConcretePersons();    
	}
	@Override
	public double getEarnings() {
		return money;
	}
	@Override
	public void setEarnings(double money) {
		this.money = money;
	}
	@Override
	public ArrayList<Book> getCollection() {
		return collection;
	}
	@Override
	public void setCollection(ArrayList<Book> collection) {
		this.collection = collection;
	}
	@Override   
	public void buy( Book book ) {
		cost = book.getPrice();
		author = book.getAuthor();
		if (this.getEarnings() >= cost) {
				royalties = cost * 0.1;
				author.receive(royalties);
				this.getCollection().add(book);
				this.charge(cost);
		} else {
			System.out.println("You don’t have enough money to buy. \n" + book);
		}
	}   
	@Override  
	public void receive( double cost ){   
		this.setEarnings(this.getEarnings() + cost);
	}
	@Override  
	public void charge( double cost ) {        
		this.setEarnings(this.getEarnings() - cost);
	}
}
