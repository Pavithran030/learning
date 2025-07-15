package scratch_ja;
class Names{
    public static void man(int... n){
        for(int b:n){
            System.out.print(b+" ");
        }
        System.out.println();
    }
}
class Unary{
    public static void uni(){
        int a=10;
        int b=20;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);
    }
}
public class Varargs {

    
    public static void main(String[] args) {
        // Names st=new Names();
        Names.man(1,2,3,4,5,6,7,8,9,0,10);
        Unary.uni();
    }
}
