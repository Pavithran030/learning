public class Max_Substring {
    public static void main(String[] args) {
        int[] nums={1,2,-6,3,10,0};
        System.out.println(maxproduct(nums));
    }

    public static int  maxproduct(int[] nums){

        int max_val=nums[0];
        int min_cur=nums[0];
        int max_cur=nums[0];
        if(nums.length==0) return 0;

        for(int i=1;i<nums.length;i++){
            int current =nums[i];
            if(current<0){
                int temp=max_cur;
                max_cur=min_cur;
                min_cur=temp;
            }
            min_cur=Math.min(current, min_cur*current);
            max_cur=Math.max(current,max_cur*current);
            max_val=Math.max(max_val,max_cur);
        }
        return max_val;
    }
}
