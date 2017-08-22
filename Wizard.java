
public class Wizard extends Character {
	
	public Wizard() {
		heightGroup = new Tall();
		abilityGroup = new Magic();
	}
	
	public void displayType() {
		System.out.println("I am a wizard.");
	}
	
}
