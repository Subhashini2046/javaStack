package Activity5;

import java.util.*;

public class TreeSetPlayer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<String> players=new TreeSet<>();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			players.add(sc.nextLine());
		}
		for(String player:players) {
			System.out.println(player);
		}
		sc.close();
	}

}
