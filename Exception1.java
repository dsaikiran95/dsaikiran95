import java.util.*;
public class Exception1
{
   public static void main(String[] args) {
   String s="lalitha";
   System.out.println(s.length());
   try {
      System.out.println(s.charAt(8));
   }
      catch(StringIndexOutOfBoundsException e)
   {
      System.out.println(e);
   }
      System.out.println("Hello World");
   }
}   