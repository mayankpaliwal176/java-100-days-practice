
import java.util.Scanner; 
public class EvenOrOdd{
    public static void main(String arg[]){
        System.out.println("Enter  the number to check if it is even or odd: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2 == 0){
            System.out.println("Number: " + num + " is even");
        }
        else{
            System.out.println("Number: " + num + " is odd");
        }
        scanner.close();
    }
}