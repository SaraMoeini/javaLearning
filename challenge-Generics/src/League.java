import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

	public String name;
	private ArrayList<T> league = new ArrayList<>(); //parameterized type

	
	public League(String name) {
		this.name = name;
	}

	
	public boolean addTeam(T team) {
		if (league.contains(team)) {
			System.out.println(team.getName() + " is already in the list");
			return false;
		} else {
			league.add(team);
			System.out.println(team.getName() + "added");
			return true;
		}
	}
	
	public void showLeagueTable() {
		Collections.sort(league);
		for(T t: league) {
			System.out.println(t.getName() + " : " + t.ranking());
		}
	}
}
