package Work.String;
import java.util.Scanner;
public class CharAt {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int at = scan.nextInt();
        if (at > line.length() || at < 1){
            System.out.println("invalid position");
        }
        else {
            System.out.println(line.charAt(at-1));
        }
        
    }
}
