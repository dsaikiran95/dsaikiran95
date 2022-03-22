class ThrowException
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new StringIndexOutOfBoundsException("not eligible for vote");
        }
        else
        {
            System.out.println("Eligile for vote");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            validate(15);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            
        }
    }
}
