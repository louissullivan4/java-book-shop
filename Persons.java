/**
 * Persons interface that extends buy, receive and charge interfaces. Also implements getters and setters for persons.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
import java.util.ArrayList;

public interface Persons extends Buy, Receive, Charge {
	public double getEarnings();
	public void setEarnings(double money);
	public ArrayList<Book> getCollection();
	public void setCollection(ArrayList<Book> collection);
}
