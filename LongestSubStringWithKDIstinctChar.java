import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDIstinctChar {
    public static int LongestSubStringWithKDIstinctChar(String s, int k){

        if(s.length()==0 || s== null || k==0){
            return 0;
        }

        int start =0;
       
        int max =0;

       Map<Character,Integer> map = new HashMap<>();

       for(int i =0; i<s.length(); i++){
        char j = s.charAt(i);
        map.put(j, map.getOrDefault(j, 0)+1);
    
        while(map.size()>k){
            char p =s.charAt(start);
            map.put(p, map.get(p)-1);
            if(map.get(p)==0){
                map.remove(p);
            }
            start++;
        }
       max = Math.max(max, i-start+1);
       }
       return max;
    }
    public static void main(String[] args) {
        String s= "aabcbcdbca";
        int k =2;
        System.out.println(LongestSubStringWithKDIstinctChar(s,k));
    }
    
}
