
import java.util.Scanner;
class NegativePositive
{
        public static void main(String[] args)
     {
       
       
       //variables          
       int number;
       //scanner class
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       number=sc.nextInt();
       if (number > 0)
       {
       System.out.println("number is positive");
       }
       else if (number < 0)
       {
       System.out.println("number is negative");
       }
       else
       {
       System.out.println("zero");
       }
    }
}