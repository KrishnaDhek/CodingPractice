import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int ans = RecursiveFactorial(num);
        System.out.println(ans);
    }
    public static int RecursiveFactorial(int num){
        if(num<1){
            return-1;
        }
        if(num==0 ||num ==1){
            return 1;
        }
        else{
            return num*RecursiveFactorial(num-1);
            
        }
      

    }
    
}
