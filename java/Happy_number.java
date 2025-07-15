
import java.util.Scanner;

public class Happy_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ha=sc.nextInt();
        int sum=0;
        int count=0;
        while(sum!=1 && (count<=10)){
            sum=0;
            while(ha !=0){
                int digi=ha%10;
                sum+=(digi*digi);
                ha/=10;
            }
            count++;
            ha=sum;
        }
        System.out.println(count);
        if(sum==1) System.out.println("Happy Number");
        else System.out.println("Not a Happy Number");
        sc.close();
    }

}
