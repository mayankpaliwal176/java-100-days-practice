public class TypeCon{
    public static void main(String arg[]){
        // implicit type conversion
        // int n = 10;
        // double m = n;
        // System.out.println("value of n: " + n + "\nvalue of m: " + m);
 
        //  Explicit type conversion
        // double m = 10.00;
        // int n = (int)m;
        // System.out.println("value of n: " + n + "\nvalue of m: " + m);

        // Char to int
        // char m = 'a';
        // int n = m;
        // System.out.println("value of m: " + m + "\nvalue of n: " + n);
        
        // int to char
        // int m = 65;
        // char n = (char)m;
        // System.out.println("value of m: " + m + "\nvalue of n: " + n);

        // String to Int
        // String m = "50";
        // int n = Integer.parseInt(m);
        // int o = n*2;
        // System.out.println("value of m: " + m + "\nvalue of o: " + o);

        // Int to String 
        // int m = 50;
        // String n = String.valueOf(m);
        // System.out.println("value of m: " + m + "\nvalue of n: " + n);
        // System.out.println("Type of n: " + n.getClass().getSimpleName());
        //giving String only getName will give java.lang.String and getclass only will give class java.lang.String

        // int a = 10;
        // double b =3.5;
        // int sum = (int)(a + b);
        // System.out.println(sum);
        // returinng 13

        // bool to String
        // Boolean m = true;
        // String n = String.valueOf(m);
        // System.out.println("value of m: " + m + "\nvalue of n: " + n);

        //String to bool
        String m = "False";
        Boolean n = Boolean.parseBoolean(m);
        System.out.println("value of m: " + m + "\nvalue of n: " + n);
    }
}