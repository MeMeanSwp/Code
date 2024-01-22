package Work.Array1D;
import java.util.Scanner;
public class NumberOccurrence {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            int number = scan.nextInt();
             arr[i] = number;    
        } 

        int target = scan.nextInt();
        int count = 0;

        for (int i=0; i<n; i++){
             if (arr[i] == target){
                System.out.print(i+1 + " ");
                count +=1;
             }  
        }
        if (count == 0){
                System.out.print("0");
             }
    }
}

