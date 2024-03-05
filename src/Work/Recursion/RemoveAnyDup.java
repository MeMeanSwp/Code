package Compro.Recursion;

import java.util.Scanner;

public class RemoveAnyDup {
    String removeAnyDup(String str){
        if (str.length() <= 1){
            return str;
        }
        else {
            String newStr = str.substring(0, str.length()-1);
            String endStr = str.substring(str.length()-1, str.length());
            if (newStr.indexOf(endStr) == -1){
                return removeAnyDup(newStr) + endStr;
            }
            else {
                return removeAnyDup(newStr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remove = new RemoveAnyDup();
        String result = remove.removeAnyDup(str);
        System.out.println(result);
    }
}
