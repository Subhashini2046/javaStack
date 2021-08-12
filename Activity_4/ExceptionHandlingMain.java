package Activity4;

import java.io.*;

public class ExceptionHandlingMain {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    try {
	    System.out.println("Enter the total runs scored");
	    int totalRunsScored=Integer.parseInt(br.readLine());
	    System.out.println("Enter the total overs faced");
	    int totatOversFaced=Integer.parseInt(br.readLine());
	    float runRate;
	    	runRate= totalRunsScored/totatOversFaced;
	    	System.out.println("Current Run Rate :"+runRate);
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e);
	    }
	    catch(NumberFormatException e) {
	    	System.out.println(e);
	    }
	}
}
