
public abstract class Character {
	HeightGroup heightGroup;
	AbilityGroup abilityGroup;
	
	public Character() {}
	
	abstract void displayType();
	
	public void displayHeight() {
		heightGroup.height();
	}
	
	public void displayAbility() {
		abilityGroup.ability();
	}
}
