import java.util.HashMap;

public class TwoSum {
    public static int[]TwoSum(int[] nums, int target){
        int indices[] =new int[2];

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0 ; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                indices[0]= i;

                indices[1] =map.get(nums[i]);
            }

            else{
                map.put(target-nums[i],i );
            }
        }
        return indices;

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        for(int ans: TwoSum(nums, target)){
            System.out.print(ans + " ");
        }
    }
    
}
