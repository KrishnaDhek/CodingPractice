package Array;

public class MaximumSum {

    public  static int MaximumSum(int[] n ,int k){
        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i<n.length; i++){
            max = Math.max(n[i], max);
        }

        for(int i =0; i<k ;i++){
            sum +=max;
            max++;
        }
        return sum;
    }

    
    public static void main(String[] args) {
        int[] arr = {8,100,72,84,3,1,2,98,201};
        int k =4;
        int result = MaximumSum(arr,k);
        System.out.println(result);
    }
    
}
