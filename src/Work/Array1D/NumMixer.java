package Work.Array1D;
import java.util.Scanner;
public class NumMixer {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arrA[] = new int[n];
        int arrB[] = new int[n];
        int total = n*2;

        for (int i=0; i<n; i++){
            int numberA = scan.nextInt();
            arrA[i] = numberA;
        }

        for (int i=0; i<n; i++){
            int numberB = scan.nextInt();
            arrB[i] = numberB;
        }

        int sol = scan.nextInt();
       

        if (sol > 0){ 
            int B = n-1;
            for (int i=0; i<n; i++){   
                System.out.print(arrA[i] + " " + arrB[B] + " ");
                B--;
                
            }
        }
        if (sol < 1){
            int B = n-1;
            for (int i=0; i<n; i++){ 
                System.out.print(arrB[B] + " " + arrA[i] + " ");
                B--;
                
            }
        }
    }
}
