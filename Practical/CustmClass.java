/*
 * @kamlendra pandey
 */

package javaanudip;

class Employee {
	int id;
	String name;

	public void printDetails() {
		System.out.println("The id is: " + id);
		System.out.println("The name is: " + name);
	}
}

public class CustmClass {

	public static void main(String[] args) {
		Employee kamlen = new Employee();
		Employee Rahul = new Employee();
		// setting the attributes
		kamlen.id = 14;
		Rahul.id = 15;
		kamlen.name = "Kamlendra pandey";
		Rahul.name = "Rahul prasad";

		// printing the attributes
		kamlen.printDetails();
		Rahul.printDetails();
//		System.out.println(kamlen.id);
//		System.out.println(kamlen.name);
//		System.out.println(Rahul.id);
//		System.out.println(Rahul.name);

	}

}
