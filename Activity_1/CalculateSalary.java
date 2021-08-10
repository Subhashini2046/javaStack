import java.util.*;
import java.lang.*;
import java.io.*;


class CalculateSalary
{
    public static int calculateSal(int salary, int shifts){
        return (((salary*2/100)*5)+(salary*50/100));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int salary=sc.nextInt();
	int shifts=sc.nextInt();
	int value=calculateSal(salary,shifts);
	if(salary>8000)
	    System.out.println("Salary too large");
	else if(salary<0)
	    System.out.println("salary too small");
	else if(shifts<0)
	    System.out.println("Shifts too small");
	else
	    System.out.println(calculateSal(salary,shifts));
	}
	
}
