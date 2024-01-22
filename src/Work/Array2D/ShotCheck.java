package Work.Array2D;
import java.util.Scanner;
public class ShotCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int k = scan.nextInt();
        int shot_inside = 0;
        int miss_shot = 0;

        for (int i=0; i<k; i++){
            int r = scan.nextInt();
            int c = scan.nextInt();
            if (r > 0 && r <= row && c > 0 && c <= col){
                shot_inside +=1;
            }
            else {
                miss_shot +=1;
            }
        }
        System.out.println(shot_inside);
        System.out.println(miss_shot);
    }
}
