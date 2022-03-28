/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class RighAnglePattern
{
    public static void main(String[] args)
    {
        int r = 5; //Rows is equal to 5
        
        for(int i=1;i<=r;i++)
        {
            for(int j=i; j>=1; j--) //St means no. of stars
            {
                System.out.print(j +" ");
            }
            System.out.println();
            
        }
    }
}
