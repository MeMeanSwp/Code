package Work.Class.CookieFactory;
import java.util.Scanner;

class CookiePlanner {
    public int flour = 0;
    public int butter = 0;
    public int bags = 0;
    public int F;
    public int B;
    public int total;

    CookiePlanner(int F, int B){
        this.F = F;
        this.B = B;      
    }

    int calculate(){
        if (flour / F <= butter / B){
            total = flour / F;
        }
        else {
            total = butter / B;
        }
        return total;    
    } 

    boolean produce(int need){
        calculate();
        if (total >= need){
            bags += need;
            flour -= F * need;
            butter -= B * need;
            System.out.println(bags + " true");
            return true;
        }
        else {
            System.out.println("Max capacity = " + calculate() + " bags, but " + need + " bags requested false");
            return false;
        }
    }
    
    boolean addFlour(int addFlour){
        if (addFlour < 1){
            System.out.print("Invalid flour quantity ");
            return false;
        }
        else {
            flour += addFlour;
            System.out.print(flour + " ");
            return true;
        }
    }

    boolean addButter(int addButter){
        if (addButter < 1){
            System.out.print("Invalid butter quantity ");
            return false;
        }
        else {
            butter += addButter;
            System.out.print(butter + " ");
            return true;
        }
    }

    void reportProduction(){
        System.out.println("Cookie bags: " + bags);
        System.out.println("Flour left: " + flour);
        System.out.println("Butter left: " + butter);
    }
}
public class CookieFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int F = scan.nextInt();
        final int B = scan.nextInt();
        CookiePlanner plan = new CookiePlanner(F, B);
        final int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            if (K == 1){
                System.out.println(plan.addFlour(A));
            }
            else if (K == 2){
                System.out.println(plan.addButter(A));
            }
            else if (K == 3){
                plan.produce(A);
            }
        }
        plan.reportProduction();
    }
}