import java.util.Scanner;
public class Sum{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        scanner.close();
    }
}