package Array;
public class DiagonalSum {
    public static int printSum(int[][] array){
        int sum =0;
        int row = array.length;
        for(int i =0;i<row;i++){
            sum+=array[i][i];
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(printSum(arr));
    }
    
}
