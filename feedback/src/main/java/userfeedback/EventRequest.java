package userfeedback;

public class EventRequest {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String eventType;
	private int guestCount;
	private String date;
	private String city;
	private String needs;
	private double budget;
	private String additionalInfo;
	
	public EventRequest(int id, String firstName, String lastName, String email, String phone, String eventType,
			int guestCount, String date, String city, String needs, double budget, String additionalInfo) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.eventType = eventType;
		this.guestCount = guestCount;
		this.date = date;
		this.city = city;
		this.needs = needs;
		this.budget = budget;
		this.additionalInfo = additionalInfo;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getEventType() {
		return eventType;
	}
	
	public int getGuestCount() {
		return guestCount;
	}

	public String getDate() {
		return date;
	}

	public String getCity() {
		return city;
	}

	public String getNeeds() {
		return needs;
	}

	public double getBudget() {
		return budget;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	
}
