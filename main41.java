
    
import java.util.Scanner;
class Operations
{
    int a,b;
    Scanner sc = new Scanner(System.in);
    public void Addition()
    {
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("the addition of two numbers is : "+sum);
    }
     public void substraction()
    {
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        int sub=a-b;
        System.out.println("the substraction of two numbers is : "+sub);
    }
     public void multiplication()
    {
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        int mul=a*b;
        System.out.println("the multiplication of two numbers is : "+mul);
    }
     public void divison()
    {
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        int div=a/b;
        System.out.println("the division of two numbers is : "+div);
    }
    public void View()
    {
        System.out.println("Enter 1  to addition");
        System.out.println("Enter 2 to substraction");
        System.out.println("Enter 3 to multiplication");
        System.out.println("Enter 4 to division");
        System.out.println("Enter 5 to close");


        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                Addition();
                View();
                break;
            case 2:
                substraction();
                View();
                break;
            case 3:
                
                multiplication();
                View();
                break;
    
            case 4:
                try{
                divison();
                View();
                }
                catch(Exception e ){
                     System.out.println(e);
                }
                finally{
                    View();
                }
                break;
                case 5:
                    System.out.println(" completed ");
                    break;
                    
            default:
                System.out.println("enter correct value");
                View();
                break;
        }
    }
    
}
class main41
{
public static void main(String args[])
{
    Operations obj =new Operations();
    obj.View();
}
}




      
      
   
