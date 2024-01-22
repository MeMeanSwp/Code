package Work.Method;
import java.util.Scanner;
public class Underline {
    static void Underline(){
        for (int i = 0; i < 20; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++){
            String word = scan.next();
            System.out.println(word);
            Underline();
        }
    }
}
