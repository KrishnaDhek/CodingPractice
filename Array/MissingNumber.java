package Array;
public class MissingNumber {
    public static int MissingNumber(int[] arr){
        int ans =0;

        for(int res : arr){
            ans ^= res;
        }
        for(int i =0; i<=arr.length; i++){
            ans ^=i;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {9,2,3,8,7,6,0,1,4};
        System.out.println(MissingNumber(arr));
    }
    
}
