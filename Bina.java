import java.util.*;
class Bina
{
  public static void main(String[] args)
    {
       int a;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       a = sc.nextInt();
       System.out.println(Integer.toBinaryString(a));
    }
}