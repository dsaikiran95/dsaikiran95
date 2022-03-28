/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/

import java.util.Scanner;
import java.util.PriorityQueue;

public class Priority {
     //main method
     public static void main(String[] args ) {
          //Scanner is used to take input from user
          Scanner sc = new Scanner(System.in);
          //initialize priority queue object 
          PriorityQueue<String> p = new PriorityQueue<String>();
          //taking input from user
          System.out.println("Enter how many colors you want: ");
          int n = sc.nextInt();
          //take colors from user
          System.out.println("Enter colors: ");
          //using for loop
          for(int i=0;i<=n;i++) {
               p.add(sc.nextLine());
          }
          String head = p.poll();
          //print the result
          System.out.println("Elements of the priority queue: "+p);
     }
}