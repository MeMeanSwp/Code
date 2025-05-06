import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int max[] = new int[26];
        int min[] = new int[26];

        for (int i = 0; i < N; i++) {
            String word = scan.next();
            char first = word.charAt(0);

            //Check A - Z
            if (first >= 'A' && first <= 'Z') {
                if (word.length() > max[first - 65]) {
                    max[first - 65] = word.length();
                }
                if (word.length() < min[first - 65]) {
                    min[first - 65] = word.length();
                }
            }
        }

        for (int i = 0; i < max.length; i++) {
            if (max[i] > 0 && min[i] > 0) {
                char letter = (char)('A' + i);
                System.out.println(letter + " " + min[i]+ " " + max[i]);
            }
        }
    }
}
