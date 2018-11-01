package au.com.learning.design.pattern.structural.adapter;

public class BusinessClassDesigner {

	public String designCard(Customer customer) {
		return customer.getName().concat(customer.getDesignation());
	}
}
