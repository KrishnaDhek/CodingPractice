package Array;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class MoveZeroToLast {
    public static void MoveZero(int[] nums){
        int i =0;
        int j =1;
        while(j<nums.length){
            if(nums[i]==0 &&nums[j]!=0){
                int temp = nums[i];
                nums[i] =nums[j];
                nums[j] =temp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }

        for(int num :nums){
            System.out.println(num);
        }

    }
    public static void main(String[] args) {
        int[] nums ={7,8,0,4,0,0,3,2,9,};
        MoveZero(nums);
    }
    
}
