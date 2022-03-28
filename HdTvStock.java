/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/
import java.io.*;
import java.util.*;
public class HdTvStock  {
    //main method
    public static void main(String[] args) {
        //creating an object
        ArrayList<HdTv> tv = new ArrayList<HdTv>();
        //add elements to ArrayList
        tv.add(new HdTv("MI",26));
        tv.add(new HdTv("Samsung",28));
        tv.add(new HdTv("LG",27));
        tv.add(new HdTv("Sony",20));
        //print values on sorted order based on size value
        System.out.println("Unsorted");
        //using for loop
        for (int i=0;i<tv.size();i++) 
        System.out.println(tv.get(i));
        //use collections.sort and pass Brandname Comparator as parameters
        Collections.sort(tv,new SortbySize());
        //print result
        System.out.println("\nSorted by Size");
        for (int i=0;i<tv.size();i++) 
        System.out.println(tv.get(i));
    }
}
class HdTv {
    String Brandname;
    int Size;
    //Constructor
    public HdTv (String Brandname, int Size) {
        this.Brandname = Brandname;
        this.Size = Size;
    }
    //print details in main() 
    public String toString() {
        return this.Brandname+" "+this.Size;
    }
}
//create BrandnameComparator it implements Comparator and in that create a Compare method and pass two parameters for Comparing Sizes
class SortbySize implements Comparator<HdTv> {
    //acces HdTv class objects
    public int compare(HdTv Sony, HdTv MI) {
        //compare sizes and return size
        return Sony.Size - MI.Size;
    }
}