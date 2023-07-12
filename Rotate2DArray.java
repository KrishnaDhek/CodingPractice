public class Rotate2DArray {
    

    public static void RotateArray(int[][] arr, int row, int column ){
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] =arr[j][i];
                arr[j][i]= temp;
            }

        }
       
        for(int i =0;i<arr.length; i++){
           for(int j =0; j<arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1]= temp;

            }
            
        }
        
         
       
        printArray(arr);
    }
            
   

     public static void printArray(int[][] arr){

        for(int i=0; i<arr.length; i++){
            
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
           }
            System.out.println(" ");
        }
   
    }
    

    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};

        RotateArray(arr,3,3);

        
    }
    
}

