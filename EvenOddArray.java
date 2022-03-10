import java.util.Scanner;
class EvenOddArray
{
    public static void main(String[] args)
    {
        //Declare the variables
        int size,i;
        int evenCount=0,oddCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of an Array: ");
        size=sc.nextInt();
        int[]a=new int[size];
        System.out.println("Enter The Array Elements: ");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(a[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Total Numbers of Odd in the Array: "+oddCount);
        System.out.println("Total Numbers of Even in the Array: "+evenCount);
    }
}