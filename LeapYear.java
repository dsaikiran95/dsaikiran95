
import java.util.Scanner;
class LeapYear 
{
    public static void main(String[] args)
    {
     int check_year;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a year");
     check_year=sc.nextInt();
     if ((check_year % 400) == 0)
     {
       System.out.println("year"+ check_year+ "is leap year");
     }  
     else if ((check_year % 100) == 0)
     {
       System.out.println(check_year + "is a not leap year.\n");
     }
     else if ((check_year % 4) == 0)
     {
       System.out.println(check_year + "is a leap year.");
     }  
     else
     {
     System.out.println(check_year +  "is not a leap year");
     }
  }
  
}
