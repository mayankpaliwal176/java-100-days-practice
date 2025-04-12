import java.util.Scanner;
public class AreaRect{
    public static void main(String arg[]){
        System.out.println("Enter length and then width of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();   
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }
}