package Model;

import java.util.List;
import java.util.Collections;

public class Team {
	
	String name;
	List<Player> tPlayers;
	
	public Team(String teamName){
		name = teamName;
	}
	
	public void addPlayer(Player p){
		tPlayers.add(p);
	}
	
	public List<Player> getPlayers(){
		return tPlayers;
	}
	
	//TODO: IMPLEMENT THIS
	public List<Player> getTop5Players(){
		
		
		Collections.sort(List<Player> tPlayers, Comparator<? super Player> tPlayers.getShots().size());
		Collections.reverse(tPlayers);
		
		
		return null;
	}

}
