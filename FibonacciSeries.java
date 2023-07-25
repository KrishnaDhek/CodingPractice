import java.util.Scanner;

public class FibonacciSeries {
     
    public static int Fib(int num){
        if(num==0||num==1){
            return num;
        }
        return Fib(num-1)+Fib(num-2);
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series of "+num+" is "+Fib(num));
    }
   
    
}
