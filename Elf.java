// Subclass of Character
public class Elf extends Character {
	
	// Explicit constructor that specifies which groups the character falls into
	// by instantiating classes that implement HeightGroup and AbilityGroup
	public Elf() {
		heightGroup = new Tall();
		abilityGroup = new Bow();
	}
	
	// Displays character type
	public void displayType() {
		System.out.println("I am an elf.");
	}
	
}
