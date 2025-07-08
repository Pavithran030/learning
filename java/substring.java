import java.util.*;

// public class substring {
//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in)){
//             System.out.print("Enter the sentence : ");
//             String sen=sc.nextLine();
//             System.out.print("Enter the string to find the index : ");
//             String target=sc.nextLine();
//             for(int i=0;i<sen.length();i++){
//                 if(sen.charAt(i)==target.charAt(0)){
//                     System.out.print(i);
//                     break;
//                 }
//             }
//         }
//     }
// }



public class substring {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the sentence : ");
            String sen=sc.nextLine();
            System.out.print("Enter the string to find the index : ");
            String target=sc.nextLine();
            System.out.print(sen.indexOf(target));
        }
    }
}

