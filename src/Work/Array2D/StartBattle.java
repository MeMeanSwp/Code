package Work.Array2D;
import java.util.Scanner;
public class StartBattle {
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
        int shot_inside = 0;
        int miss_shot = 0;
        int hit_total = 0;
        int miss_inside = 0;
        int hit_again = 0;
        int miss_again = 0;

        for (int i=0; i<k; i++){
            int r = scan.nextInt();
            int c = scan.nextInt();
            if (r > 0 && r <= row && c > 0 && c <= col){
                if (arr[r-1][c-1] == 1){
                    hit_total +=1;
                    arr[r-1][c-1] = 3; 
                }
                else if (arr[r-1][c-1] == 0){
                    miss_inside +=1;
                    arr[r-1][c-1] = 4; 
                }
                else if (arr[r-1][c-1] == 3){
                    hit_again +=1; 
                }
                else if (arr[r-1][c-1] == 4){
                    miss_again +=1;
                }
            }
            else {
                miss_shot +=1;
            }
        }
        System.out.println(hit_total);
        System.out.println(miss_inside);
        System.out.println(hit_again);
        System.out.println(miss_again);
        System.out.println(miss_shot);
    }
}
