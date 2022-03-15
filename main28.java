class Rectangle
{
    //declare the variables
    
    int length;
    int breadth;
    //constructor overloading
    Rectangle(int l,int b)
    {
        this.length=length;
        this.breadth=breadth;
        //method for area & perimeter
    }
    void Area()
    {
        System.out.println(breadth * length);
    }
    void Perimeter()
    {
        System.out.println(2 * (breadth + length));
    }
    
    
}
class square extends Rectangle
{
    square(int s)
    {
        super(s, s);
    }
}  
class Main 
{
    public static void main(String[] args) 
    {
        Rectangle re = new Rectangle(10,20);
        square sq = new square(20);
        re.Area();
        re.Perimeter();
        sq.Area();
        sq.Perimeter();
        
        
        
        
    }
}