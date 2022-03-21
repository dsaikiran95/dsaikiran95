
class Dog
{
    
    String name;
    String color;
    String breed;
    String eyecolor;
    
    void barking()
    {
    System.out.println(name+" barking");
    }
    void eating()
    {
    System.out.println(name+" eating");
    }

}
class main3
{
    public static void main(String args[])
{
    Dog dg1=new Dog();
    dg1.name="Tiger";
    dg1.color="Black";
    dg1.breed="German Shepherd";
    dg1.eyecolor="Brown";
    
    
    
    System.out.println("Dog 1 informatio");
    System.out.println(dg1.name+dg1.color+dg1.breed+dg1.eyecolor);
    dg1.barking();
    dg1.eating();
    
    Dog dg2=new Dog();
    dg2.name="Puppy";
    dg2.color="White";
    dg2.breed="siberian";
    dg2.eyecolor="Blue";
    
    
    System.out.println("Dog 2 informatio");
    System.out.println(dg2.name+dg2.color+dg2.breed+dg2.eyecolor);
    dg2.barking();
    dg2.eating();

   }
}
