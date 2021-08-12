package Activity3;

import java.util.Scanner;

class HotelRoom{
	private String hotelName;
	private Integer numberOfSqFeet;
	private Boolean hasTV;
	private Boolean hasWifi;
	
	public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(Integer numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public Boolean getHasTV() {
		return hasTV;
	}

	public void setHasTV(Boolean hasTV) {
		this.hasTV = hasTV;
	}

	public Boolean getHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(Boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public int calculateTariff() {
		return 0;
	}
	public int getRatePerSqFeet() {
		return 0;
	}
	
	public void displayHetelDetails(int tariff,int sq) {
		System.out.println("Tariff cost: "+tariff);
		System.out.println("Square feet: "+sq);
	}
}
class DeluxeRoom extends HotelRoom{
	protected Integer ratePerSqFeet;

	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int getRatePerSqFeet(){
		if(super.getHasWifi())
			return (this.ratePerSqFeet+2);
		return 0;
	}
	
}
class DeluxeSeaViewRoom extends DeluxeRoom{

	public DeluxeSeaViewRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi,
			Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
		// TODO Auto-generated constructor stub
	}
	
}
class SuiteRoom extends HotelRoom{
	private Integer ratePerSqFeet;

	public SuiteRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int getRatePerSqFeet(){
		if(super.getHasWifi())
				return (this.ratePerSqFeet+2);
		return this.ratePerSqFeet;
	}
}
public class HotelMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 while(true)
	     {
		 System.out.println("1. Deluxe Room");
	     System.out.println("2. Deluxe AC Room");
	     System.out.println("3. Suite AC Room");
	     System.out.println("Select Room Type:");
	     int choice=sc.nextInt();
	     
	     switch (choice) {
	     case 1: System.out.println("Hotel Name:");
	     		 String hname=sc.next();
	     		 System.out.println("Room Square Feet Area:");
	     		 int sq=sc.nextInt();
	     		 System.out.println("Room has TV (yes/no):");
	     		 String tv=sc.next();
	     		 boolean t=true;
	     		 if(tv.equals("yes"))
	     			 t=true;
	     		 else
	     			 t=false;
	     			 
	     		 System.out.println("Room has Wifi (yes/no):");
	     		String wifi=sc.next();
	     		 boolean w=true;
	     		 if(wifi.equals("yes"))
	     			 w=true;
	     		 else
	     			 w=false;
	     		 System.out.println("Room Tariff per day is");
	     		 int tariff=sc.nextInt();
	     		 DeluxeRoom dr=new DeluxeRoom(hname, sq, t,w,10);
	     		 dr.displayHetelDetails(tariff, dr.getRatePerSqFeet());
	     		break;
	     case 2: System.out.println("Hotel Name:");
		 		 String dname=sc.next();
		 		 System.out.println("Room Square Feet Area:");
		 		 int dsq=sc.nextInt();
		 		 System.out.println("Room has TV (yes/no):");
		 		 String dtv=sc.next();
		 		 boolean dt=true;
		 		 if(dtv.equals("yes"))
		 			 dt=true;
		 		 else
		 			 dt=false;
		 			 
		 		 System.out.println("Room has Wifi (yes/no):");
		 		String dwifi=sc.next();
		 		 boolean dw=true;
		 		 if(dwifi.equals("yes"))
		 			 dw=true;
		 		 else
		 			 dw=false;
		 		 System.out.println("Room Tariff per day is");
		 		 int dtariff=sc.nextInt();
		 		 DeluxeRoom drm=new DeluxeSeaViewRoom(dname, dsq, dt,dw,12);
		 		 drm.displayHetelDetails(dtariff, drm.getRatePerSqFeet());
	             break;
	     case 3: System.out.println("Hotel Name:");
		 		 String sname=sc.next();
		 		 System.out.println("Room Square Feet Area:");
		 		 int ssq=sc.nextInt();
		 		 System.out.println("Room has TV (yes/no):");
		 		 String stv=sc.next();
		 		 boolean st=true;
		 		 if(stv.equals("yes"))
		 			 st=true;
		 		 else
		 			 st=false;
		 			 
		 		 System.out.println("Room has Wifi (yes/no):");
		 		String swifi=sc.next();
		 		 boolean sw=true;
		 		 if(swifi.equals("yes"))
		 			 sw=true;
		 		 else
		 			 sw=false;
		 		 System.out.println("Room Tariff per day is");
		 		 int stariff=sc.nextInt();
		 		 DeluxeSeaViewRoom sdr=new DeluxeSeaViewRoom(sname, ssq, st,sw,15);
		 		 sdr.displayHetelDetails(stariff, sdr.getRatePerSqFeet());
	             break;
	     default: System.out.println("Invalid choice");
	 }
	     }


	}

}
