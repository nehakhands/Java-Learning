package au.com.learning.design.pattern.structural.adapter;

public class Client {

	public static void main(String[] args) {
		EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(getEmployee());
		
		BusinessClassDesigner designer = new BusinessClassDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
	}

	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setFullName("Neha");
		employee.setJobTitle("Developer");
		return employee;
	}

}
