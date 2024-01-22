package Work.String;
import java.util.Scanner;
public class LongestString2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[5+1];
        int max = 0;
        
        for (int i=1; i<=5; i++){
            String line = scan.nextLine();
                arr[i] = line;
        }
        String longest = " ";
        for (int i=1; i<=5; i++){
            if (arr[i].length() > max){
                max = arr[i].length();
                longest = arr[i];
            }
        }
        System.out.println(longest);
    }
}
