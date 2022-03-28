/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Iterator;

public class IteratorArrayDeque {
     //main method
     public static void main(String[] args) {
          //Scanner class is used to take input from user
          Scanner sc = new Scanner(System.in);
          //Creating an ArraryDeque 
          ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
          //taking input from user
          System.out.println("Enter how many numbers you want: ");
          int n = sc.nextInt();
          //add elements to the queue
          for(int i=0;i<n;i++) {
               System.out.println("Enter number"+i+":");
               deque.add(sc.nextInt());
          }
          System.out.println("ArrayDeque:"+deque);
          //create an iterator
          Iterator value = deque.iterator();
          //display the values after iterating through he deque
          System.out.println("The iterator values are: ");
          while(value.hasNext()) {
               System.out.println(value.next());
          }
     }
}