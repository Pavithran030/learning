import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the string to check for the palindrome. : ");
            String st= in.nextLine();
            int size=st.length()-1;
            String ch="";
            for(int i=size;i>=0;i--){
                ch=ch+st.charAt(i);
            }
        if(st.equals(ch)) System.out.println("Its is a palindrome...");
        else System.out.println("Not a palindrome...");

        } catch (Exception e) {
        }
    }
}
