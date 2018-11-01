package au.com.learning.design.pattern.structural.adapter;


public class EmployeeObjectAdapter implements Customer{

	private Employee adaptee;

	public EmployeeObjectAdapter(Employee employee) {
		this.adaptee = employee;
	}
	
	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}
	
	
}
