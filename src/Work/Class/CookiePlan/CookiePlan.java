package Work.Class.CookiePlan;
import java.util.Scanner;

public class CookiePlan {
    static int planCookie(int flours[], int butters[]){
        int day = 0;
        for (int i = 0; i < flours.length; i++){
            if (flours[i] < 60 || butters[i] < 30){
                System.out.println(i+1);
                day +=1;
            }
            else {
                continue;
            }
        }
        return day;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for (int i = 0; i < N; i++){
            flours[i] = scan.nextInt();
            butters[i] = scan.nextInt();
        }
        System.out.println("There are " + planCookie(flours, butters) + " days that ingredients are insufficient");
    }
}