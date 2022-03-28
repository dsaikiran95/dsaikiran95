/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   Expected Output: 10,9,6,4,3
   
 */

import java.util.Scanner;
public class AscendingOrder {
   //main method
   public static void main(String[] args) {
      //Scanner is used to take input from users
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size :");
      int size = sc.nextInt();
      System.out.println("Enter "+size+" Elements : ");
      int arr[] = new int[size];
      //initialize i
      int i = 0;
      //using while loop 
      while (i<size) {
         arr[i]=sc.nextInt();
         i++;
      }
      //using for loop 
      for (int j=0;j<size-1;j++) {
         for(int k=0;k<size-1;k++) {
            //using if loop
            if(arr[k]<arr[k+1]) {
               arr[k+1] = arr[k]+arr[k+1];
               arr[k] = arr[k+1]-arr[k];
               arr[k+1] = arr[k+1]-arr[k];
            }
         }
      }
      //check and print result
      System.out.print("Sorted array is: ");
      int I=0;
      //using while loop
      while(I<size) {
         System.out.print(arr[I]+" ");
         I++;
      }
   }
}

// Good Job done!
