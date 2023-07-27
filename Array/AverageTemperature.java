import java.util.*;
public class AverageTemperature {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How Many Days' Temperature");
        int numdays = sc.nextInt();
        int[] Temps =new int[numdays];
        //record temperature and find avg
        int sum =0;
        for(int i =0; i<numdays; i++){
            System.out.println("Day"+ (i+1) + "'s high temperature");
            Temps[i] =sc.nextInt();
            sum += Temps[i];
        }
        double avgTemp =sum/numdays;
        //count days above average
        int above =0;
        for(int i=0; i<Temps.length; i++){
            if(Temps[i]>avgTemp){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + avgTemp);
        System.out.println(above + " Days above average");
    }
}
