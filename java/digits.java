public class digits {
    public static void main(String[] args) {
        int n=25;
        int co=0;
        while(n!=0){
            // int digit=n%10;
            co+=n%10;
            n/=10;
        }
        System.out.println(co);
    }
    
}
