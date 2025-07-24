
// class A implements Runnable{
//     @Override

//     public void run(); {
//             for (int i = 0; i < 10; i++) {
//                 System.out.println("this is first runnbale....");
//         }
// }
// }


// class B implements Runnable{
//     @Override

//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             System.out.println("this is 2nd  runnbale");
//         }

//     }
// }

public class Lambda_Thread {
    public static void main(String[] args) {
        Runnable a  =() ->{
        for (int i = 0; i < 10; i++) {
            System.out.println("this is first runnbale....");
        }};
        Runnable b =() -> {
            for (int i = 0; i < 10; i++) {
            System.out.println("this is 2nd  runnbale");
        }
        };

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

    }
}
