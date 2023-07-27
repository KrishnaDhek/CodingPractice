package Array;
import java.util.HashMap;
import java.util.Scanner;

public class NumberOfGoodPair {
    public static int NumberOfGoodPair(int[] nums){
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int val =map.put(i,map.get(i)+1);
                count +=val;
            }
            else
             map.put(i, 1);
        }
        return count;

    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,1,1,3};
        for(int i:arr){
            System.out.println(i);
        }
       int ans= NumberOfGoodPair(arr);
       System.out.println("Number of good pair = "+ans);
    }
    
}
