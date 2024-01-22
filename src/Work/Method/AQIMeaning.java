package Work.Method;
import java.util.Scanner;
public class AQIMeaning {
    static void AQIMeaning(int Air){
        if (Air <= 50){
            System.out.println("Good");
        }
        else if (Air >= 51 && Air <= 100){
            System.out.println("Moderate");
        }
        else if (Air >= 101 && Air <= 150){
            System.out.println("Unhealthy for Sensitive Groups");
        }
        else if (Air >= 151 && Air <= 200){
            System.out.println("Unhealthy");
        }
        else if (Air >= 201 && Air <= 300){
            System.out.println("Very Unhealthy");
        }
        else if (Air >= 301){
            System.out.println("Hazardous");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Air = scan.nextInt();
        AQIMeaning(Air);
    }
}
