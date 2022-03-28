/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class LeftTrianglePattern
{
	public static void main(String[] args) {
	    int r = 6;
		for(int i=0;i<r;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int x=1;x<r-i;x++)
		    {
		        System.out.print(x+ " ");
		    }
		    System.out.println();
		}
		
	
		
	}
}
