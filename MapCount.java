/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/

import java.util.Scanner;
import java.util.HashMap;
public class MapCount {
      //main method
      public static void main(String[] args) {
         //Scanner is used to take input from user
         Scanner sc = new Scanner(System.in);
         boolean loopAgain = true;
         //declare HashMap object 
         HashMap<Integer,String> hm = new HashMap<Integer,String>();
         do {
               //ask for user input for value and key
               System.out.print("Enter Value: ");
               Integer value = Integer.parseInt(sc.nextLine());
               //to enter key
               System.out.print("Enter key: ");
               String key = sc.nextLine();
               //add the user inputs to the HashMap
               String oldVal = hm.put(value,key);
               //using of condition
               if (oldVal!=null) {
                     System.out.println("Student Number: "+value+" is "+oldVal+" and has been overwritten by "+key);
               }
               //ask user if they want to enter another
               System.out.print("Enter anothe student (y/n) ? ");
               String answer = sc.nextLine();
               //condition to satisfy inorder to loop again
               if (answer.equals("y") || answer.equals("Y")) {
                     continue;
               }
               else {
                     break;
               }
         }
         //using while loop
         while (loopAgain);
         sc.close();
         //print total size as a result
         System.out.println("\nthe size of the map is "+hm.size());
      }
}