package Array;

import java.util.HashMap;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static int CountKDifference(int[] nums, int k){
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        for(int i :nums){
            if(map.containsKey(i-k)){
                    count +=map.get(Math.abs(i-k));
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k =1;
       int result = CountKDifference(nums, k);
       System.out.println(result);
    }
    
}
