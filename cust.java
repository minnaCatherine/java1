import java.util.*;
import java.util.Scanner;

class cust{
	public static void main(String[] args)
	{
        int cId[]=new int[10];
	String cName[]=new String[10];
	int cAge[]=new int[10];
	String cGen[]=new String[10];
	String cCity[]=new String[10];
	String cCoun[]=new String[10];
    	String cHobby[]=new String[10];
	String cph[]=new String[10];
        int count=0,count1=0,count2=0,count3=0,count4=0,count5=0;
        String a="male";
        String b="female";
        int n=10;
        String e="india";
        String f="usa";
        String c="null";
        String d="traveling";
	Scanner sc=new Scanner(System.in); 
       for(int i=0;i<n;i++)
	{
	System.out.println("Enter Cust Id");
  	cId[i]=sc.nextInt();
        System.out.println("Enter Cust Name");
        cName[i]=sc.next();
        System.out.println("Enter Cust Age");
        cAge[i]=sc.nextInt();
	System.out.println("Enter Cust Gender-male/female");
        cGen[i]=sc.next();
	System.out.println("Enter Cust City");
        cCity[i]=sc.next();
 	System.out.println("Enter Cust Country");
        cCoun[i]=sc.next();
	System.out.println("Enter Cust Hobby");
	cHobby[i]=sc.next();
	System.out.println("Enter Cust Ph No");
  	cph[i]=sc.next();
       	}
      for(int i=0;i<n;i++)
	{
	if(cGen[i].equals(a))
	count++;
	}
	System.out.println("No of male Candidates"+count);
      for(int i=0;i<n;i++)
	{
	if(cGen[i].equals(b))
        count1++;
	}
	System.out.println("No of female Candidates"+count1);
     for(int i=0;i<n;i++)
	{
	if(cAge[i]>60)
	count2++;
	}
	System.out.println("No of Senior Citizens"+count2);
     for(int i=0;i<n;i++)
	{
	if(cHobby[i].equals(d))
	count3++;
	}
	System.out.println("No of Cust who has Hobby=Traveling"+count3);
     for(int i=0;i<n;i++)
	{
	if(cCoun[i].equals(e) || cCoun[i].equals(f))
	count4++;
	}
	System.out.println("Cust with country=India and usa"+count4);
     for(int i=0;i<n;i++)
	{
	if(cph[i].equals(c))
        count5++;
	}
	System.out.println("Enter Cust who does not have Ph No"+count5);

       }

}