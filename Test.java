// Class to test all the classes and methods defined in the various classes and interfaces
public class Test {
	
	public static void main(String[] args) {
		
		// Create Wizard and test all methods
		Character gandalf = new Wizard();
		gandalf.displayType();
		gandalf.displayHeight();
		gandalf.displayAbility();
		System.out.println("");
		
		// Create Hobbit and test all methods
		Character frodo = new Hobbit();
		frodo.displayType();
		frodo.displayHeight();
		frodo.displayAbility();
		System.out.println("");
		
		// Create Elf and test all methods
		Character legolas = new Elf();
		legolas.displayType();
		legolas.displayHeight();
		legolas.displayAbility();
		System.out.println("");
		
		// Create Dwarf and test all methods
		Character gimli = new Dwarf();
		gimli.displayType();
		gimli.displayHeight();
		gimli.displayAbility();
		System.out.println("");
		
		// Create Human and test all methods
		Character aragorn = new Human();
		aragorn.displayType();
		aragorn.displayHeight();
		aragorn.displayAbility();
		System.out.println("");
		
	}
	
}
