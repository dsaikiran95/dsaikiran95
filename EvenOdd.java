import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int     number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number=");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}