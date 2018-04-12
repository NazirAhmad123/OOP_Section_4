package encapsulation;

public class Player {
	
	public String playerName;
	public int health;
	public String weapon;
	
	
	public void loseHealth(int damage){
		health -= damage;
		
		if(health-damage < 0){
			System.out.println("Player knocked out.");
		}
	}
	
	public int remainingHealth(){
		return this.health;
	}

}
