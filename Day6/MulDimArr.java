import java.util.Scanner; 
class Matrix{
    void show(){
        System.out.print("Enter row and col: ");   
        Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();
        int [][] arr = new int[row][col]; 
        System.out.print("Enter matrix elements: ");   
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");   
            }
            System.out.println();
        }
    }
}
public class MulDimArr{
    public static void main(String args[]){
        Matrix obj = new Matrix();
        obj.show();
    }
}