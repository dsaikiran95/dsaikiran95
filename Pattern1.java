/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Pattern1
{
	public static void main(String[] args) {
	    int r = 10;
		for(int i=0;i<r;i++)
		{
		    for(int j=2*(r-i);j>=0;j--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j+ " ");
		    }
		    System.out.println();
		}
	}
}
