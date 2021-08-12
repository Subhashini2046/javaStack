package Activity4;

import java.util.*;
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  try {
			    System.out.println("Enter the number of overs");
			    int noOfOver=sc.nextInt();
			    System.out.println("Enter the number of runs for each over");
			    int noOfRun[]=new int[noOfOver];
			    for(int i=0;i<noOfOver;i++) {
			    	noOfRun[i]=sc.nextInt();}
			    System.out.println("Enter the Over number");
			    int run=sc.nextInt();
			    System.out.println("Runs scored in this over : "+noOfRun[run-1]);
			    }
		  catch(NegativeArraySizeException e) {
			    	System.out.println(e);
			    }
		  catch(ArrayIndexOutOfBoundsException e) {
			    	System.out.println(e);
			    }
		  sc.close();

	}

}
