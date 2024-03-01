package Compro.Recursion;

import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str){
        int length = str.length();
        if (str.length() <= 1){
            return str;
        }
        if (str.charAt(length-1) == str.charAt(length-2)){
            return dupRemove(str.substring(0, length-1));
        }
        return dupRemove(str.substring(0, length-1)) + str.charAt(length-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = new ConsecDupRemoval().dupRemove(str);
        System.out.println(result);
    }   
}
