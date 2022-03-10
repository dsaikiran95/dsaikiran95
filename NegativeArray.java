import java.util.Scanner;
class NegativeArray 
{
    public static void main(String[] args)
    {
        //Declare the variables
        int size, i, count = 0;
		int[] count_NegArr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Size of an Array: ");
		size = sc.nextInt();
		
		System.out.format("Enter The Array element: ", size);
		for(i = 0; i < size; i++) 
		{
			count_NegArr[i] = sc.nextInt();
		}
	
		for(i = 0; i < size; i++) 
		{
			if(count_NegArr[i] < 0) {
				count++;
			}
		}
		System.out.println( " Number of Negative Number In The Array = " + count);
    }
}