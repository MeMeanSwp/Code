package Work.Array1D;
import java.util.Scanner;
public class OddVsEven {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for (int count=0; count<8; count++){

            int number = scan.nextInt();

            if (number % 2 == 0){
                even += number;
            }
            else {
                odd += number;
            }
        }
        if (even == odd){
            System.out.println("equal");
        }
        else if (even > odd){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    
        System.out.println(even);
        System.out.println(odd);
    }
}
