/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.Scanner;

public class InsertionSort {
    //main method
    public static void main(String[] args) {
        //Scanner is used to take input from user
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.println("Enter comma seperated integers: ");
        String s = sc.nextLine();
        String[] str = s.split(",");
        //create integer array for all elements 
        int[] arr = new int[str.length];
        //initializing a variable
        int i=0;
        //using while loop
        while(i<arr.length) {
            arr[i] = Integer.parseInt(str[i]);
            i++;
        }
        //call sorted method
        int sortedArr[] = insertionSort(arr);
        //print sorted array
        System.out.print("Sorted array is: ");
        i=0;
        //using while loop
        while(i<sortedArr.length) {
            System.out.print(sortedArr[i]+" ");
            i++;
        }
    }
    //creating sort method
    public static int[] insertionSort(int arr[]) {
        //using for loop
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            //storing current element whose left side is checked for its current position
            int j = i-1;
            //check whether the adjacent element in left side is greater or less than the current element
            while (j>=0 && arr[j]>key) {
                //move current element one position forward
                arr[j+1] = arr[j];
                j--;
            }
            //move current element to its current position
            arr[j+1] = key;
        }
        return arr;
    }
}

// Good Job done!
