import java.util.Scanner;
class MaximumThree
{
    public static void main(String[] args)
    {
        //declare variables
        int num1;
        int num2;
        int num3;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the num1:");
        num1=sc.nextInt();
        System.out.println("Enter the num2:");
        num2=sc.nextInt();
        System.out.println("Enter the num3:");
        num3=sc.nextInt();
        if( num1 >= num2 && num1 >= num3)
        {
        System.out.println(num1+"is the Largest Number");
        }
        else if (num2 >= num1 && num2 >= num3)
        {
        System.out.println(num2+"is the Largest Number");
        }
        else 
        {
        System.out.println(num3+ "is the largest Number");
        }
    }
}