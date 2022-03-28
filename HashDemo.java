/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/

import java.util.Scanner;
import java.util.HashMap;

public class HashDemo {
    //main method
    public static void main(String[] args) {
        //Scanner class is used to take input from users
        Scanner sc = new Scanner(System.in);
        boolean loopAgain = true;
        //declare the HashMap
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        do {
            //taking input from user
            System.out.print("Enter emp code: ");
            Integer key = Integer.parseInt(sc.nextLine());
            System.out.print("Enter emp name: ");
            String value = sc.nextLine();
            //add the user inputs to the HashMap
            String oldVal = hm.put(key,value);
            if(oldVal!=null) {
                System.out.println("Employee name: "+value+" is "+oldVal+" and has been overwritten by "+key);
            }
            //ask user if they want to enter another student details
            System.out.print("Enter another Employee (y/n)?");
            String Answer = sc.nextLine();
            //condition to satisfy loop again 
            if (Answer.equals("y") || Answer.equals("Y")) {
                continue;
            }
            else {
                break;
            }
        }
        while(loopAgain);
        sc.close();
        System.out.println();
        //use for each loop to grab emp code emp name 
        for (String EmpName : hm.values()) {
            System.out.println(EmpName);
        }
    }
}