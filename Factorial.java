import java.util.Scanner;
class Factorial{
	
	public static void main(String[] args) 
	{
		int i = 1, num; 
		long fa = 1;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any Value : ");
		num = sc.nextInt();
		
		while (i <= num)  {
			fa = fa * i;
			i++;
		}
		System.out.format(" The Result of %d = %d", num, fa);
	}
}