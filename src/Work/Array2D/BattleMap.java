package Work.Array2D;
import java.util.Scanner;
public class BattleMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[row][col];

        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++){
                arr[r][c] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        System.out.println(k);

        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
