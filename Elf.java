
public class Elf extends Character {
	
	public Elf() {
		heightGroup = new Tall();
		abilityGroup = new Bow();
	}
	
	public void displayType() {
		System.out.println("I am an elf.");
	}
	
}