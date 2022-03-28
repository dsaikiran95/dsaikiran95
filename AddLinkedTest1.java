import java.util.*;  
public class AddLinkedTest1
{  
    public static void main(String args[]){  
    LinkedList<String> al=new LinkedList<String>();  
        al.add("PRASHANTH");  
        al.add("SAIKIRAN");  
        al.add("CHANDRAMOHAN");  
        al.add("PREM");  
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }  
}  