package Work.String;
import java.util.Scanner;
public class CharCount1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int arr[] = new int[100];

        for (int i=0; i<line.length(); i++){
            int val = (int)(line.charAt(i));
            arr[val] +=1;
        }
        for (int i='A'; i<='Z'; i++){
            if (arr[i] > 0){
                int count = arr[i];
                System.out.println((char)i + " " + count);
            }
        }
    }
}
