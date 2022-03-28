/*  JFM1T11_Assignment5 :

    Write a program to sort an array containing negative, non-negative and zero values in descending order.
    Prompt the user input from the terminal.
    
    Sample Input: 2,-3,-1,4,-2
    
    Expected Output: -3,-2,-1,4,2
    
*/

import java.util.Scanner;

public class RearrangePositiveNegative {

    //main method
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        //take input from user
        System.out.print("Enter  input values for an array which can include negative numbers:");
        String s=sn.nextLine();
        String[] str=s.split(",");
        int arr[]=new int[str.length];
        int i=0;
        while(i<arr.length){
            arr[i]=Integer.parseInt(str[i]);
            i++;
        }
        //call descending method
        arr=descending(arr);
        //print result
        i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
}
//create descending method
static int[] descending(int arr[]){
    //declare and initialize variables
    for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    for(int i=0;i<arr.length-1;i++){
        
        //check each element if the element is less then zero and the both numbers are not equal  then it swaps them
        for(int j=0;j<arr.length-1;j++){
             //increasing elements untill all elements rearranged
             if(arr[j]>0){
                 if(arr[j]<arr[j+1]){
                    arr[j+1]=arr[j]+arr[j+1];
                    arr[j]=arr[j+1]-arr[j];
                    arr[j+1]=arr[j+1]-arr[j];
                 }
             }
        }
    }
    return arr;
}

}

// Good Job done!
