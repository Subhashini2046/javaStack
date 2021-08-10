import java.util.*;
import java.lang.*;
import java.io.*;

class Car
{
    public int productDigits(int num){
        int digits=1;
        if(num<0 || num>32767){
            return -1;
        }else{
            while(num>0){
                int rem=num%10;
                digits=digits*rem;
                num=num/10;
            }
        }
        return digits;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Car c=new Car();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int value=c.productDigits(n);
	if(value==-1)
	    System.out.println("Invalid Input");
	else
	    System.out.println(value);
	}
}
