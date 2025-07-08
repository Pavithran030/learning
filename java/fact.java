import java.util.*;

public class fact {
    public static void main(String[] args) {
        try(Scanner in =new Scanner(System.in)){
            int n=in.nextInt();
            int fac=1;
            if(n<=1){
                System.out.println(1);
            }
            else{
                for(int i=1;i<=n;i++){
                    fac*=i;
                }
                System.out.println(fac);
            }
        }
    }
}
