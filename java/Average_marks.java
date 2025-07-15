public class Average_marks {
    static marks(int mar[]){
        int avg=0;
        for(int i=0;i<mar.length;i++){
            avg+=mar[i];
        }
        flaot ag=avg/mar.length;
        return ag;
    }
    public static void main(String[] args) {
        int arr[]={75,90,60,82,45};
        
        System.out.println(marks(arr[]););
    }
}
