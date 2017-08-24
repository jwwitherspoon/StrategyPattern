// Base class for all the characters
public abstract class Character {
	
	// Define parameters from HeightGroup and AbilityGroup interfaces
	HeightGroup heightGroup;
	AbilityGroup abilityGroup;
	
	// Explicit constructor
	public Character() {}
	
	// Declare abstract method to display the type of each different subclass
	abstract void displayType();
	
	// Delegate display of height to a class that implements HeightGroup interface
	public void displayHeight() {
		heightGroup.height();
	}
	
	// Delegate display of ability to a class that implements AbilityGroup interface
	public void displayAbility() {
		abilityGroup.ability();
	}
}
