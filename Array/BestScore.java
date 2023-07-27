package Array;
public class BestScore {
    public static int[] TwoBest(int[] arr){
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

       for(int i : arr){
        if(max<i){
            min = max; 
            max =i;
        }
        else if(i>min && i<max){
            min = i;
        }
       }

        return new int[]{max,min};

    }
    public static void printBestScore(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        int[] arr ={3,68,18,76,88,9,67,100,54,23,54,78,99,94};

        TwoBest(arr);
        printBestScore(TwoBest(arr));
        
    }
    
}
