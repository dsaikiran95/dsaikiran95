/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
class employee
{
    int idno;
    String name;
    String department;
    String company;
    double salary;
    String address;
    //constructor overloading
    employee(int i,String n,String d,String c,double s,String a)
    {
       idno=i;
       name=n;
       department=d;
       company=c;
       salary=s;
       address=a;
    }
       employee()
       {
       }
       employee(int i)
       {
       idno=i;
       }

       void display()
       {
       System.out.println(idno+"\n"+name+"\n"+department+"\n"+company+"\n"+salary+"\n"+address);
       }
       void reading()
       {
       System.out.println(name+" reading");
       }
       void working()
       {  
       System.out.println(name+" working");
       }

}
class Main
{
    public static void main(String args[])
{
       employee e1=new employee(39,"Sai kiran","Thermal Engineering","Cipla",25,"Mumbai");

       System.out.println("employee 1 information");
        e1.display();
        e1.reading();
        e1.working();
        
        

   }
}

