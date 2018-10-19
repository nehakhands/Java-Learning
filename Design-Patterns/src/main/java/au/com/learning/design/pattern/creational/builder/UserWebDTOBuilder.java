package au.com.learning.design.pattern.creational.builder;

public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String address;
	private UserWebDTO dto;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNo() + "," + address.getStreetName() + "," + address.getZipCode() + " ," + address.getState() + ", " + address.getCity();
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(firstName + " " + lastName, address);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}

}
