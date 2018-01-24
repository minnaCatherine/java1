import java.util.*;
import java.util.Scanner;
class movieDetails{

  public static void main(String args[]){

   int Id[]=new int[10];
   String Name[]=new String[10];
   String Actor[]=new String[10];
   String Director[]=new String[10];
   int Rating[]=new int[10];
   int n=10;
   String a="amitabhbachan";
   String b="karanjohar";
   Scanner sc=new Scanner(System.in);
   int count=0,count1=0,count2=0;
   for(int i=0;i<n;i++)
   {   
   System.out.println("Enter the Id");
   Id[i]=sc.nextInt();
   System.out.println("Enter the Movie Name");
   Name[i]=sc.next();
   System.out.println("Enter the Actor");
   Actor[i]=sc.next();
   System.out.println("Enter the Director");
   Director[i]=sc.next();
   System.out.println("Enter the Rating");
   Rating[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   { 
	if(Rating[i]>5)
        {
        count++;
        }
   }
    System.out.println("Rating count"+count);
  for(int i=0;i<n;i++)
	{
         if(Actor[i].equals(a))
        { 
        count1++;
        }
        }
     System.out.println("AmitabhBachan"+count1);
    for(int i=0;i<n;i++)
	{
         if(Director[i].equals(b))
        { 
        count2++;
        }
        }
     System.out.println("KaranJohar count"+count2);
     
}  
}