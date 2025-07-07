class x_pattern{
    public static void main(String [] args){
        System.err.println("Happy day.......");
        int n=5;
        int n1=n;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    // printf("%d",i+1);
                    if(i==j)
                        System.err.print(i+1);
                    else if(i+j==n-1){
                        System.err.print(n1);
                    }
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
            n1--;
        }
    }
}