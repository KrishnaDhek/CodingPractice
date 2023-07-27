public class IsArrayUnique {
    public static boolean IsArrayUnique(int[] nums){
        int ans =0;

        for(int i=0; i<nums.length; i++){
            ans ^=nums[i];
            if(ans!=0)
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
       System.out.println(IsArrayUnique(nums));
    }
    
}
