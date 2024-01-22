package Work.Array2D;
import java.util.Scanner;
public class Triple2 {
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
        int v = scan.nextInt();
        for (int r = 0; r < R; r++){
            int last = -1;
            for (int c = 0; c < (C-2); c++){
                int num1 = arr[r][c];
                int num2 = arr[r][c+1];
                int num3 = arr[r][c+2];
                if (num1 == v && num2 == v && num3 == v ){
                    if (last == -1){
                        System.out.print((c+1) + " ");
                    }
                    last = c;
                }
            }
            System.out.println(last+1);
        }
    }
}
