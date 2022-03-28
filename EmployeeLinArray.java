/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Java code to demonstrate the concept of
// array of ArrayList


import java.util.*;
class EmployeeLinArray
{
    int id;
    String name;
    String department;
    int salary;
    Employee (int i,String n,String d,int sy)
    {
    id =i;
    name=n;
    department=d;
    salary=sy;
    }
}
class Main
{
    public static void main(String args[])
    {
        ArrayList<Employee> emp=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        String department;
        int salary;
        for( int i=0;i<2;i++)
        {
            System.out.println("Enter id no");
            id=sc.nextInt();
            System.out.println("enter name");
            name=sc.next();
            System.out.println("enter department");
            department=sc.next();
            System.out.println("enter salary");
            salary=sc.nextInt();
            
            emp.add(new Employee(id,name,department,salary));
        }
            for(Employee st:emp)
            {
                System.out.println(st.name+" "+st.department+" "+st.id+" "+st.salary);
            }
    }
}
//remove()
//removeAll()
//clear()
//contains()
//addAll()
//lastIndexOf()

