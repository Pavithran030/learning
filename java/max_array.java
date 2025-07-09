public class max_array {
    public static void main(String[] args) {
        int arr[]={1,3,9,6,4,8};
        int maxi=arr[0];
        for(int i=0;i<arr.length-1;i++){
                if(maxi<arr[i]){
                    maxi=arr[i];
                }
        }
        System.out.println(maxi);
    }
}
