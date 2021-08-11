package Activity2;
import java.util.*;


public class Player {

	public static String playerNameFormating(String f,String s) {
		String firstName=f.substring(0,1).toUpperCase()+f.substring(1,f.length()).toLowerCase();
		String lastName=s.toUpperCase();
		return firstName+" "+lastName;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stringF=sc.next();
		String stringS=sc.next();
		System.out.print(playerNameFormating(stringF, stringS));
		sc.close();
	}

}
