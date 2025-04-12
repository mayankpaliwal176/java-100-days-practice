import java.util.Scanner;
public class SimInt{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount");
        int a = scanner.nextInt();
        System.out.println("Enter ROI");
        int b = scanner.nextInt();
        int SimpleInterest = (a / 100)*b;
        System.out.println("Simple Interest is: " + SimpleInterest);
        scanner.close();
    }
}