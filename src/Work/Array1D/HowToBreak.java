package Work.Array1D;
import java.util.Scanner;
public class HowToBreak {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;

        while (number != 0){
            count +=1;
            number = scan.nextInt();
        }
        
        System.out.println(count);
    }
}
