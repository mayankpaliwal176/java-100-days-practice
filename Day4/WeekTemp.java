// Write a program to take temperature of 7 days and find the highest and lowest temperature.
import java.util.Scanner;
public class WeekTemp{
    public static void main(String arg[]){
        int[] temp = new int[7];
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature of 7 days one by one: ");
        for(int i=0; i <temp.length;i++){
            temp[i]=sc.nextInt();
        }
       for (int i = 0; i < temp.length; i++) {
            if(temp[i]>max){
                max= temp[i];
            }
            if(temp[i]<min){
                min= temp[i];
            }
        }
             System.out.println("Maximum temperature was: " + max);   
             System.out.println("Miniimum temperature was: " + min);   

    }
}