public class PrintingPair {
    public static void PrintingPair(int[] a){

        for(int i=0; i<a.length; i++){
            for(int j =i+1; j<a.length; j++){
                System.out.println(a[i]+" "+a[j]);
            }
        }
        return;

    }
    public static void main(String[] args) {
        int[] a ={1,3,4,5};
        PrintingPair(a);
    }
    
}
