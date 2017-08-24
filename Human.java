
public class Human extends Character {
	
	public Human() {
		heightGroup = new Tall();
		abilityGroup = new Sword();
	}
	
	public void displayType() {
		System.out.println("I am a human.");
	}
	
}