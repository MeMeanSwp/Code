package Work.Array1D;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int k = scan.nextInt();
        
        
        for (int i=0; i<k; i++){
            int vote = scan.nextInt();
            arr[vote-1] +=1;
        }
        
        int max = -1;
        int pos = 0;
        for (int i=0; i<n; i++){
            if (arr[i] > max){
                max = arr[i];
                pos = i+1;
            }
        }
        System.out.println(pos);
        System.out.println(max);
    }
}
