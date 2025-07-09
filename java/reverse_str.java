
import java.util.Scanner;

public class reverse_str {

    static String rever (String st1){
        String ch="";
        int le=st1.length()-1;
        for (int i=le;i>=0;i--){
            ch=ch+st1.charAt(i);
        }
        return ch;

    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            String st=sc.nextLine();
            System.out.println(rever(st));

        }
    }
}
