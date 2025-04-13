public class DigitCounter {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        int num = 123456;
        System.out.println("Total digits: " + countDigits(num));
    }
}
