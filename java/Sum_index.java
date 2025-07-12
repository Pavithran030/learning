public class Sum_index {

    public static void main(String[] args) {
        int [] su={1,6,9,890,3,5,10,300,658};
        int max=su[0];
        int pos=0;
        for(int i=0;i<su.length;i++){
            if(su[i]>max){
                max=su[i];
                pos=i+1;
            }
        }
        System.out.println("The Index of the Largest Number is : "+max+" and Position in the Array : "+pos);
    }
}
