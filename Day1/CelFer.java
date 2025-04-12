import java.util.Scanner;
public class CelFer{
    public static void main(String args[]){
        System.out.println("Enter the temperature: ");
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        Double fer = temp*9/5 + 32;
        System.out.println("Temperature in Ferhenhiet: " + fer);
        scanner.close();
    }
}