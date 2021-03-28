
public class Pet {
	private String name;
	private String age;
	private String location;
	private String type;

	public Pet() {
	}

	public Pet(String name) {
		this.name = name;
	}

	// GETTERS
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
