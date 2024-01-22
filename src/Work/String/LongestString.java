package Work.String;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int max = 0;
        
        for (int i=1; i<=5; i++){
            String line = scan.nextLine();
            if (line.length() > max){
                max = line.length();
            }
        }
        System.out.println(max);
    }
}
