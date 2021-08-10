import java.util.*;
import java.lang.*;
import java.io.*;

class Organization
{
    public static int countRepeaters(int arr[],int size){
        int count=1;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && arr[j]!=0){
                    count++;
                    arr[j]=0;
                }
            }
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n<0){
	   System.out.println("Invalid Input");
	   System.exit(0);}
	   
	int arr[]=new int[n];
	int arrCheck=0;
	
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	if(arr[i]<0){
	    System.out.println("Invalid Input");
	    System. exit(0);}}
	    
	int value=countRepeaters(arr,n);
	if(value==2)
    	System.out.println(value);
	}
}
