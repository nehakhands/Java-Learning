package au.com.learning.design.pattern.creational.builder;

public class Client {

	public static void main(String[] args) {
		UserDTO dto = directBuild(new UserWebDTOBuilder(), createUser());
		System.out.println(dto);
	}
	
	//Director
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withAddress(user.getAddress()).build();
	}
	
	private static User createUser() {
		User user = new User();
		user.setFirstName("Mc");
		user.setLastName("Donald");
		
		user.setAddress(new Address());
		user.getAddress().setHouseNo("4");
		user.getAddress().setStreetName("May Street");
		user.getAddress().setZipCode("2188");
		user.getAddress().setState("NSW");
		user.getAddress().setCity("Sydney");
		return user;
	}

}
