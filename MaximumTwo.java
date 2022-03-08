
import java.util.Scanner;
class MaximumTwo
{
    public static void main(String[] args)
    {
        //declare variables
        int num1;
        int num2;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the num1:");
        num1=sc.nextInt();
        System.out.println("Enter the num2:");
        num2=sc.nextInt();
        if(num1>=num2)
        {
            System.out.println(num1+ " is the Largest Number");
        }
        else if(num2>=num1)
        {
            System.out.println(num2+ " is the Largest Number");
        }
        
    }
}