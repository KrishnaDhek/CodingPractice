package Array;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();


        for(int  i=0; i<a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> itr : map.entrySet()){
            if(itr.getValue() > (a.length/2))
                System.out.println(itr.getKey());
        }

    }
    
}
