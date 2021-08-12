package Activity5;
import java.util.*;
public class PlayerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		ArrayList<String> iplSeason13=new ArrayList<>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		sc.next();
		for(int i=0;i<5;i++) {
			iplSeason13.add(sc.nextLine());
		}
		ArrayList<String> iplSeason12=new ArrayList<>();
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++) {
			iplSeason12.add(sc.nextLine());
		}
//iplSeason12.add("KL Rahul");
//iplSeason12.add("Shikhar Dhawan");
//iplSeason12.add("David Warner");
//iplSeason12.add("Shreyas Iyer");
//iplSeason12.add("Ishan Kishan");
//
//ArrayList<String> iplSeason13=new ArrayList<>();
//iplSeason13.add("David Warner");
//iplSeason13.add("KL Rahul");
//iplSeason13.add("Quinton De Kock");
//iplSeason13.add("Shikhar Dhawan");
//iplSeason13.add("Andre Russel");
//
			iplSeason13.retainAll(iplSeason12);
			System.out.println(iplSeason13);
			sc.close();

	}

}
