import java.util.Scanner;

public class ElecBill {
    public static void main(String[] args) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer type (residential/commercial/industrial):");
        String type = sc.next();
        System.out.println("Enter the number of units consumed: ");
        int unit = sc.nextInt();
        if(!type.equals("residential") && !type.equals("commercial") && !type.equals("industrial")){
            System.out.println("Invalid customer type");
        }else{
            if (type.equals("residential") && unit<=100){
                amount= unit*5;
            }else if (type.equals("residential") && unit<=300){
                amount= unit*7;
            }else if (type.equals("residential") && unit>300){
                amount= unit*10;
            }else if (type.equals("commercial")){
                amount= unit*8;
            }else if (type.equals("industrial") && unit<=500){
                amount= unit*12;
            }else{
                amount=unit*15;
            }
            System.out.println("Electricity Bill Amount is: " + amount);
        }
        sc.close();
    }
}


// Improved version using chatGPT

/*import java.util.Scanner;

public class ElecBill {
    public static void main(String[] args) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer type (residential/commercial/industrial):");
        String type = sc.next().toLowerCase();  // Make it case-insensitive

        System.out.println("Enter the number of units consumed: ");
        int unit = sc.nextInt();

        if (!type.equals("residential") && !type.equals("commercial") && !type.equals("industrial")) {
            System.out.println("Invalid customer type");
        } else {
            switch (type) {
                case "residential":
                    if (unit <= 100) {
                        amount = unit * 5;
                    } else if (unit <= 300) {
                        amount = unit * 7;
                    } else {
                        amount = unit * 10;
                    }
                    break;

                case "commercial":
                    amount = unit * 8;
                    break;

                case "industrial":
                    if (unit <= 500) {
                        amount = unit * 12;
                    } else {
                        amount = unit * 15;
                    }
                    break;
            }

            System.out.println("Electricity Bill Amount is: " + amount);
        }

        sc.close();
    }
}
*/