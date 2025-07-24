
class A implements Runnable{
    @Override

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("this is first runnbale....");
        }

    }
}


class B implements Runnable{
    @Override

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("this is 2nd  runnbale");
        }

    }
}

public class Thread_Runnable {
    public static void main(String[] args) {
        /*

        A t1=new A();   // normal object creation
        B t2=new B();   // normal object creation

        */

        // for runnnable

        Runnable a  =new A();
        Runnable b =new B();

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

    }
}
