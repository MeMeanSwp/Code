package Work.Array1D;

import java.util.Scanner;

public class GetoSuguru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int box = scan.nextInt();
        int geto_jubutsu = scan.nextInt();
        int boxIncome[] = new int[box+1];
        int capacity = 0;
        int count_cursed[] = new int[box+1];
        int total = 0;
        
        for (;;){
            int cursed = scan.nextInt();
            if ((cursed % 7 == 0) || (cursed % 11 == 0)){
                break;
            }
            int num_box = scan.nextInt();
            if (capacity + cursed > geto_jubutsu || num_box < 0 || num_box > box){
                System.out.println("VOMIT");
            }
            else {
                boxIncome[num_box] += cursed;
                count_cursed[num_box] +=1;
                capacity += cursed;
                System.out.println("EAT IT");
            }
        }
        for (int i = 1; i <= box; i++){
            total += boxIncome[i];
        }
        System.out.println(total);
        for (int i = 1; i <= box; i++){
            System.out.print(i + " ");
            System.out.print(count_cursed[i] + " ");
            System.out.println(boxIncome[i]);
        }
    }
}
