
//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, i, j, flag;
        // taking staring number input
        System.out.printf("Enter starting number : ");
        num1 = sc.nextInt(); 
        // taking ending number input
        System.out.printf("Enter ending number :  ");
        num2 = sc.nextInt(); 
        System.out.printf("\nPrime numbers between %d and %d are: ", num1, num2);
        
        // covering the interval
        for (i = num1; i <= num2; i++) 
        {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            
            // checking prime number
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
 
     
}