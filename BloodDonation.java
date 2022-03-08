import java.util.Scanner;

public class BloodDonation
{
    public static void main(String[] args)
    {
        int age;
        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age=");
        age = sc.nextInt();
        System.out.println("Enter your weight=");
        weight=sc.nextInt();
        if (age >= 18 && weight>=50)
        {
            System.out.println("You are eligible for blood donation.");
        }
        else
        {
            System.out.println("You are not eligible for blood donation.");
        }
    }
}