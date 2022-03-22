class TryCatchException3 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
  
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Bham Akhanda");  
    }  
      
}  