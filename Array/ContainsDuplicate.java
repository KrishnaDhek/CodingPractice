import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean ContainsDuplicate(int[] arr){
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int i : arr){
            if(hset.contains(i)){
                return true;
            }
            hset.add(i);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,5,5,8,7,6};
       System.out.println(ContainsDuplicate(arr)); 
       

        
        
    }
    
}
