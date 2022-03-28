/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList {
     //main method
     public static void main(String[] args) {
          //declaring  a varibable
          int a;
          //Scanner is used to take input from users
          Scanner sc = new Scanner(System.in);
          //taking input from user
          System.out.println("Enter how many numbers you want: ");
          int n = sc.nextInt();
          //creating a object
          ArrayList<Integer>list1 = new ArrayList<>();
          //using for loop
          for(a=0;a<=4;a++) {
               System.out.println("Enter number"+a);
               int num = sc.nextInt();
               list1.add(num);
          }
          //Assign the first refernce to second
          ArrayList<Integer>list2 = new ArrayList<>();
          list2.addAll(list1);
          //iterate over second ArrayList and print
          Iterator itr = list2.iterator();
          //getting the iterator
          System.out.println("-----Iterating over the second ArrayList-----");
          //check if the iterator has the elements
          while(itr.hasNext()) {
               //printing te element and move to next
               System.out.println(itr.next());
          }
     }
}


