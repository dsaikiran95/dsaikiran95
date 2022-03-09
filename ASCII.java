import java.util.Scanner;
class ASCII
{
    public static void main(String[] args)
    {
        //Varaibles 
        char ch;
        //Scanner for read data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ch:");
        ch=sc.next().charAt(0);
        int asciiValue = ch;  
        System.out.println("ASCII value of " +ch+ " is: "+asciiValue);  
    }
}