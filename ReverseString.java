/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class ReverseString
{
    public static void main(String[] args) {
    String name=new String();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter student details");
    name=sc.nextLine();
    String rev="";
        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
            System.out.println(rev);
    }


}
