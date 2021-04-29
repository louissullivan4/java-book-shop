/**
 * Title class that makes a title of the book.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/04/20
 */
public class Title {
	private String title;
	private String subtitle;
	/**
     * Construct an instance of this class Title with the given parameters
     *
     * @param title The title of the book
     */
	public Title ( final String title ) { 
		this.title = title;
	}
	/**
     * Construct an instance of this class title that overrides if a subtitle is passed.
     *
     * @param title The title of the book
     * @param subtitle The subtitle of the book
     */
	public Title ( final String title, final String subtitle ) { 
		this.title = title;
		this.subtitle = subtitle;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String toString() {
		if (getSubtitle() == null) {
			return getTitle();
		} else {
			return getTitle() + " / " + getSubtitle();
		}
	}
}
