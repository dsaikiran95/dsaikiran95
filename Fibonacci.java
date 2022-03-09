import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        //Declare the variables
        int first=0,second=1,next,i,number;
        System.out.print("Enter the number of terms: ");
        Scanner s1 = new Scanner(System.in);
        number=s1.nextInt();
        for(i=0;i<number;i++)
        {
            if(i<=1)
            {
                next=i;
            }
            else
            {
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(" "+next);
        }
        
        
        
    }
}