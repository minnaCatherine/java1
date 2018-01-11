import java.util.*;
import java.util.Scanner;
class Details{
public static void main(String args[]){
String studentName;
int currentYear=2018;
int day,mon,year,age;
int Counter=0;
while(Counter<10)
{
System.out.println( " Enter the Details"); 
Scanner sc=new Scanner(System.in);
studentName=sc.next();
day=sc.nextInt();
mon=sc.nextInt();
year=sc.nextInt();
age=currentYear-year;
if(age>=18)
{
System.out.println(studentName+"\t"+"Eligible for voting");
}
else
{
System.out.println(studentName+"\t"+"Not Eligible for voting");
}
Counter=Counter+1;
}
}
}
