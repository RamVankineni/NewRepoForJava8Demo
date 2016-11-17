package HelloWorldusingJava8;

public class Employee {                // Defining Employee POJO class 

	private String eid;                // Declaring a private data memeber eid
	private String ename;              // Declaring a private data memeber ename
	 
	public Employee(){                  // Declaring public default constructor
		super();
	}
	public Employee(String eid, String ename) {     // Declaring public constructor and passing eid, ename
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public String getEid() {       // declaring getter method for eid
		return eid;
	}
	public void setEid(String eid) {  // declaring setter method for eid
		this.eid = eid;
	}
	public String getEname() {     // declaring getter method for ename
		return ename;
	}
	public void setEname(String ename) {  // declaring setter method for ename
		this.ename = ename;
	}
	
	@Override
	public String toString() {      // returning the values using toString method.
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
}