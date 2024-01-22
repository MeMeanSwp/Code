package Work.Array2D;
import java.util.Scanner;
public class TableQuery1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int [row][col];

        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++){
                arr[r][c] = scan.nextInt();
            }
        }
        int t = scan.nextInt();
        int q = scan.nextInt();

        if (t == 1){
            if (q < 1 || q > row){
                System.out.println("invalid Q");
            }
            else {
                for (int r=q-1; r<q; r++){
                    for (int c=0; c<col; c++){
                        System.out.print(arr[r][c] + " ");
                    }
                }
            }
        }
        else if (t == 2){
            if (q < 1 || q > col){
                System.out.println("invalid Q");
            }
            else {
                for (int r=0; r<row; r++){
                    for (int c=q-1; c<q; c++){
                        System.out.print(arr[r][c] + " ");
                    }
                    System.out.println();
                }
            }
        } 
    }
}
