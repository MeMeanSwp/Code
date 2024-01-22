package Work.String;
import java.util.Scanner;
public class indexOf {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String index = scan.nextLine();   
        if (line.indexOf(index) > -1){
            System.out.println(line.indexOf(index)+1);
        }   
        else {
            System.out.println("string not found");
        }
    }
}
