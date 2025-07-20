
@FunctionalInterface
interface A{
    public int  car(int i,int j);
}

// Normal interface

// class B implements A{
//     @Override
//     public void car(){
//         System.out.println("Functional interface.....");
//     }
// }

public class Functional_Interface {
    public static void main(String[] args) {

    // Normal object...

        // A t1=new B();

    // Anonymus inner class

        // A t1= new A (){
        //     @Override
        //     public void car(){
        //         System.out.println("Functional interface.....");
        //     }
        // } ;


        A t1= (i,j) -> i+j;  // when pass the 2 values their is no need for datatype and also return type coz when pass 2 val it is default return...

        //System.out.println("Functional interface....."+ i);  // functional interface....

        int re = t1.car(2,3);

        System.out.println(re);
        }
    }