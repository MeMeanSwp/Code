package Compro.Recursion;

import java.util.Scanner;

public class CutHalfRecursive {
    public static String cutHalf(String str){
        if (str.length() <= 1){
            return str;
        }
        else {
            String front = str.substring(0, str.length() / 2);
            String back = str.substring((str.length() / 2) + 1, str.length());
            char mid = str.charAt(str.length() / 2);
            return mid + cutHalf(front) + cutHalf(back);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
    }
}
