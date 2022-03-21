class One
{
    //super Class var
    int i=10;
    //super class method
    void show()
    {
        System.out.println("Super class method:i=" +i);
    }
}
class Two extends One
{
    //Super class var
    int i=20;
    //sub class method
    void show()
    {
        System.out.println("Sub class method:i=" +i);
        //using super to call super class method
        super.show();
        
        //using super to acess super class var
        System.out.println("super i="+ super.i);
    }
}
class main26
{
    public static void main(String args[])
    {
        //create sub class object
        Two t = new Two();
        //this will call sub class method only
        t.show();
        
    }
}
