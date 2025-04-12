import java.util.Scanner;
public class Calc{
    public static  void main(String arg[]){
    System.out.println("What you want to do: \n 1.Addititon \n 2.Substraction \n 3.Multiplication \n 4.Division");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
     System.out.println("Enter two numbers:");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    switch(num){
        case 1: int sum = a + b; 
         System.out.println("Addition: " + sum);
        break;
        case 2: int sub = a - b; 
         System.out.println("Substraction: " + sub);
        break;
        case 3: int mul = a * b; 
         System.out.println("Multiplication: " + mul);
        break;
        case 4: int div = a / b; 
         System.out.println("Division: " + div);
        break;
        default:          System.out.println("Please choose as requested");
    }
    scanner.close();
    }
}