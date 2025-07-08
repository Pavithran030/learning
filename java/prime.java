import java.util.*;

public class prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the nnumber to check for a prime number : ");
            int n=in.nextInt();
            int count =1;
            if(n<=1) count=0;
            else{
                for(int i=2;i<Math.sqrt(n);i++){
                    if(n%i==0){
                        count =0;
                        break;
                    }
                }
            }
            if(count==1){
                System.out.print(n+" It's a Prime Number");
            }
            else System.out.print(n+" Not a prime number");
        }
    }
}
