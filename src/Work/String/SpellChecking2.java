package Work.String;
import java.util.Scanner;
public class SpellChecking2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str[] = new String[n];
        for (int i=0; i<n; i++){
            str[i] = scan.next();
        }
        int k = scan.nextInt();
        for (int i=0; i<k; i++){
            String line = scan.nextLine();
        }
    }
}
