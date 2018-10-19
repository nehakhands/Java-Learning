package au.com.learning.design.pattern.creational.builder;

public interface UserDTOBuilder {

	UserDTOBuilder withFirstName(String fname);
	
	UserDTOBuilder withLastName(String lname);
	
	UserDTOBuilder withAddress(Address address);
	
	UserDTO build();
	
	UserDTO getUserDTO();
	
}
