public class MaxSubArrayOfSizeK {
    public static int MaxSubArrayOfSizeK(int[] arr, int k){

        int sum = 0;
        int maxSum =0;
        int start =0;

        for(int i =0; i<k; i++){
            sum +=arr[i];
        }

        for(int i=k; i<arr.length; i++){
            sum +=arr[i]-arr[i-k];
            maxSum =Math.max(maxSum,sum);

        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k =3;
        System.out.println(MaxSubArrayOfSizeK(arr,  k));
    }
    
}
