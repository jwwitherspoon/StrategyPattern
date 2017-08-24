// Subclass of Character
public class Wizard extends Character {
	
	// Explicit constructor that specifies which groups the character falls into
	// by instantiating classes that implement HeightGroup and AbilityGroup
	public Wizard() {
		heightGroup = new Tall();
		abilityGroup = new Magic();
	}
	
	// Displays character type
	public void displayType() {
		System.out.println("I am a wizard.");
	}
	
}
