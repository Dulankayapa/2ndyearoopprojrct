package userfeedback;

public class feedback {
	
	private String id;
	private String name;
	private String event;
	private String feedback;
	private String rating;
	
	public feedback() {}

	public feedback(String id, String name, String event, String feedback, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.event = event;
		this.feedback = feedback;
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	
	
	

}

