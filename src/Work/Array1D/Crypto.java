package Work.Array1D;
import java.util.Scanner;
public class Crypto {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            int number = scan.nextInt();
            arr[i] = number;
        }

        int opt = scan.nextInt();
        int key = scan.nextInt();
        boolean v1 = (arr[opt] + key <= 51743);
        boolean v2 = (arr[opt+1] - key > 7832);
        boolean v3 = (arr[opt+2] - key < 2394);
        boolean v4 = (arr[opt+3] + key > 9213);

        if (v1 || v2 == true){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        if (v3 || v4 == true){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        if ((v1 || v2 == true) && (v3 || v4 == true)){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
