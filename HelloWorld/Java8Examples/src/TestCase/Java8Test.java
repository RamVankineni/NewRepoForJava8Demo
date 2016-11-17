package TestCase;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import HelloWorldusingJava8.Employee;
import HelloWorldusingJava8.LambaExpressionModel;

import static org.junit.Assert.assertEquals;

public class Java8Test {

	private LambaExpressionModel model = null;      // Declaring a private LambaExpressionModel and initialising to null
	private List<Employee> emps = null;             // Defining a ArrayList emps and initialising to null
	@Before                                         //The @Before methods of superclasses will be run before those of the current class
	public void setUp() throws Exception {          // Defining the setUp method
		model= new LambaExpressionModel();           // creating instance to LambaExpressionModel
		emps = model.defaultElements();
	}

	@Test                                          //The @Test annotation tells JUnit that the public void method to which it is attached can be run as a test case
	public void test() {                           // Defining the Test method
		
		Employee e = model.findEmployeeByID(emps, "22");     // used findEmployeeByID method from LambaExpressionModel class.
		assertEquals("22", e.getEid());                      // checking whether the passed value is existed or not.
		
		
	}

}
