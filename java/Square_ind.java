
import java.util.Scanner;

public class Square_ind{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sqdnumber=sc.nextInt();
        int sqdNumber_result=0;
        while(sqdnumber!=0){
            int digi=sqdnumber%10;
            sqdNumber_result+=(digi*digi);
            sqdnumber/=10;
        }
        System.out.println(sqdNumber_result);
        sc.close();
    }
}