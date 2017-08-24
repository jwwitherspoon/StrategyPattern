// Subclass of Character
public class Human extends Character {
	
	// Explicit constructor that specifies which groups the character falls into
	// by instantiating classes that implement HeightGroup and AbilityGroup
	public Human() {
		heightGroup = new Tall();
		abilityGroup = new Sword();
	}
	
	// Displays character type
	public void displayType() {
		System.out.println("I am a human.");
	}
	
}
