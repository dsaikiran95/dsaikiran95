/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int r = 6;
	    int i=(r-1);
	    while(i>=0)
	    {
	        int alphabets=65;
	        int j=0;
	        while(j<=i)
	        {
	            System.out.print((char)(alphabets+j)+ " ");
	            j++;
	        }
	        System.out.println();
	        i--;
	    }
	    i=1;
	    while(i<r)
	    {
	        int alphabets=65;
	        int j=0;
	        while(j<=i)
	        {
	           System.out.print((char)(alphabets+j)+ " ");
	           j++;
	        }
	        System.out.println();
	        i++;
	    }
	    
		
		
	
		
	}
}
