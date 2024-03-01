package Compro.Recursion;

import java.util.Scanner;

public class AlternateChar {
    String alterMerge(String str1, String str2, int order){
        if (order % 2 != 0){
            if (str1.length() == 0){
                return str1;
            }
            else {
                char newString = str1.charAt(0);
                return newString + alterMerge(str1.substring(1), str2.substring(1), order+1);
            }
        }
        else {
            if (str2.length() == 0){
                return str2;
            }
            else {
                char newString = str2.charAt(0);
                return newString + alterMerge(str1.substring(1), str2.substring(1), order+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        int order = scan.nextInt();
        AlternateChar aChar = new AlternateChar();
        String ans = aChar.alterMerge(str1, str2, order);
        System.out.println(ans);
    }
}
