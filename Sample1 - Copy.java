// Complete and execute java Program for checking the number of digits in a number
import java.util.Scanner; 
class Sample1 {

	public static void main(String args[]) {
		int num =1234;// you can also change the value to test the output
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		if(num>=10 && num<=99) {
	  		System.out.println("Its a two digit number");
		}
		else if(num>=100 && num<=999) {
	  		System.out.println("Its a three digit number");
		}
		else if(num>=1000 && num<=9999 ) {
	  		System.out.println("Its a four digit number");
		}
		else if(num>=10000 && num<=99999) {
	  		System.out.println("Its a five digit number");			
		}
		else {
	  		System.out.println("number is not between 1 & 99999");			
		}
   	}
}
