package Work.Array1D;
import java.util.Scanner;
public class Reserve3Vans {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i=0; i<total; i++){
            
            int day = scan.nextInt();

            if (a <= b && a <= c){
                a += day;
                System.out.println("A");
            }
            else if (b <= a && b <= c){
                b += day;
                System.out.println("B");
            }
            else if (c <= a && c <= b){
                c += day;
                System.out.println("C");
            }
        }
    }
}
