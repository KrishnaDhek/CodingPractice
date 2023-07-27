package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {
    public static List<Integer>FindTargetIndices(int[] nums, int target){
       
        List<Integer> list = new ArrayList<>();
        int start =0;
        int end =0;
        for(int i:nums){
            if(i<target){
                start++;
            }
            else if(i>target){
                end++;
            }
        }

        for(int i = start ; i<=nums.length-end-1;i++){
            list.add(i);
        }
        return list;



    }
    public static void main(String[] args) {
        int[] arr = {8,9,4,3,8,4,2,4,2,4,1};
        int target =4;
        List<Integer> list = FindTargetIndices(arr, 4);
        
        System.out.println(list);
    }
    
}
