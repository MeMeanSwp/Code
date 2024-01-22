package Work.Array1D;
import java.util.Scanner;
public class ReversePrint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();int
        arr[] = new int[n];
        
        
        for (int i=0; i<n; i++){
            int number = scan.nextInt();
            arr[i] = number;
        }
        for (int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
