package Work.Method;
import java.util.Scanner;
public class BgReport {
    static void BgReport(String Name, int Birth, int Start){
        if (Name.length() >= 2){
            System.out.println("Name: " + Name);
        }
        else {
            System.out.println("Name: INVALID");
        }
        if (Birth >= 1990 && Birth <= 2022){
            if (Start >= 1990 && Start <= 2022){
                if (Start - Birth >= 18){
                    System.out.println("Birth year: " + Birth);
                    System.out.println("Start year: " + Start);
                }
                else {
                    System.out.println("Birth year: " + Birth);
                    System.out.println("Start year: INVALID");
                }
            }
            else {
                System.out.println("Birth year: " + Birth);
                System.out.println("Start year: INVALID");
            }    
        }
        else {
            System.out.println("Birth year: INVALID");
            System.out.println("Start year: INVALID");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.next();
        int Birth = scan.nextInt();
        int Start = scan.nextInt();
        BgReport(Name, Birth, Start);
    }
}
