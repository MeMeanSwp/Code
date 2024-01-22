package Work.Method;
import java.util.Scanner;
public class UnderLineWithParameter {
    static void Underline(int num){
        for (int i = 0; i < num; i++){
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
            int num = scan.nextInt();
            Underline(num);
        }
    }
}
