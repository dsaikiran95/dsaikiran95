import java.util.*;
class VectorLinked
{
    public static void main(String[] args)
    {
        Vector<Integer> v =new Vector();
        v.add(101);
        v.add(102);
        v.add(103);
        v.add(104);
        v.add(105);
        v.remove(1);
        System.out.println(v.indexOf(103));
        System.out.println(v);
    }
}