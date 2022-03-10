import java.util.Scanner;
class MinimumElement
{
    public static void main(String[] args)
    {
        //Declare the variables
        int size,i,minimum,position=0;
        int[] min_arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of The Array: ");
        size=sc.nextInt();
        System.out.println("Enter The Array Elememts: ");
        for(i=0;i<size;i++)
        {
            min_arr[i] = sc.nextInt();
        }
        minimum=min_arr[0];
        for(i=1;i<size;i++)
        {
            if(minimum>min_arr[i])
            {
                minimum=min_arr[i];
                position=i;
            }
        }
        System.out.format("minimum element in tha array: "+ minimum);
    }
}