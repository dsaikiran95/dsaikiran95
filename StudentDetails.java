import java.util.Scanner;
class StudentDetails 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name,address,branch;
        char section;
        long phone;
        int rollno;
        System.out.println("Enter the Rollno: ");
        rollno=sc.nextInt();
        System.out.println("Enter the name: ");
        name=sc.next();
        System.out.println("Enter the section: ");
        section=sc.next().charAt(0);
        System.out.println("Enter the branch: ");
        branch=sc.next();
        System.out.println("Enter the phone: ");
        phone=sc.nextLong();
        System.out.println("Enter the address: ");
        address=sc.next();
        System.out.println("name="+name+"\nrollno"+rollno+"\naddress"+address+"\nbranch"+branch+"\nsection"+section+"\nphone"+phone);
    }
}