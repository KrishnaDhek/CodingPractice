package Array;
public class FinalValueOfVariable {
    public static int FinalValueOfVariable(String[] operation){
        int count =0;
        for(String s : operation){
            if(s.equals("++X")||s.equals("X++")){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String[] operation = {"++X","X--","X++","X--","X++","X++","X--"};
        int result = FinalValueOfVariable(operation);
        System.out.println("The final value of variable after performing operation is : "+result);
    }
    
}
