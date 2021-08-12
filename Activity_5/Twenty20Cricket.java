package Activity5;

import java.util.ArrayList;
import java.util.Scanner;

public class Twenty20Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int score1=0;
		int score2=0;
		ArrayList<Integer> matches=new ArrayList<>();
		for(int i=0;i<n;i++) {
			matches.add(sc.nextInt());
		}
		
		for(Integer m:matches) {
			if(m<60)
				score1++;
			else if(m>=100)
				score2++;
		}
		System.out.println(score1);
		System.out.println(score2);
		sc.close();
	}

}
