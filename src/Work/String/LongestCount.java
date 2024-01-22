package Work.String;
import java.util.Scanner;
public class LongestCount {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int count = 0;

        for (;;){
            String line = scan.nextLine();
            if (line.length() == 0){
                break;
            }
            else if (line.length() > max){
                max = line.length();
                count = 1;
            }
            else if (line.length() == max){
                max = line.length();
                count +=1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}