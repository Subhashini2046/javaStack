package Activity5;

import java.util.*;

public class DistinctPlayers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<String> players=new HashSet<>();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			players.add(sc.nextLine());
		}
		System.out.println(players.size());
		sc.close();
	}

}
