/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.Scanner;

public class FindNumberInArray {
   //main method
   public static void main(String[] args) {
      //declaring variables
      String s;
      //Scanner is used to take input from users
      Scanner sc = new Scanner(System.in);
      //taking input from user
      System.out.println("Enter comma Seperated elements: ");
      s = sc.nextLine();
      String[] str = s.split(",");
      //creating integer array for all elements
      int[] arr = new int[str.length];
      //initializing a variable
      int i = 0;
      //using while loop
      while(i<arr.length) {
         arr[i] = Integer.parseInt(str[i]);
         i++;
      }
      //enter the number that has to be searched
      System.out.println("Enter number to be searched x = ");
      int x = sc.nextInt();
      //initializing variables
      int j=0,temp=0;
      //using while loop
      while(j<arr.length) {
         //search the element, if found print that posistion else print "not found"
         if(x==arr[j]) {
            temp = j;
            break;
         }
         else {
            temp = 0;
            j++;
         }
      }
      //using if condition
      if (temp==0) {
         System.out.println("Sorry "+x+" us not found in array");
      }
      else {
         System.out.println(x+" found at index of "+j);
      }
   }
}

// Good Job done!
