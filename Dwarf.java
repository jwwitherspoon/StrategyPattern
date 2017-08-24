// Subclass of Character
public class Dwarf extends Character {
	
	// Explicit constructor that specifies which groups the character falls into
	// by instantiating classes that implement HeightGroup and AbilityGroup
	public Dwarf() {
		heightGroup = new Short();
		abilityGroup = new Hammer();
	}
	
	// Displays character type
	public void displayType() {
		System.out.println("I am a dwarf.");
	}
	
}
