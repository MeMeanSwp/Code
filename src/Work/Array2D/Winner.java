package Work.Array2D;
import java.util.Scanner;
public class Winner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[row][col];
        int ship = 0;

        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++){
                arr[r][c] = scan.nextInt();
                if (arr[r][c] == 1){
                    ship +=1;
                }
            }
        }
        int k = scan.nextInt();
        int shot_inside = 0;
        int miss_shot = 0;
        int hit_total = 0;
        int miss_inside = 0;
        int hit_again = 0;
        int miss_again = 0;
        int final_shot = 0;
        int all_ship = ship;
        int count = 0;
        int first_shot = 0;
        int end = 0;

        for (int i=0; i<k; i++){
            int r = scan.nextInt();
            int c = scan.nextInt();
            if (r > 0 && r <= row && c > 0 && c <= col){
                if (arr[r-1][c-1] == 1){
                    hit_total +=1;
                    arr[r-1][c-1] = 3;
                    ship -=1;
                    count +=1; 
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
                if (ship == 0 && end == 0){
                    final_shot = i;
                    end +=1;
                }
                if (count == 1){
                    first_shot = i;
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
        if (ship == 0){
            System.out.println("attacker " + (final_shot-1));
        }
        else if (ship == all_ship){
            System.out.println("battleship -1");
        }
        else if (ship > 0 && ship < all_ship){
            System.out.println("battleship " + (first_shot+1));
        }
    }
}
