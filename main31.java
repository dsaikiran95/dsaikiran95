interface Shape
{
    public static final int side=1; //public static final int side=1
    abstract void draw();//abstract void draw()
}
class Circle implements Shape
{
    public void draw()
    {
    System.out.println("circle");
    }
}
class main31
{
    public static void main(String args[])
    {
      Circle c=new Circle();
      c.draw();
    }
}
