import java.util.*;

public class amstrong {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int si=0;
            int n1=n;
            int n2=n;
            int am=0;
            while(n!=0){
                n/=10;
                si++;
            }
            while(n1!=0){
                int digit=n1%10;
                int ams=1;
                for(int i=0;i<si;i++){
                    ams*=digit;
                }
                am+=ams;
                n1/=10;

            }
            if(n2==am) System.out.println(n2+" Amstrong Number ");
            else System.out.println(n2+" Not a Amstrong Number ");

        }
    }
    
}
