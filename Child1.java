public class Childl implements I3{
    String type;
    public Childl () {
        type="Auto"; }
    void display() {
        System.out.println("Brand="+Brand);
        System.out.println("Model="+model);
        System.out.println("type="+type);
        System.out.println("availabilty="+availabilty); }
    public void methodl () {
        System.out.println("Abstract method is defined in child class");
    public void method2 () {
        System.out.println("Interface2 method2".); }
    public static void main(String[] args) {
        Child1 c=new Childl();
        c.display(); 
        c.method1();
        c.method2(); 
    } 
        
    }