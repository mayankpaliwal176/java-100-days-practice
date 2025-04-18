import java.util.Scanner;

public class Grad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks:");
        int marks = sc.nextInt();
        String grade = "";

        if (marks > 100 || marks < 0) {
            System.out.println("Marks should be in the range of 0-100");
        } else {
            if (marks <= 100 && marks > 90) {
                grade = "A+";
            } else if (marks <= 90 && marks > 80) {
                grade = "A";
            } else if (marks <= 80 && marks > 70) {
                grade = "B";
            } else if (marks <= 70 && marks > 60) {
                grade = "C";
            } else if (marks <= 60 && marks > 50) {
                grade = "D";
            } else if (marks <= 50 && marks > 40) {
                grade = "E";
            } else {
                grade = "F";
            }

            switch (grade) {
                case "A+":
                    System.out.println("Your Grade is: " + grade + ", Excellent!");
                    break;
                case "A":
                    System.out.println("Your Grade is: " + grade + ", Very Good!");
                    break;
                case "B":
                case "C":
                    System.out.println("Your Grade is: " + grade + ", Good!");
                    break;
                case "D":
                case "E":
                    System.out.println("Your Grade is: " + grade + ", Need improvement!");
                    break;
                default:
                    System.out.println("Your Grade is: " + grade + ", You Are Failed");
            }
        }
        sc.close();
    }
}
// Improved version be Chatgpt

/*import java.util.Scanner;

public class Grad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = getValidMarks(sc);
        String grade = calculateGrade(marks);
        printGradeMessage(grade);
        sc.close();
    }

    // Method to get valid marks from user
    public static int getValidMarks(Scanner sc) {
        int marks;
        while (true) {
            System.out.print("Enter marks (0 - 100): ");
            if (sc.hasNextInt()) {
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("❌ Marks should be between 0 and 100. Try again.");
                }
            } else {
                System.out.println("❌ Invalid input. Please enter a number.");
                sc.next(); // clear invalid input
            }
        }
        return marks;
    }

    // Method to determine grade based on marks
    public static String calculateGrade(int marks) {
        if (marks > 90) return "A+";
        else if (marks > 80) return "A";
        else if (marks > 70) return "B";
        else if (marks > 60) return "C";
        else if (marks > 50) return "D";
        else if (marks > 40) return "E";
        else return "F";
    }

    // Method to print grade message
    public static void printGradeMessage(String grade) {
        String message;
        switch (grade) {
            case "A+":
                message = "Excellent!";
                break;
            case "A":
                message = "Very Good!";
                break;
            case "B":
            case "C":
                message = "Good!";
                break;
            case "D":
            case "E":
                message = "Needs improvement!";
                break;
            default:
                message = "You have failed. Don’t give up!";
        }
        System.out.printf("✅ Your Grade is: %s — %s%n", grade, message);
    }
}
*/