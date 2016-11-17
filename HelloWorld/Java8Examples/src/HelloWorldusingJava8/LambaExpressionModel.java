package HelloWorldusingJava8;

import java.util.ArrayList;
import java.util.List;

/**
 * This solution is to demonstrate lamdas/streams available in Java 8. And this deals with List of Employees
 * @author Ramu
 *
 */
public class LambaExpressionModel {       // declaring public class LambaExpressionModel

	public Employee findEmployeeByID(List<Employee> listOfEmployees, String eid){           // Defining findEmployeeByID method using LambaExpression.
		Employee e1 = listOfEmployees.stream().filter(x -> "22".equals(x.getEid())).findAny().orElse(null);  // Filtering the data using LambaExpression
		
		return e1;
	}
	public List<Employee> defaultElements() {   // Defining List for Employee
		
		List<Employee> list = new ArrayList<Employee>();   // Declaring List for Employee as ArrayList
		
		list.add(new Employee("21","Ram")); 
		list.add(new Employee("22","Raj"));
		list.add(new Employee("23","Vishal"));
		list.add(new Employee("33","Kejar"));  // passing the values to Employee entity
		
		return list;
	}
	
}
