import java.util.Scanner;
public class CharType{
    public static void main(String arg[]){
        System.out.println("Enter a password");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = c;
        if(65<=n && n<=90){
        System.out.println("It is capital alphabet");
        }else if(97<=n && n<=122){
        System.out.println("It is small alphabet");
        }else if(48<=n && n<=57){
        System.out.println("It is a digit");
        }else{
        System.out.println("It is a special character");
        }
    }
}