package Activity2;

import java.util.Scanner;

class Company{
	private String name;
	private String employees;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	public void displayCompanyDetails() {
		System.out.println("Name: "+getName());
		System.out.println("Emploees: "+getEmployees());
		System.out.println("Lead: "+getTeamlead());
	}
}
public class CompanyMain {

	public static void main(String[] args) {
		Company c=new Company();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name:");
		String name=sc.next();
		System.out.println("Enter the employees:");
		String ename=sc.next();
		System.out.println("Enter TeamLead:");
		String teamLead=sc.next();
		String str[]=ename.split(",");
		int flag=1;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(teamLead)) {
				flag++;
			}
		}
		c.setName(name);
		c.setEmployees(ename);
		c.setTeamlead(teamLead);
		if(flag==1) {
			System.out.println("Invalid input");
			System.exit(0);
		}else
			c.displayCompanyDetails();
	}

}
