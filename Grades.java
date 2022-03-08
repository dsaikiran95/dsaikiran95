import java.util.Scanner;
public class Grades{
	public static void main(String args[])
	{
		// Declaring and initializing marks variable.You can change the marks value and test your program again
		int marks;
		//Scanner class for input reader
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		marks=sc.nextInt();
		//For Excellent grade, marks must be >=85 and <=100, that's why Logical AND(&&) is used to combine 			the condition
		if(marks>=85 && marks<=100)
		{
			System.out.println("Grade = Excellent");
		}
		//For Very Good grade, marks must be >=70 and <85, and so on
		else if(marks>=70 && marks<85)
		{
			System.out.println("Grade = Very Good");
		}
		else if(marks>=50 && marks<70)
		{
			System.out.println("Grade = Good");
		}
		else if(marks>0 && marks<50)
		{
			System.out.println("Not Qualified");
		}
		// else will be execute if marks don't lie in any of the above conditions
		else
		{
		    System.out.println("Irrelevant Input");
		}	;
	}
}