public class leap {
    public static int year(int n1){
        int k=0;
        if(n1%100==0){
            if(n1%4==0){
                return n1;
            }
        }
        else if(n1%4==0) return n1;

        return k;
    }
    public static void main(String[] args) {
        int[] years={2000,2301,5500,2025,2024,2020,2023};
        for(int i=0;i<years.length;i++){
            System.out.println(year(years[i]));
        }
    }
}
