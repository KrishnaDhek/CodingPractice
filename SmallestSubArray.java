public class SmallestSubArray {
    public static int SmallestSubArray(int[] nums, int S){

        int sum =0;
        int min = Integer.MAX_VALUE;
        int start =0;

        for(int i =0; i<nums.length; i++){
            sum +=nums[i];

            while(sum>=S){
                min = Math.min(min,i-start+1);
                sum -=nums[start];
                start++;
            
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;

        }
        else
        return min;

    }
    public static void main(String[] args) {
        int[] nums ={3, 4, 1, 1, 6};
        int S = 8;
        System.out.println(SmallestSubArray(nums, S));
    }
    
}
