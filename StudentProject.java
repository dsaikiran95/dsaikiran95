import java.util.Scanner;
class StudentProject
{  
     int Rollno;  
     String Name; 
     String Branch;
     String Title;
}  
     
class TestStudent
{  
     public static void main(String args[])
     {  
     //Creating objects  
     Student s1=new Student();  
     Student s2=new Student();  
     //Initializing objects  
     s1.Rollno=101;  
     s1.Name="SAI KIRAN";  
     s1.Branch="Thermal Engineering";
     s1.Title="Battrey Thermal Failure in Electric Vehicle";
     s2.Rollno=102;  
     s2.Name="Prashanth"; 
     s2.Branch="Thermal Engineering";
     s2.Title="Additive Manufacturing and Advance Technology";
     
     //Printing data  
     System.out.println(s1.id+" "+s1.name);  
     System.out.println(s2.id+" "+s2.name);  
   }  
}  


