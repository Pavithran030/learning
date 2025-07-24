import java.util.Scanner;

public class Lucky {
    public static void main(String [] a){
        try(Scanner sc = new Scanner(System.in);){
        // StringBuilder st=new StringBuilder();
        String st=sc.nextLine();
        int sum=0;
        for (int i=6;i<10;i++) {
            int ch=st.charAt(i)-'0';
            sum+=ch;
        }
        System.out.println(sum);
        if((sum%10==5) || (sum%10==7)) System.out.println("Lucky");
        else System.out.println("Unlucky.....");
        sc.close();
    }
    }
}
