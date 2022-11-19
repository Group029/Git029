package assignmentno6;

import java.util.Objects;

public class Department {
	private String name;
	private String location;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public Department() {
		name = "king";
		location = "location";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location + "]";
	}
	
	
	

}
