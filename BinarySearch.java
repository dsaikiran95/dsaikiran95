/* JFM1T11_Assignment2:

   Write a program to execute the search of a number in a sorted array following the below logic: 
   If the target element is greater than middle element then you go to the middle of the right of the remaining numbers 
   or otherwise towards middle of the left of the remaining numbers. 
   Continue until the number is either found or not found.
   Prompt the user input from the terminal.
   
   Sample Input: 2,5,10,12,15,20,25,31,40
   Enter number to search x= 20

   Expected Output: Position of element is : 6
   
   Enter number to search x= 26
   Expected Output: Sorry,Key doesn't exist in the array
   
*/

import java.util.Scanner;

public class BinarySearch {
   //main method
   public static void main(String[] args) {
      //Scanner is used to take input from users
      Scanner sc = new Scanner(System.in);
      //taking input from user
      print("Comma seperated Elements are : ");
      String s = sc.nextLine();
      String[] str = s.split(",");
      int arr[] = new int[str.length];
      //initializing a variable
      int i=0;
      //using while loop
      while(i<str.length) {
         arr[i] = Integer.parseInt(str[i]);
         i++;
      }
      print("Enter number to be searched x = ");
      int key = sc.nextInt();
      //call binary search method
      int x = binarySearch(arr,key);
      if(x==0) {
         print("Sorry,key doesn't exist in the array");
      }
      else {
         System.out.println("Position of element is "+(x+1));
      }
   }
   public static int binarySearch(int[] arr,int key) {
      //scanner is used to take input from users
      Scanner sc = new Scanner(System.in);
      //initializing variables
      int lastIndex = arr.length-1;
      int firstIndex = 0;
      int mid = (firstIndex+lastIndex)/2;
      //check each number is greater than or less than mid element
      while(firstIndex<=lastIndex) {
         //if mid element is less than key then it calculates beg and mid
         if(arr[mid]<key) {
            firstIndex = mid+1;
         }
         //if mid element is equal to key then that is the element
         else if(arr[mid] == key) {
            break;
         }
         //if mid element is greater than key than it calculates end and mid
         else {
            lastIndex = mid-1;
         }
         mid = (firstIndex+lastIndex)/2;
      }
      //checking if beg s greater is than end,then mid=0
      if(firstIndex>lastIndex) {
         mid = 0;
      }
      return mid;
   }
   public static void print(String str)
   {System.out.print(str);}
}

// Good Job done!
