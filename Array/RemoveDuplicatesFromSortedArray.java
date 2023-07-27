package Array;
public class RemoveDuplicatesFromSortedArray {
    public static int RemoveDuplicatesFromSortedArray(int[] arr, int n){
        int ans=0;
        if(n==0)
        
        return 0;

        for(int i =1 ; i<n-1; i++){
            if(arr[ans]!= arr[i]){
                ans++;
                arr[ans]= arr[i];

            }
        }

        return ans+1;

    }
    
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,7,9};
        int n = arr.length;
         n= RemoveDuplicatesFromSortedArray(arr,n);

        for(int i =0; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
    
}
