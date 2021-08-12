package Activity3;

import java.util.*;

abstract class Match{
	private Integer currentscore;
	private Float currentover;
	private Integer target;
	
	public Match(Integer currentscore, Float currentover, Integer target) {
		super();
		this.currentscore = currentscore;
		this.currentover = currentover;
		this.target = target;
	}
	public Integer getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(Integer currentscore) {
		this.currentscore = currentscore;
	}
	public Float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(Float currentover) {
		this.currentover = currentover;
	}
	public Integer getTarget() {
		return target;
	}
	public void setTarget(Integer target) {
		this.target = target;
	}	
	public abstract float calculateRunRate();
	public abstract int calculateBalls();
	public void display(double reqRunrate, int balls){
		System.out.println("Need "+(this.getTarget()-this.getCurrentscore())+" runs in "+balls);
		System.out.println("Required Runrate: "+reqRunrate);
	}
}

class ODIMatch extends Match{

	public ODIMatch(Integer currentscore, Float currentover, Integer target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		int remaingrun=Math.abs((super.getTarget()-super.getCurrentscore()));
		float remaingOver=50-super.getCurrentover();
		return remaingrun/remaingOver;
	}

	@Override
	public int calculateBalls() {
		float remaingBall=50-super.getCurrentover();
		return Math.round(remaingBall)*6;
	}
	
}

class TestMatch extends Match{

	public TestMatch(Integer currentscore, Float currentover, Integer target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		int remaingrun=Math.abs((super.getTarget()-super.getCurrentscore()));
		float remaingOver=30-super.getCurrentover();
		return remaingrun/remaingOver;
	}

	@Override
	public int calculateBalls() {
		float remaingBall=30-super.getCurrentover();
		return Math.round(remaingBall)*6;
	}
	
}

class T20Match extends Match{

	public T20Match(Integer currentscore, Float currentover, Integer target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		int remaingrun=Math.abs((super.getTarget()-super.getCurrentscore()));
		float remaingOver=20-super.getCurrentover();
		return remaingrun/remaingOver;
	}

	@Override
	public int calculateBalls() {
		float remaingBall=20-super.getCurrentover();
		return Math.round(remaingBall)*6;
	}
	
}
public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the match formate");
		 while(true)
	     {
		 System.out.println("1. ODI");
	     System.out.println("2. T20");
	     System.out.println("3. Test");
	     int choice=sc.nextInt();
	     
	     switch (choice) {
	     case 1: System.out.println("Enter the Current score: ");
	     		 int currentscore=sc.nextInt();
	     		 System.out.println("Enter the current Over:");
	     		 float currentover=sc.nextFloat();
	     		 System.out.println("Enter the Target Score:");
	     		 int target=sc.nextInt();
	     		 Match odi=new ODIMatch(currentscore, currentover, target);
	     		 odi.display(odi.calculateRunRate(), odi.calculateBalls());
	     		break;
	     case 2: System.out.println("Enter the current Score:");
		 		 int tcurrentscore=sc.nextInt();
		 		 System.out.println("Enter the current Over:");
		 		 float tcurrentover=sc.nextFloat();
		 		 System.out.println("Enter the Target Score:");
		 		 int ttarget=sc.nextInt();
		 		 Match t20=new T20Match(tcurrentscore, tcurrentover, ttarget);
		 		 t20.display(t20.calculateRunRate(), t20.calculateBalls());
	             break;
	     case 3: System.out.println("Enter the Current score:");
		 		 int mcurrentscore=sc.nextInt();
		 		 System.out.println("Enter the current Over:");
		 		 float mcurrentover=sc.nextFloat();
		 		 System.out.println("Enter the Target Score:");
		 		 int mtarget=sc.nextInt();
		 		 Match testMatch=new TestMatch(mcurrentscore, mcurrentover, mtarget);
		 		testMatch.display(testMatch.calculateRunRate(), testMatch.calculateBalls());
	             break;
	     default: System.out.println("Invalid choice");
	 }
	     }

		
	}

}
