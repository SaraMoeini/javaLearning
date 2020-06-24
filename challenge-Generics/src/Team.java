
import java.util.ArrayList;

/**
 * Generics
 */
public class Team<T extends Player> implements Comparable<Team<T>> {	// any type extends from Player or subclass of Player
//?
	public String name;	//name of team
	int played=0 ;	//number of gamed played
	int won=0;
	int lost=0;
	int tied=0; 
	
	private ArrayList<T> members = new ArrayList<>(); //parameterized type

	public Team(String name) {
		this.name = name;	
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println( player.getName() + "is already on this team.");//cast parameterized type to Player
			return false;
		} else {
			members.add(player);
			System.out.println( player.getName() + " picked for team."+this.name );
			return true;
		}
	}  
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		String msg;
		
		if(ourScore > theirScore) {
			won++;
			msg = " beat ";
		} else if(ourScore == theirScore) {
			tied++;
			msg = " drew with ";
		} else {
			lost++;
			msg = " lost to ";
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() + msg + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	} 
	
	public int ranking() {
		return (won * 2) + tied;
		
	}

	@Override
	public int compareTo(Team<T> team) {
		 if (this.ranking() > team.ranking()) {
			 return -1;
		 }else if(this.ranking() < team.ranking()) {
			 return 1;
		 } else {
		return 0;
		}
	}
	
	
	
	
	
	
	
}
