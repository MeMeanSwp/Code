package Compro.Recursion;

import java.util.Scanner;

public class BackAndForth {
    String reoder(String word, boolean forward){
        if (word.length() == 0){
            return word;
        }
        else {
            if (forward){
                if (word.charAt(0) != 'A'){
                    char newString = word.charAt(0);
                    return newString + reoder(word.substring(1), true);
                }
                else {
                    char newString = word.charAt(0);
                    return newString + reoder(word.substring(1), false);
                }
            }
            else {
                if (word.charAt(word.length()-1) != 'A'){
                    char newString = word.charAt(word.length()-1);
                    return newString + reoder(word.substring(0, word.length()-1), false);
                }
                else {
                    char newString = word.charAt(word.length()-1);
                    return newString + reoder(word.substring(0, word.length()-1), true);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        BackAndForth baf = new BackAndForth();
        String ans = baf.reoder(word, true);
        System.out.println(ans);
    }
}
