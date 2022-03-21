
import java.util.*;
class Employee
{
     private int employe_id;
     private String name;
     private String department;
     void setemploye_id(int employe_id)//set the values for private datamembers
    {
        this.employe_id=employe_id;
    }
     void setName(String name)
    {
        this.name=name;
    }
     void setSection(String department)
    {
        this.department=department;
    }
    //to get the private variables
    int getemploye_id()
    {
        return this.employe_id;
    }
        String getName()
    {
        return this.name;
    }
        String getdepartment()
    {   
        return this.department;
    }
}

class main35
{
    public static void main(String args[])
    {
        Employee em=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a employe_id");
        int e=sc.nextInt();
        em.setemploye_id(e);
        System.out.println("enter name");
        String n=sc.next();
        em.setName(n);
        System.out.println("enter department");
        String d1=sc.next();
        em.setSection(d1);
        System.out.println(em.getemploye_id());
        System.out.println(em.getName());
        System.out.println(em.getdepartment());
    }
}

