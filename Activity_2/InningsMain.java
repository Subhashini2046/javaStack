package Activity2;

import java.util.Scanner;

class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void displayInningsDetails() {
		System.out.println("Name: "+getTeamname());
		System.out.println("Scored: "+getRuns());
		if(getInningsname().equals("First"))
			System.out.println("Need "+(getRuns()+1)+" to "+" win ");
		else if(getInningsname().equals("Second"))
			System.out.println("Match Ended");
	}
	
}
public class InningsMain {

	public static void main(String[] args) {
		Innings in=new Innings();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team name:");
		String teamName=sc.next();
		System.out.println("Enter session:");
		String session=sc.next();
		System.out.println("Enter runs:");
		int runs=sc.nextInt();
		in.setTeamname(teamName);
		in.setInningsname(session);
		in.setRuns(runs);
		in.displayInningsDetails();
	}

}
