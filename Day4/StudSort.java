// Find students scoring above min and sort them.
import java.util.Scanner;
import java.util.Arrays;
public class StudSort{
    public static void main(String[] args){
        int[] score = new int[5];
        int[] result = new int[5];
        int min = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score of 5 student one by one: ");
        for(int i=0; i <score.length;i++){
                score[i]=sc.nextInt();
        }
            int[] temp = new int[5];
            int count = 0;
            for(int i = 0; i < score.length; i++) {
            if(score[i]>min){
             temp[count++]=score[i];
            }
            }
                result = Arrays.copyOf(temp, count++);
                Arrays.sort(result);
            System.out.println("Scores above " + min + "are: " + Arrays.toString(result));

    }

}

// ChatGPT version using enhanced for loop

// import java.util.Scanner;
// import java.util.Arrays;

// public class StudSort {
//     public static void main(String[] args) {
//         int[] score = new int[5];
//         int[] result;
//         int min = 3;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter scores of 5 students one by one:");
//         for (int i = 0; i < score.length; i++) {
//             score[i] = sc.nextInt();
//         }

//         // Use enhanced for loop to filter scores above min
//         int[] temp = new int[5];
//         int count = 0;
//         for (int s : score) {
//             if (s > min) {
//                 temp[count++] = s;
//             }
//         }

//         result = Arrays.copyOf(temp, count); // No need to increment count again
//         Arrays.sort(result);

//         System.out.println("Scores above " + min + " are: " + Arrays.toString(result));
//     }
// }
