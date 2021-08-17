package Activity6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.*;

class Players implements Comparable{
	private String name;

	public Players(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Players player=(Players)o;  
		return this.name.compareTo(player.name);
	}
	
}
class Team implements Comparable{
	private String name;
	private List<Players> playerList;
	
	public Team() {
		super();
	}

	public Team(String name) {
		this.name = name;
	}

	public Team(String name, List<Players> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Players> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Players> playerList) {
		this.playerList = playerList;
	}

	public void addPlayer(String playername){
		playerList.add(new Players(playername));
	}
	public List getPlayerList1(){
		return playerList;	
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class DisplayTeamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Set<String> team=new TreeSet<String>();
		Team t=new Team();
		ArrayList<Team> team=new ArrayList<>();
		ArrayList<Players> player;
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int n=Integer.parseInt(br.readLine());
	    int j=0;
	     String arr[]=new String[n];
	     String arrTeam[]=new String[n];
	    		for(int i=0;i<n;i++) {
	    			String str=br.readLine();
	    			String arr1[]=str.split("\\|");
	    			//team.add(new Team(arr1[0],arr1[1]));
    					arrTeam[j]=arr1[0];
	    				arr[j]=arr1[1];
	    				team.add(new Team(arr[1],player.add(new Players(arr[0])));
	    				j++;
	    		}
	    		
//	    for(int i=0;i<n;i++) {
//	    	
//	    }
	    		for(Team t:team) {
	    			System.out.println(t);
	    		}
	    		
//	    		for(int i=0;i<arr.length;i++) {
//	    			System.out.println(arr[i]);
//	    		}
	    		
	}

}
