public class FinalValueOfVariable {
    public static int FinalValueOfVariable(String[] operations){
        int count =0;
        for(String s : operations){
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
        String[] operations = {"++X","X--","X++","X--","X++","X++","X--"};
        int result = FinalValueOfVariable(operations);
        System.out.println("The final value of variable after performing operation is : "+result);
    }
    
}
