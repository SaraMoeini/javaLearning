/**
 * 
 * @author sara
 * with and without Encapsulation 
 */
public class Main {

	public static void Main(String[] args) {
 
		//without
		Player player = new Player();
		player.name ="Sara";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health = "+ player.healthRemaining());
		
		damage = 15;
		player.loseHealth(damage);
		System.out.println("Remaining health = "+ player.healthRemaining());
		
		
		//with
		EnhancedPlayer player2 = new EnhancedPlayer("sara", 200, "Sword");
		System.out.println("Initial health is = "+ player2.getHealth());
		
	}
}
