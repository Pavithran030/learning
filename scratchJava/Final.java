package scratchJava;

public class Final {
    public static void main(String[] args) {
        // final int a=20;
        int a=20;
        System.out.println(a);
        int b=0;
        a=b; // due to final keyword
        System.out.println(b);
    }
}
