import java.util.Scanner;
public class PosOrNeg{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        if(a>0){
        System.out.println("Number is positive");
        }else{
        System.out.println("Number is negative");
        }
        scanner.close();
    }
}