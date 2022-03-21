interface animal{
    public static final int side=1;
    abstract void eat();
}
class dog implements animal{
    public void eat()
    {
        System.out.println(" dog is eating");
    }
}
class cat implements animal{
    public void eat()
    {
        System.out.println("cat is eating");
    }
}
class main32{
    public static void main(String[]args)
    {
        cat c=new cat();
        c.eat();
        dog d=new dog();
        d.eat();
    }
}
