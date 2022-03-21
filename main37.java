final class Student
{
    final int rollno=123;
    void display()
    {
        System.out.println("display");
    }
}
class main37
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.rollno=345;
        s.display();
        System.out.println(s.rollno);
    }
}