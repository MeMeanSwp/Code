package Work.String;
import java.util.Scanner;
public class LongestString4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int max = 0;
        String longest = " ";

        for (;;){
            String line = scan.nextLine();
            if (line.length() == 0){
                break;
            }
            else if (line.length() >= max){
                max = line.length();
                longest = line;
            }
        }
        System.out.println(longest);
    }
}
