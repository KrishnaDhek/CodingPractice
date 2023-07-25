import java.util.Scanner;
public class Power {
public static int Power(int num, int expo){
    if(expo==0 ){
        return 1;
    }
    
    return num*Power(num,expo-1);

}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int expo = sc.nextInt();
        System.out.println(Power(num,expo));
    }
}
    

