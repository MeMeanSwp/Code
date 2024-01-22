package Work.String;
import java.util.Scanner;
public class SpellChecking1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str1[] = new String[n];

        for (int i=0; i<n; i++){
            str1[i] = scan.next();
        }
        for (int i=0; i<10; i++){
            String str2 = scan.next();
            boolean check = false;
            for (int j=0; j<n
            ; j++){
                if (str2.equals(str1[j])){
                    check = true;
                }
            }
            if (check){
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }
    }
}
