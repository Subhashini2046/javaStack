package Activity6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TeamC{
	String name;
	Long numberOfMatches;
	public TeamC(String name, Long numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(Long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	
}
class TeamComparator implements Comparator<TeamC>{

	@Override
	public int compare(TeamC o1, TeamC o2) {
		return (int)(o1.numberOfMatches-o2.numberOfMatches);
	}
	
}
public class TeamMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<TeamC> team=new ArrayList<>();
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    System.out.println("Enter number of teams:");
	    int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++) {
	    	System.out.println("Enter Name");
	    	String name=br.readLine();
	    	System.out.println("Enter number of matches");
	    	long num=Long.parseLong(br.readLine());
	    	team.add(new TeamC(name,num));
	    }
		Collections.sort(team, new TeamComparator());
		for(TeamC t:team) {
			System.out.println(t.getName()+" - "+t.numberOfMatches);
		}
     
	}

}
