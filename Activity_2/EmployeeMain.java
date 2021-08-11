package Activity2;

import java.util.Scanner;

class Employee{
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
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Enter Address:");
		String address=sc.next();
		System.out.println("Enter Mobile:");
		String mobile=sc.next();
		Employee emp=new Employee();
		emp.setName(name);
		emp.setAddress(address);
		emp.setMobile(mobile);
		System.out.println("Employee Details");
		System.out.println("Name: "+emp.getName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("Mobile: "+emp.getMobile());
		sc.close();
	}
}
