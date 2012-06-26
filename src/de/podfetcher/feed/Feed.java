package de.podfetcher.feed;

import java.util.ArrayList;
import java.util.Date;

/**
 * Data Object for a whole feed
 * 
 * @author daniel
 * 
 */
public class Feed extends FeedFile {
	private String title;
	/** Link to the website. */
	private String link;
	private String description;
	private FeedImage image;
	private FeedCategory category;
	private ArrayList<FeedItem> items;
	/** Date of last refresh. */
	private Date lastUpdate;
	private String paymentLink;

	public Feed(Date lastUpdate) {
		super();
		items = new ArrayList<FeedItem>();
		this.lastUpdate = lastUpdate;
	}

	public Feed(String url, Date lastUpdate) {
		this(lastUpdate);
		this.download_url = url;
	}
	
	/** Returns the number of FeedItems where 'read' is false. */
	public int getNumOfNewItems() {
		int count = 0;
		for (FeedItem item : items) {
			if (!item.isRead()) {
				count++;
			} 
		}
		return count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FeedImage getImage() {
		return image;
	}

	public void setImage(FeedImage image) {
		this.image = image;
	}

	public FeedCategory getCategory() {
		return category;
	}

	public void setCategory(FeedCategory category) {
		this.category = category;
	}

	public ArrayList<FeedItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<FeedItem> items) {
		this.items = items;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	public String getPaymentLink() {
		return paymentLink;
	}

	public void setPaymentLink(String paymentLink) {
		this.paymentLink = paymentLink;
	}

}
