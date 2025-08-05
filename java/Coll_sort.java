import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Coll_sort {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(21);
        arr.add(67);
        arr.add(45);
        arr.add(84);
        arr.add(19);

// for a normal sort

    /*

        Collections.sort(arr);
        for(int a:arr){
            System.out.println(a);
        }

    */



// sort based on user conditions (sort based on last number of each integer)

        // START---------->
    /*
        Comparator <Integer> order=new Comparator <Integer>() {

            @Override
            public int compare (Integer a,Integer b){  // compare is buy default for user logic
                if(a%10 < b%10)
                    return 1;                  // swap the number if 1
                else
                    return -1; // doessnt swap the number if -1
            }
        };
    */

        Comparator <Integer> order=(a,b)-> { return a%10 > b%10 ? 1 : -1; };  // using a lambda expression

        Collections.sort(arr,order);
        for(int n:arr){
            System.out.println(n);
        }

        //END <---------------
    }
}
