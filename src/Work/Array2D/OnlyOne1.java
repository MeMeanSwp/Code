package Work.Array2D;
import java.util.Scanner;
public class OnlyOne1 {
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
        int count[] = new int[10000];
        int most_col = 0;
        int most_count = 0;
        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++){
                if (arr[r][c] == 1){
                    count[c] +=1;
                }
                if (count[c] >= most_count){
                    most_count = count[c];
                    most_col = c+1;
                } 
            }
        }
        System.out.println(most_count);
        System.out.println(most_col);
    }
}
