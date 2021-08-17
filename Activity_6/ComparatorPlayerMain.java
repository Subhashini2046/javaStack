package Activity6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Player{
	String name;
	String skill;
	
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}

class PlayerComparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class ComparatorPlayerMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
		ArrayList<Player> playerList=new ArrayList<>();
		System.out.println("Please provide the number of players to be registered");
		int n=Integer.parseInt(br.readLine());
		//sc.next();
		while(n>0) {
			System.out.println("Please enter player name");
			String playerName=br.readLine();
			System.out.println("Please select the skill of the player");
			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");
			int choice=Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:playerList.add(new Player(playerName, "All Rounder"));
				break;
			case 2:playerList.add(new Player(playerName, "Batsman"));
				break;
			case 3:playerList.add(new Player(playerName, "Bowler"));
				break;
			default: System.out.println("Invalid choice");
			
			}
			n--;
		}
		System.out.println("Player Details");
		System.out.println(playerList);
	}

}
