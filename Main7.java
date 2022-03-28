/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Java code to demonstrate the concept of
// array of ArrayList


import java.util.*;
class Main7
{
    public static void main(String[] args){
        ArrayList<String> fruit=new ArrayList();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("mango");
        for(String f:fruit){
            if(f.equals("mango")){
                System.out.print("Mango is there in given Fruits list");
            }
        }
    }
}
