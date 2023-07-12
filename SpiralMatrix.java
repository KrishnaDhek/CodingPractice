public class SpiralMatrix {

    public static void printSpiral(int arr[][], int row, int column){
        int Top =0, Right = column-1, Bottom =row-1, Left=0;

        System.out.println("Spiral Array");
        while(Left<=Right && Top<=Bottom){
            // Printing topmost row
            for(int i=Top; i<=Right; i++){
                System.out.print(arr[Top][i]+" ");
            }
            
            Top++;

            //Printing rightmost column
            for(int i= Top; i<=Bottom;i++){
                System.out.print(arr[i][Right]+" ");
            }
           
            Right--;

            //Printing bottom-most row
            for(int i=Right; i>=Left; i--){
                System.out.print(arr[Bottom][i]+" ");
            }
           
            Bottom--;

            //Printing bottom to top
            for(int i =Bottom; i>=Top; i--){
                System.out.print(arr[i][Left]+" ");
            }
            Left++;

        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,17}};

        System.out.println("Original Array");
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        printSpiral(arr,4,4);


    }
    
}
