import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// ArrayList<Team> teams;
		// Collections.sort(teams);
		//Create a generic class to implement a league table for sport. The class should allow teams to be 
		//added to the list, and store a list of teams that belong to the league.
		
		//Your class should have a method to print out the teams in order, with the team at the top of the 
		//league printed first.
		
		//Only teams of the same type should be added to any particular instance of the league class - the
		//program should fail to compile if an attempt is made to add an incompatible team.
	
		
		League<Team<FootballPlayer>> footballLeague = new League<>("<< AFL >>");
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		
		footballLeague.addTeam(adelaideCrows);
		footballLeague.addTeam(melbourne);
		footballLeague.addTeam(hawthorn);
		footballLeague.addTeam(fremantle);

		Team<BaseballPlayer> baseballTeam = new Team<>("<< Chicago Cubs >>");
		//footballLeague.addTeam(baseballTeam); ==> ERROR        
	}
}