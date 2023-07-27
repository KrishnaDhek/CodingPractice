package Array;
public class RemoveElement {
    public static int RemoveElement(int[] nums, int val){
        int i=0;
        for(int j =0; j<nums.length; j++){
            if(nums[j]!=val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] =temp;
                i++;
            }
        }
        return i;

    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val =2;
        System.out.println(RemoveElement(nums, val));
    }
    
}
