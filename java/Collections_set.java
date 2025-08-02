import java.util.*;

public class Collections_set {
    public static void main(String[] args) {
        Set<Integer> se=new HashSet<>();
        for (int i = 0; i < 10; i++) {
            se.add(10);
        }
        se.add(20);

        // for(int n:se){
        //     System.out.println(n);
        // }

        Iterator<Integer> val=se.iterator(); // create a object for the iterator function

        while(val.hasNext()) // hasNext is check if the next value is present are not....

            System.out.println(val.next());  //next() is used to get the values of the set


}
}