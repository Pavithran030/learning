
import java.util.ArrayList;

public class primes {

    public static int isprime(int arr1){
        int co=1;
        if(arr1<=1) {co=0;}
        else{
            for(int j=2;j<=Math.sqrt(arr1);j++){
                if(arr1%j==0){
                    co=0;
                    break;
                }
            }
        }
        return co;
    }
    public static void main(String[] args) {

    int arr[]={1,7,11,23,5};
    ArrayList <Integer> fin = new ArrayList<>();
    int si=arr.length;
    for(int i=0;i<si;i++){
        if (isprime(arr[i])==1) {
            fin.add(arr[i]);
        }
    }
    System.out.println(fin+"  These are prime numbers from the given array");

    }
}
