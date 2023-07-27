import java.util.HashMap;

public class FruitsIntoBasket {
    public static int FruitsIntoBasket(char[] s){
        int start =0;
        int maxFruit =0;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length; i++){
            map.put(s[i], map.getOrDefault(s[i],0)+1);

            while(map.size()>2){
                map.put(s[start], map.get(s[start])-1);
                if(map.get(s[start])==0){
                    map.remove(s[start]);
                }
                start++;


            }
            maxFruit = Math.max(maxFruit, i-start+1);
            
        }
        return maxFruit;


    }
    public static void main(String[] args) {
        char[] s ={'A', 'B', 'C', 'A', 'C'};
        System.out.println(FruitsIntoBasket(s));
    }
    
}
