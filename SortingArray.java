import java.util.Scanner;
class SortingArray
{
    public static void main(String[] args) 
    {
    	int size, temp;
    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        size = scan.nextInt();
    
        int num[] = new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i = 0; i < size; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < size - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[size - 1]);
    }
}


