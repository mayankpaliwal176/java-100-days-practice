import java.util.Scanner;
public class Factorial{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=0;
        for(int i=num; i>1;i--){
            fact = num*(num-1);
        }
        System.out.println(fact);
    }
}