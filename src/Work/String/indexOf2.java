package Work.String;
import java.util.Scanner;
public class indexOf2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String index = scan.nextLine();
        int pos = line.indexOf(index);
        int i = 0;

        while (pos >= 0){
            pos = line.indexOf(index, i);
            if (pos != -1){
                System.out.print((pos+1) + " ");
                i = pos+1;
            }
        }
        if (pos == -1 && i == 0){
            System.out.println("string not found");
        }
    }
}
