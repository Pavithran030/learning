import java.util.*;

public class fibonnaci {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
        int n=in.nextInt();
        int a=0;
        int b=1;
        int fib;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            fib=a+b;
            a=b;
            b=fib;
        }
    }
    }
}
