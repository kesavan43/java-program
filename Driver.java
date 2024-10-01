interface bank{
   public void calculateInterest();
}
class SBI implements bank{
    double r,amt,interest;
    public void calculateInterest()
    {
        r=0.07;
        amt=20000;
        interest=amt*r;
        System.out.println("interest="+interest);
    }
}
class Axis implements bank{
    double r,amt,interest;
    public void calculateInterest()
    {
        r=0.12;amt=10000;
        interest=amt*r;
        System.out.println("Interest="+interest);
    }
}
class Driver{
    public static void main(String[] args)
    {
        SBI sbi=new SBI();
        sbi.calculateInterest();
        Axis a=new Axis();
        a.calculateInterest();
    }
}