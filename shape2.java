class shape
{
   void shape()
  {
    System.out.println("This is shape");
  }
}
// Rectangle class is subclass of Shape class
class rectangle extends shape
{
   void rectangle()
  {
    System.out.println("This is rectangular shape");
  }
}
class circle extends shape
{
  void circle()
  {
      System.out.println("This is circle shape");
  }
}
class square extends rectangle
{
    void square()
    {
        System.out.print(" square is rectangle shape");
    }
}
class main29
{
    public static void main(String[] args)
    {
        //creating pbject 
        square s = new square();
        circle c = new circle();
        s.shape();
        s.rectangle();
        c.shape();
        
        
        
    }
}
