package Work.String;
import java.util.Scanner;
public class IntToChar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int code = num;
        
        if (num < 'A' || num > 'Z'){
            System.out.println("unsupported code");
        }
        else {
             System.out.println((char)code);
        }
    }
}
