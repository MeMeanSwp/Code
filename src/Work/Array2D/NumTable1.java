package Work.Array2D;
import java.util.Scanner;
public class NumTable1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int arr[][] = new int[R][C];
        for (int r = 0; r < R; r++){
            for (int c = 0; c < C; c++){
                arr[r][c] = scan.nextInt();
            }
        }
        int N = scan.nextInt();
        int num = -1;
        for (int i = 0; i < N; i++){
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row < 1 || row > R || col < 1 || col > C){
                if (num != 1){
                    System.out.println();
                }
                num = -1;
            }
            else {
                if (num == arr[row-1][col-1]){
                    System.out.print("*");
                }
                else {
                    System.out.print(arr[row-1][col-1]);
                    num = arr[row-1][col-1];
                }     
            }
        }
    }
}
