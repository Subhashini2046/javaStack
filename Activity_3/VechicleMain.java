package Activity3;

import java.util.Scanner;

class Vehicle{
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private Integer fuelCapacity;
	private Integer cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Integer getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(Integer fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

	public void displayMake() {
		
	}
	public void displayBasicInfo() {
		System.out.println("**"+this.getMake()+"**");
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number:"+this.getVehicleNumber());
		System.out.println("Fuel Capacity:"+this.getFuelCapacity());
		System.out.println("Fuel Type:"+this.getFuelType());
		System.out.println("CC:"+this.getCc());	
	}
	public void displayDetailInfo(){
		
	}
	
}

class TwoWheeler extends Vehicle{
private Boolean kickStartAvailable;
	public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
		Boolean kickStartAvailable) {
	super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	this.kickStartAvailable = kickStartAvailable;
}


	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}


	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}


	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		if(this.getKickStartAvailable())
			System.out.println("Kick Start Available: "+"YES");
		else
			System.out.println("Kick Start Available: "+"NO");
	}
}

class FourWheeler  extends Vehicle{
	private String audioSystem;
	private Integer numberOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
			String audioSystem, Integer numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	

	public String getAudioSystem() {
		return audioSystem;
	}


	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}


	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+this.getAudioSystem());
		System.out.println("Number of Doors:"+this.getNumberOfDoors());
	}
}
public class VechicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 while(true)
	     {
		 System.out.println("1. Four Wheeler");
	     System.out.println("2. Two Wheeler");
	     System.out.println("Enter Vehicle Type:");
	     int choice=sc.nextInt();
	     
	     switch (choice) {
	     case 1: System.out.println("Vehicle Make: ");
	     		 String vmake=sc.next();
	     		 System.out.println("Vehicle Number:");
	     		 String vnumber=sc.next();
	     		 System.out.println("Fuel Type:");
	     		 
	     		 while(true) {
	     			 System.out.println("1. Petrol");
	     		     System.out.println("2. Diesel");
	     		    int choice1=sc.nextInt();
	     		    switch(choice1) {
	     		    case 1:System.out.println("Fuel Capacity:");
	     		    	  int fuelCapacity=sc.nextInt();
	     		    	  System.out.println("Engine CC:");
	     		    	  int cc =sc.nextInt();
	     		    	  System.out.println("Audio System:");
	     		    	  String audioSystem =sc.next();
	     		    	  System.out.println("Number of Doors:");
	     		    	  int numberOfDoors=sc.nextInt();
	     		     	  FourWheeler fw=new FourWheeler(vmake, vnumber,"Petrol", fuelCapacity, cc, audioSystem, numberOfDoors);
	     		     	  fw.displayBasicInfo();
	     		     	  fw.displayDetailInfo();
	     		     	  break;
	     		    }
	     		 }
	     case 2: System.out.println("Vehicle Make: ");
 		 String tmake=sc.next();
 		 System.out.println("Vehicle Number:");
 		 String tnumber=sc.next();
 		 System.out.println("Fuel Type:");
 		 
 		 while(true) {
 			 System.out.println("1. Petrol");
 		     System.out.println("2. Diesel");
 		    int choice1=sc.nextInt();
 		    switch(choice1) {
 		    case 1:System.out.println("Fuel Capacity:");
 		    	  int fuelCapacity=sc.nextInt();
 		    	  System.out.println("Engine CC:");
 		    	  int cc =sc.nextInt();
 		    	  System.out.println("Kick Start Available(yes/no):");
 		    	  String kickStart =sc.next();
 		    	  boolean k=false;
 		    	  if(kickStart.equals("yes"))
 		    		  k=true;
 		    	  TwoWheeler tw=new TwoWheeler(tmake, tnumber,"Petrol", fuelCapacity, cc, k);
 		     	  tw.displayBasicInfo();
 		     	  tw.displayDetailInfo();
 		     	  break;
 		    }
 		 }
	     default: System.out.println("Invalid choice");
	 }
	     }

	}

}
