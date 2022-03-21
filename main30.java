abstract class Bank{
    public abstract int getRateOfInterest();
}
class PNB extends Bank{
    public int getRateOfInterest(){
        return 8;
    }
}
 class SBI extends Bank{
    public int getRateOfInterest(){
        return 7;
  }
}
class Axis extends Bank{
    public int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    public int getRateOfInterest(){
        return 9;
    }
}
class main30{
    public static void main (String[] args) {
    Bank s=new SBI();
    Bank p=new PNB();
    Bank a=new Axis();
    Bank i=new ICICI();
    System.out.println("Rate of Interest in SBI is: "+s.getRateOfInterest()+" %");
    System.out.println("Rate of Interest in PNB is: "+p.getRateOfInterest()+" %");
    System.out.println("Rate of Interest in Axis is: "+s.getRateOfInterest()+" %");
    System.out.println("Rate of Interest in ICICI is: "+s.getRateOfInterest()+" %");


  }
}