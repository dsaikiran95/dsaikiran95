/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.*;
import java.util.ArrayList; 

class SearchingElement {
    //main method
    public static void main(String[] args) {
        //Scanner is used to take input from users
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.println("Enter how many elements you want: ");
        int n = sc.nextInt();
        //create an object of LinkedHashSet calss
        LinkedHashSet<String> set = new LinkedHashSet();
        System.out.println("Enter Elements: ");
        String E[] = new String[n];
        //using for loop
        for(int i=0;i<n;i++) {
            E[i] = sc.next();
            set.add(E[i]);
        }
        //using for loop to search the elements
        for(int j=1;j<=n;j++) {
            System.out.println("Enter Search elements: "+j);
            String s1 = sc.next();
            //check if the search element is present on the list using contains method
            if(set.contains(s1)) {
                System.out.println(s1+"element is present");
            }
            else {
                System.out.println(s1+"element is not present");
            }
        }
    }
}
