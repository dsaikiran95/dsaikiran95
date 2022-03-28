/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList  {  

 //Take an arraylist as a parameter and returns a reversed arraylist 
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> al){
        //Arraylist for storing reversed elements
        ArrayList<Integer> al1=new ArrayList<Integer>();
        //Append the elements in reverse order 
        for(int i=al.size()-1;i>=0;i--){
            al1.add(al.get(i));
        }
        //Return the reversed arraylist
        return al1;
    }
    //Iterate through all the elements and print
    public void printElement(ArrayList<Integer> al1){
        Iterator itt=al1.iterator();
        System.out.print("Elements after reversing:");
        while(itt.hasNext()){
            System.out.print(itt.next()+" ");
        }
    }
    //main method
    public static void main(String[] d){
        //creat an object of ReverseArrayList class 
        ReverseArrayList obj=new ReverseArrayList();
        //take input from user
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter how many numbers you want:");
        int size=sn.nextInt();
        //creat an object of ArrayList class
        ArrayList<Integer> al=new ArrayList<Integer>(size);
        for(int i=0;i<size;i++){
               System.out.println("Enter Number "+i);
               al.add(sn.nextInt());
          }
        //call reverseArrayList method
        ArrayList<Integer> al1=obj.reverseArrayList(al);
        //call printElement method
        obj.printElement(al1);
        
    }
}
