package Activity2;

import java.util.Scanner;

class Customer{
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
	public void displayCustomerDetails() {
		System.out.println("Name: "+getName());
		System.out.println("Address: "+getAddress());
		System.out.println("Mobile: "+getMobile());
	}
}
public class CustomerMain {

	public static void main(String[] args) {
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details:");
		String details=sc.next();
		String str[]=details.split(",");
		c.setName(str[0]);
		c.setAddress(str[1]);
		c.setMobile(str[2]);
		c.displayCustomerDetails();
		sc.close();
	}

}
