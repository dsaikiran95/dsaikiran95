// Write a program to print all odd numbers between 1 to 100 using 'continue'

class AllOddNumbers {

	public static void main(String args[]) {
		//intialize the value
      int i=100;
      System.out.println("The odd numbers are: ");
      //use for loop condition 
      for(i=1;i<=100;i++){
      	if (i%2!=0){
      		System.out.print(i +" ");
      	}
      }

	}

}