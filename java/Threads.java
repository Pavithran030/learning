class A extends Thread{
    @Override
    public void run(){         // run method for the thread
        for (int i = 0; i < 10; i++) {
            System.out.println("This is first Thread.....");
            try {
                Thread.sleep(8);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the second Thread");
            try {
                Thread.sleep(8);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();

        ob1.start();  //to call the thread function [ run() ]

        ob1.setPriority(Thread.NORM_PRIORITY);  // set priority for the thread..

        ob2.start();
    }
}
