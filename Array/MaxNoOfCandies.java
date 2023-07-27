package Array;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class MaxNoOfCandies {
    public static List<Boolean> kidsWithMaxCandies(int[] candies, int extraCandies){
        int min = Integer.MIN_VALUE;
        for(int i: candies){
            if(i>min){
                min = i;
            }
           

        }
       
        List<Boolean> list = new ArrayList<>();
            for(int i :candies){
                if(i+extraCandies>=min){
                    list.add(true);
                }
                else{
                    list.add(false);
                }
            }
            
       
        return list;
        
    }
    public static void main(String[] args) {
        int[] candies ={4,2,1,1,2};
        int extraCandies =1;
        List<Boolean> list = kidsWithMaxCandies(candies, extraCandies); 
        
        System.out.println(list);
    }
    
}
