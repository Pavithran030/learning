
import java.util.Arrays;

public class Negative_temp {
    public static void main(String[] args) {
        int temp[]={32,56,78,-23,89,90,50,-43,65};
        System.out.println(Arrays.toString(temp));
        // System.out.println(temp);
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]<0){
                temp[i]=0;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
