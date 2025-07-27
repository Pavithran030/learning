import java.util.*;

public class Collectionss {
    public static void main(String[] args) {

        List <Integer> c1 =new ArrayList <Integer>();
    //  collections             class
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        System.out.println(c1);
        for(int i=0;i<15;i++){
            c1.add(i+1);
        }
        for(int n:c1){
            System.out.println(n);
        }
        System.out.println(c1);
        //to print the index
        System.out.println("Index of 20 is : "+c1.indexOf(20));
        System.out.println("Index of 40 is : "+c1.indexOf(40));

    }
}
