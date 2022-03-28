/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Java code to demonstrate the concept of
// array of ArrayList


import java.util.*;
class Student
{
    int rollno;
    String name;
    String sec;
    Student (int r,String n,String s)
    {
    rollno=r;
    name=n;
    sec=s;
    }
}
class Main
{
    public static void main(String args[])
    {
        ArrayList<Student> stu=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int rollno;
        String name;
        String sec;
        for( int i=0;i<2;i++)
        {
            System.out.println("Enter rollno");
            rollno=sc.nextInt();
            System.out.println("enter name");
            name=sc.next();
            System.out.println("enter section");
            sec=sc.next();
            stu.add(new Student(rollno,name,sec));
        }
            for(Student st:stu)
            {
                System.out.println(st.name+st.sec+st.rollno);
            }
    }
}
//remove()
//removeAll()
//clear()
//contains()
//addAll()
//lastIndexOf()

