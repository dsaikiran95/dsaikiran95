/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  

public class SortArrayList  {  
    //main method
    public static void main(String[] args) {
        //declaring variables
        int i;
        //Scanner is used to take input from users
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.println("Enter how many numbers you want: ");
        int n = sc.nextInt();
        //create an object of ArrayList class
        ArrayList<Integer> list1 = new ArrayList<>();
        //using for loop
        for (i=0;i<n;i++) {
            System.out.println("Enter number"+i);
            int num = sc.nextInt();
            list1.add(num);
        }
        //sort ArrayList in ascending order
        Collections.sort(list1);
        //print ArrayList
        System.out.println("ArrayList Sorting:");
        for(int sorted:list1) {
            System.out.println(sorted);
        }
    }
}
