package scratch_ja;

class A{
        public void man(){
            System.out.println("class A man");
        }
    }

class B extends A{
        public void man(){
            System.out.println("class B man");
        }
}

class C extends A{
    public void man(){
        System.out.println("class C man");
    }
}
public class Dynamic_method_dispatch {
    
    public static void main(String[] args) {
        A ca =new B();
        ca.man();
        ca=new C();
        ca.man();
        ca=new A();
        ca.man();


    }
    
}
