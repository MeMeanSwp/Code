package Work.Array1D;
import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int ans = number % 10;

        System.out.println(ans);
    }
}
