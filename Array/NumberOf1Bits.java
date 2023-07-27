public class NumberOf1Bits{
    public static void main(String[] args) {
        long num =00000000000000000000000000001011;

        int count =0;
        for(int i=0; i<32; i++){
            int ans = 1<<i;
            if((num&ans)!=0)
            count++;
           
        }
         System.out.println(count);
    }
}