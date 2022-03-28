/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     

import java.util.*; 
import java.util.ArrayList; 

class Duplicate {
     //main method
     public static void main(String[] args) {
          //decalre variable
          int a;
          //Scanner is used to take input from user
          Scanner sc = new Scanner(System.in);
          //taking input from user
          System.out.println("Enter how many numbers you want: ");
          int n = sc.nextInt();
          //create an object of LinkedHashSet Class
          LinkedHashSet<Integer> make = new LinkedHashSet();
          //using for loop
          for(a=0;a<n;a++) {
               System.out.println("Enter number "+a);
               int num = sc.nextInt();
               make.add(num);
          }
          //create an object of ArrayList class and pass LinkedHashSet object
          ArrayList<Integer> list1 = new ArrayList<>();
          list1.addAll(make);
          //print result
          System.out.println("After removing duplicates: ");
          System.out.println(list1);
     }
}
