package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leagueTeams;
	
	public Manager(){
		//TODO: IMPLEMENT THIS TOO
	}
	
	public void addMatch(Match leagueMatches){
		this.leagueMatches.add(leagueMatches);
	}
	
	public void addLeague(Team leagueTeams){
		this.leagueTeams.add(leagueTeams);
	}
	
	public void DisplayTopScoringMatches(){
		//TODO: IMPLEMENT THIS
		
		System.out.println();
	}
	public void DisplayTop5Players(){
		//TODO: IMPLEMENT THIS
		
	}
	public void DisplayTopGoalie(){
		//TODO: IMPLEMENT THIS
	}
	
	public static void main(String args[]){
		Manager m = new Manager();
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}
