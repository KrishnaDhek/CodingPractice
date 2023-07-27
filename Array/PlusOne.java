package Array;
public class PlusOne {
    public static int[] PlusOne(int[] digits){

        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }

        digits = new int[digits.length+1];
            digits[0]=1;
        
        return digits;
    }
    public static void main(String[] args) {
        int[] arr ={1,5,9,9,9,9,9};
        
        for(int i : PlusOne(arr)){
            System.out.println(i);
        }
    }
    
}
