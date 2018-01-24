import java.util.*;
import java.util.Scanner;

class empl{
 
   public static void main(String[] args)
   {
	int eId[]=new int[10];
	String eN[]=new String[10];
	String eCi[]=new String[10];
	String eCo[]=new String[10];
	String eD[]=new String[10];	
	int eA[]=new int[10];
	String eMs[]=new String[10];
	String eG[]=new String[10];
	double eS[]=new double[10];
	int n=2;
	String m="male";
	String f="female";
	String a="single";
	String b="married";
	String c="hr";
	String d="marketing";
	String e="finance";
	String g="operations";
	String h="india";
	int count=0;
	double max1=0;
	double max2=0;
	double max3=0;
	double max4=0;


	Scanner sc=new Scanner(System.in);

	for(int i=0;i<n;i++)
	{
	System.out.println("Enter Emp id");
	eId[i]=sc.nextInt();
	System.out.println("Enter Emp Name");
	eN[i]=sc.next();
	System.out.println("Enter Emp City");
	eCi[i]=sc.next();
	System.out.println("Enter Emp Country");
	eCo[i]=sc.next();
	System.out.println("Enter Emp Department-HR/MARKETING/FINANCE/OPERATIONS");
	eD[i]=sc.next();
	System.out.println("Enter Emp Age");
        eA[i]=sc.nextInt();
	System.out.println("Enter Emp Marital status");
	eMs[i]=sc.next();
	System.out.println("Enter Emp Gender");
	eG[i]=sc.next();
	System.out.println("Enter Emp Salary");
	eS[i]=sc.nextDouble();
	}	

	for(int i=0;i<n;i++)
	{
	if(eG[i].equals(m) && eMs[i].equals(b))
	{
	 count++;
	}
	System.out.println(eN[i]+" "+eG[i]+" "+eMs[i]);
	}
	System.out.println("No of Emp who are male and married"+" "+count);

	for(int i=0;i<n;i++)
	{	
	if(eD[i].equals(c))
	{
	if(eS[i]>max1){
	max1=eS[i];}
	}
	}
	System.out.println("The highest Salary of HR"+" "+max1); 	
	
	for(int i=0;i<n;i++)
	{	
	if(eD[i].equals(d))
	{
	if(eS[i]>max2){
	max2=eS[i];}
	}
	}
	System.out.println("The highest Salary of Marketing"+" "+max2); 
	
	for(int i=0;i<n;i++)
	{	
	if(eD[i].equals(e))
	{
	if(eS[i]>max3){
	max3=eS[i];}
	}
	}
	System.out.println("The highest Salary of Finance"+" "+max3); 

	for(int i=0;i<n;i++)
	{	
	if(eD[i].equals(g))
	{
	if(eS[i]>max4){
	max4=eS[i];}
	}
	}
	System.out.println("The highest Salary of Operations"+" "+max4); 
        System.out.println("Emp above 60 yrs");
	for(int i=0;i<n;i++)
	{
	if(eA[i]>=60)
	System.out.println(eN[i]);
	} 
	System.out.println("Emp who are female and belong to country india");
	for(int i=0;i<n;i++)
	{
	if(eG[i].equals(f) && eCo[i].equals(h))
	System.out.println(eN[i]);
	}	
   }

}