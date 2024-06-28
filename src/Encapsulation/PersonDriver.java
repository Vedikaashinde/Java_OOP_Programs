package Encapsulation;

public class PersonDriver {
	public static void main(String[] args) {

		Person p1 = new Person("Isha", 22, "Female");

		System.out.println("Original Information");

		p1.setName("Vedika");
		p1.setAge(21);

		System.out.println("Updated Information");

		p1.displayInfo();
	}

}
