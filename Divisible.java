import java.util.Scanner;
class Divisible {
  
    // Main Driver function
    public static void main(String[] args)
    {
        int n;
        //Scanner class to read input data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        n=sc.nextInt();
  
        // Checking if remainder is 0 or not
        // when divided by 5
        if (n % 5 == 0)
  
            // Print yes iif no is divisible by 5
            System.out.println("Yes");
        else
  
            // Print no if no is not divisible by 5
            System.out.println("No");
    }
}