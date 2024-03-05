package Compro.Recursion;

import java.util.Scanner;

public class GoInside {
    String goInSide(String str, boolean front){
        if (str.length() <= 1){
            return str;
        }
        else {
            if (front){
                char first = str.charAt(0);
                char last = str.charAt(str.length()-1);
                return first + "" + last + goInSide(str.substring(1, str.length()-1), false);
            }
            else {
                char first = str.charAt(0);
                char last = str.charAt(str.length()-1);
                return last + "" + first + goInSide(str.substring(1, str.length()-1), true);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside go = new GoInside();
        String ans = go.goInSide(str, true);
        System.out.println(ans);
    }
}
