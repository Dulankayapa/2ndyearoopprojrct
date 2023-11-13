package userfeedback;

public class packages {
	
	private int id;
	private String name;
	private String type;
	private String description;
	private String location;
	private String cost;

	public packages(int id, String name, String type, String description, String location, String cost) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
		this.location = location;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public String getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}




	
	
	

}
