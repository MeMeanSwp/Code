package Work.Method;
import java.util.Scanner;
public class AgeReport {
    static void AgeReport(int N, int ID[], int Age[], int Y1, int Y2){
        int Person = 0;
        for (int i = 0; i < N; i++){
            if (Age[i] >= Y1 && Age[i] <= Y2){
                    System.out.println(ID[i]);
                    Person +=1;
            }
        }
        System.out.println("There are " + (Person) + " persons in age range of " + (Y1) + " to " + (Y2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ID[] = new int[N];
        int Age[] = new int[N];
        for (int i = 0; i < N; i++){
            ID[i] = scan.nextInt();
            Age[i] = scan.nextInt();
        }
        int Y1 = scan.nextInt();
        int Y2 = scan.nextInt();
        AgeReport(N, ID, Age, Y1, Y2);
    }
}
