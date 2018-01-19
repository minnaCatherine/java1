import java.util.*;
import java.util.Scanner;
class Emp{
  public static void main(String args[]){
   int EmpID[]=new int[10];
   int n=10;
   String EmpName[]=new String[10];    
   double EmpSalary[]=new double[10];
   double Salary[]=new double[10];
   double max=0;
   double HighestSalary[]=new double[10];
   Scanner sc=new Scanner(System.in);
   
     for(int i=0;i<n;i++){
     System.out.println("Enter Employee ID");
     EmpID[i]=sc.nextInt();
     System.out.println("Enter Employee Name");
     EmpName[i]=sc.next();
     System.out.println("Enter Employee Salary");
     EmpSalary[i]=sc.nextDouble();
     System.out.println("Salary After 10 years");
     Salary[i]=(EmpSalary[i]+(EmpSalary[i]*0.10))*10;
     System.out.println(Salary[i]+"\t"+"for"+"\t"+EmpName[i]);
     HighestSalary[i]=Salary[i];
       if(max< HighestSalary[i])
       {
        max=HighestSalary[i];
       
       }
     } 
 System.out.println(" The highest salary by the Employee is"+max);
    
 }
}