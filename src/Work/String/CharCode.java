package Work.String;
import java.util.Scanner;
public class CharCode {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int val = (int)line.charAt(0);
        System.out.println(val);
        
    }
}
