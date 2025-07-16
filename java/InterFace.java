
interface A{
    int a=10;          // static and final....
    void car();        // interface is default by "" public abstract ""
    void bus();

}

interface C{
    void trian();
}


// Multiple interface....

class B implements A,C{
    @Override

    public void car(){
        System.out.println("now i am using the car method...");
    }

    @Override

    public void bus(){
        System.out.println("now i am using the bus method from interface...");
    }

    @Override
    public void trian(){
        System.out.println("now i am accessing the train methods");
    }
}

// Single interface

// class B implements A{

//     @Override

//     public void car(){
//         System.out.println("now i am using the car method...");
//     }

//     @Override

//     public void bus(){
//         System.out.println("now i am using the bus method from interface...");
//     }
// }

public class InterFace {
    public static void main(String[] args) {
        A n1=new B();
        n1.car();
        n1.bus();
        System.out.println(A.a);
    }
}
