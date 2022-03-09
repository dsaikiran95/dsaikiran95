import java.util.Scanner;
class Factors
{
    public static void main(String[] args)
    {
        //Variables
        int num,i;
        //Scanner to read data 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i+" ");
            }
        }
           
    }
}