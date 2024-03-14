package Compro.Recursion;

import java.util.Scanner;

public class PalindromeMaker {
    String makePalindrome(String str){
        if (str.length() <= 1){
            return str;
        }
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            if (first == last){
                return first + makePalindrome(str.substring(1, str.length()-1)) + last;
            }
            else {
                return makePalindrome(str.substring(1, str.length()-1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        PalindromeMaker maker = new PalindromeMaker();
        String result = maker.makePalindrome(str);
        System.out.println(result);
    }
}
