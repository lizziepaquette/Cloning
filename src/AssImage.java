import java.util.Date;







//TODO make sure setters actually update attribute in database
//call mondb's update function



public class AssImage {

	private String link;
	private String caption;
	private int timesAccessed;
	private Date lastAccessDate;
	
	public AssImage(String link, String caption, int timesAccessed, Date lastAccessDate) {
		this.link = link;
		this.caption = caption;
		this.timesAccessed = timesAccessed;
		this.lastAccessDate = lastAccessDate;
	}

	public synchronized String getLink() {
		return link;
	}

	public synchronized void setLink(String link) {
		this.link = link;
	}

	public synchronized String getCaption() {
		return caption;
	}

	public synchronized void setCaption(String caption) {
		this.caption = caption;
	}

	public int getTimesAccessed() {
		return timesAccessed;
	}

	public synchronized void setTimesAccessed(int timesAccessed) {
		
		//set it in the database
		
		this.timesAccessed = timesAccessed;
	}

	public synchronized Date getLastAccessDate() {
		return lastAccessDate;
	}

	public synchronized void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
		//db.collection.update(this)

	
	
	
	
	}
	
	
	
}
