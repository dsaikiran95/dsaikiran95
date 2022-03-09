import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        int rev=0,n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
           int r =n%10;
           rev=rev*10+r;
           n=n/10;
        }
        if(temp==rev)
        {
        System.out.println(temp+" It is a Palindrome ");
        }
        else
        {
        System.out.println(temp+" It is not a Palindrome ");
        }
    }
}
