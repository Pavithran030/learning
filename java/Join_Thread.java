class A{
    int count=0;
    public synchronized void car(){
        count++;
    }
}

public class Join_Thread {
    public static void main(String[] args) throws InterruptedException{   // InterruptedException this is the exception for threads....
        A a1=new A();
        Runnable a =()->
        {
        for (int i = 0; i < 10; i++) {
            a1.car();
            System.out.println("this is first runnbale....");
        }
        };
        Runnable b =()->
        {
        for (int i = 0; i < 10; i++) {
            a1.car();
            System.out.println("this is second runnbale");
        }
        };

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }
}
