package Polymorphism;

public class AnimalDriver {
	public static void main(String[] args) {
		
		Animal a1 = new Dog() ;//Upcasting
		Animal a2 = new Cat(); //Upcasting
		a1.Sound();
		a2.Sound();
		
		
	}

}
