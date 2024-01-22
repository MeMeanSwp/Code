package Work.Array1D;
import java.util.Scanner;
public class Sukuna {
    public static void main(String[] arsg){

        Scanner scan = new Scanner(System.in);
        int total_box = scan.nextInt();
        int box[] = new int[total_box+1];
        int count[] = new int[total_box+1];
        int no = 0;

        for (int i = 1; i <= total_box; i++){
            int num = scan.nextInt();
            box[i] = num;
        }
        for (;;){
            int jujutsu = scan.nextInt();        
            if (jujutsu == 0){
                break;
            }
            int b = scan.nextInt();
            if (jujutsu <= 99 || jujutsu >= 1000){
                System.out.println("JUBUTSU !");
                no +=1;
            }
            else {
                box[b] = box[b] - 1;
                if (box[b] >= 0){   
                    System.out.println("OK !");
                    count[b] +=1;
                }
                else if (box[b] < 0){
                    System.out.println("SUKUNA !");
                } 
            }
        }
        for (int i=1; i<=total_box; i++){
            System.out.print(i + " ");
            System.out.println(count[i]);
        }
        System.out.println(no);
    }
}
