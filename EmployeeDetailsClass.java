
import java.util.*;
class EmployeeDetails
{
    int eid;
    String ename;
    String edept;
    int esal;
    String eaddr;
    void totalSal()
    {
        int grosssal,HRA,DA;
        if (esal>=10000 && esal<=20000)
        {
            HRA=(esal*20)/100;
            DA=(esal*45)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else if (esal>20000 && esal<=40000)
        {
            HRA=(esal*25)/100;
            DA=(esal*20)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else 
        {
            HRA=(esal*30)/100;
            DA=(esal*30)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
    }
}

class main
{
    public static void main(String[] args)
    {
        EmployeeDetails emp1= new EmployeeDetails();
        emp1.eid=123;
        emp1.ename="Priyanka";
        emp1.edept="TECHNICAl";
        emp1.eaddr="VIJ";
        emp1.esal=18000;
        System.out.println("Datails of EMP 1");
        System.out.println(emp1.eid+" "+emp1.ename+" "+emp1.edept+" "+emp1.eaddr+" "+emp1.esal);
        emp1.totalSal();
        
        EmployeeDetails emp2= new EmployeeDetails();
        emp2.eid=456;
        emp2.ename="Sankeerth";
        emp2.edept="FRONTEND";
        emp2.eaddr="VIJ";
        emp2.esal=65000;
        System.out.println("Details of EMP 2");
        System.out.println(emp2.eid+" "+emp2.ename+" "+emp2.edept+" "+emp2.eaddr+" "+emp2.esal);
        emp2.totalSal();
    }
}
