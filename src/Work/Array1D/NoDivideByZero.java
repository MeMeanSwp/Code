package Work.Array1D;
import java.util.Scanner;
public class NoDivideByZero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double ans = (x + y) / z;

        if (x != 0 && y != 0 && z != 0){
            System.out.printf("%.6f", ans);
        } 
        else {
            System.out.println("cannot devide by zero");
        }
    }
}
