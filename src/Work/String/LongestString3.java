package Work.String;
import java.util.Scanner;
public class LongestString3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[5+1];
        
        for (int i=1; i<=5; i++){
            String line = scan.nextLine();
            arr[i] = line;
        }
        int max = 0;
        String longestStr = " "; 
        for (int i=1; i<=5; i++){
            if (arr[i].length() >= max){
                max = arr[i].length();
                longestStr = arr[i];
            }
        }
        System.out.println(longestStr);
    }
}