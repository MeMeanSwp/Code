package Work.String;
import java.util.Scanner;
public class CharWatch1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();

        char char1 = s1.charAt(0);
        char char2 = s2.charAt(0);
        char char3 = s3.charAt(0);
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count_error = 0;

        String line = scan.next();
        int n = scan.nextInt();

        for (int i=0; i<n; i++){
            int target = scan.nextInt();
            if ((target-1) < 0 || (target-1) >= line.length()){
                count_error +=1;
            }
            else if (char1 == line.charAt(target-1)){
                count1 +=1; 
            }
            else if (char2 == line.charAt(target-1)){
                count2 +=1;  
            }
            else if (char3 == line.charAt(target-1)){
                count3 +=1;   
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count_error);
    }
}
