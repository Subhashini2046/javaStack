import java.util.*;
import java.lang.*;
import java.io.*;
class OrganizationMedicalAndHealth
{
    static int feedback[]=new int[20];
    static void highestFeedBack(int medical[],int healthcare[],int size){
        int j=0;
        for(int i=0;i<size;i++){
            if((i%2==0)){
                if(medical[i]==healthcare[i]){
                    feedback[j++]=medical[i];
                    feedback[j++]=Math.max(medical[i+1],healthcare[i+1]);
                }else{
                    feedback[j++]=medical[i];
                    feedback[j++]=medical[i+1];
                    feedback[j++]=healthcare[i];
                    feedback[j++]=healthcare[i+1];
                }
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n<0){
	   System.out.println("Invalid array Size");
	   System.exit(0);}
	   
	int medical[]=new int[n];
	int healthcare[]=new int[n];
	
	for(int i=0;i<n;i++){
	    medical[i]=sc.nextInt();
	    if(medical[i]<0){
	         System.out.println("Invalid number");
	         System. exit(0);}}
	         
	for(int i=0;i<n;i++){
	    healthcare[i]=sc.nextInt();
	     if(healthcare[i]<0){
	         System.out.println("Invalid number");
	         System. exit(0);}}
	         
	highestFeedBack(medical,healthcare,n);
	
	for(int i=0;i<20;i++){
	    if(feedback[i]!=0){
	        System.out.println(feedback[i]);}}
	    
	}
}
