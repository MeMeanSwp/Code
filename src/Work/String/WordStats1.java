import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[26];

        for (int i = 0; i < N; i++) {
            String word = scan.next();
            char first = word.charAt(0);
            
            //Check A - Z
            if (first >= 'A' && first <= 'Z') {
                arr[first - 65] +=1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                char letter = (char)('A' + i);
                System.out.println(letter + " " + arr[i]);
            }
        }
    }
}
