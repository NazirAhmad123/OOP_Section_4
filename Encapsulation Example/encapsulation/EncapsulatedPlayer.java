package encapsulation;

public class EncapsulatedPlayer {
	
	private String name;
	private String sword;
	private int health = 100;
	
	EncapsulatedPlayer(String name, String sword,
			int health){
		this.name = name;
		this.sword = sword;
		if(health > 0 && health <= 100){
			this.health = health;
		}
		
	}
	public void loseHealth(int damage){
		health -= damage;
		
		if(health-damage < 0){
			System.out.println("Player knocked out.");
		}
	}
	public int getHealth() {
		return health;
	}
	
	

}
