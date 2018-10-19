package au.com.learning.design.pattern.creational.builder;

public class UserWebDTO implements UserDTO {

	private String name;
	private String address;
	
	public UserWebDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "name=" + name + "\naddress=" + address ;
	}
	
}
