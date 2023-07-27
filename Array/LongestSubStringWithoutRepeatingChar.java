package Array;
import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {
    public static int LongestSubStringWithoutRepeatingChar(String s){
        int start =0;
        int maxlen =0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                while(start<i){
                    map.remove(s.charAt(start));
                    start++;

                }
            }
            map.put(c,1);
            maxlen = Math.max(maxlen, i-start+1);
        }
        return maxlen;

    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestSubStringWithoutRepeatingChar(s));
    }
    
}
