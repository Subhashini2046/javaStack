package Activity4;

import java.util.Scanner;

class CustomException  extends Exception{
	 public CustomException (String str)  
	    {  
	        super(str);  
	    }  
}
public class CustomExceptionMain  extends Exception{
	static void validate (int age) throws CustomException{    
	       if(age < 19){  
	        throw new CustomException("InvalidAgeRangeException");    
	    }}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the player name");
		String playerName=sc.next();
		System.out.println("Enter the player age");
		int playerAge=sc.nextInt();
		validate(playerAge);
		System.out.println("Player name : "+playerName);
		System.out.println("Player age :"+playerAge);
		}
		catch(CustomException e){
			System.out.println(e);
		}
		sc.close();
	}

}
