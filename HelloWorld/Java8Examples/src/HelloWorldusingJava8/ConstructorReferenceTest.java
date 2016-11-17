package HelloWorldusingJava8;

/**
 * Java 8 enables you to pass references of methods or constructors via the :: keyword. 
 * @author Ram
 *
 */
public class ConstructorReferenceTest {     

	public static void main(String[] args) {       // Main method declaration
	
		//We create a reference to the Person constructor via Person::new
		
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Ram", "Vankaneni");   // passing values to person
		
		System.out.println(person);      
		
		Converter<String, String> converter = person::startsWithWhatLetter;   // converter implementation
		
		String converted = converter.convert("Java8");     // Declaring a String using converter
		System.out.println("Starts with = "+converted); 
	}
}

class Person {
    String firstName;     // Declaring data members to Person class
    String lastName;      // Declaring data members to Person class

    Person() {}          // Declaring person default constructor

    Person(String firstName, String lastName) {   // Declaring person constructor and passing the arguments
        this.firstName = firstName;
        this.lastName = lastName;
    }

	@Override
	public String toString() {           // // returning the values using toString method.
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
    
	public String startsWithWhatLetter(String s) {     // Declaring startsWithWhatLetter method
        return String.valueOf(s.charAt(0));  
    }
    
}
interface PersonFactory<P extends Person> {         // Defining interface P extension of Person
    P create(String firstName, String lastName);
}
@FunctionalInterface               // This annotation used for compiler level errors when the interface you have annotated is not a valid Functional Interface
interface Converter<F, T> {
    T convert(F from);
}