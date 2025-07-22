
class A{
    public void print1(){
        System.out.println("Displaying the Output...");
    }

    class B{

        public void bm(){
            System.out.println("Class BM");
        }
    }
}

public class Inner{
    public static void main(String[] args) {
        A n1=new A();
        n1.print1();

        // A.B n2= new A.B();  // it will works when we declare the class as a static....     static class B

        A.B n2=n1.new B();
        n2.bm();

    }
}
