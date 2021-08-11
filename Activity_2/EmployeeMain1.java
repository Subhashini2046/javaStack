package Activity2;
import java.util.Scanner;
class Employee1{
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
public class EmployeeMain1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name:");
	String name=sc.next();
	System.out.println("Enter Address:");
	String address=sc.next();
	System.out.println("Enter Mobile:");
	String mobile=sc.next();
	
	Employee1 emp=new Employee1();
	emp.setName(name);
	emp.setAddress(address);
	emp.setMobile(mobile);
	
	System.out.println("Employee Details");
	System.out.println("Name: "+emp.getName());
	System.out.println("Address: "+emp.getAddress());
	System.out.println("Mobile: "+emp.getMobile());
	
	System.out.println("Verify and Update the details:");
	 while(true)
     {
	 System.out.println("1. Update Employee name");
     System.out.println("2. Update Employee Address");
     System.out.println("3. Update Employee mobile");
     System.out.println("4. All information correct/Exit");
     int choice=sc.nextInt();
     
     switch (choice) {
     case 1: System.out.println("Current Name is: "+emp.getName());
     		 System.out.println("Enter the Name:");
     		 String uname=sc.next();
     		 emp.setName(uname);
     		break;
     case 2: System.out.println("Current address is: "+emp.getAddress());
     		 System.out.println("Enter the address:");
     		 String uaddress=sc.next();
     		 emp.setAddress(uaddress);
             break;
     case 3: System.out.println("Current Mobile Number is: "+emp.getMobile()); 
     		 System.out.println("Enter the Mobile:");
     		 String umobile=sc.next();
    		 emp.setMobile(umobile);
             break;
     case 4: System.out.println("The Details are");
		 	 System.out.println("Name: "+emp.getName());
		 	 System.out.println("Address: "+emp.getAddress());
		 	 System.out.println("Mobile: "+emp.getMobile());
		 	 System.exit(0);
              break;
     default: System.out.println("Invalid choice");
 }
     }
	}

}
