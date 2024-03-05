package Compro.Recursion;

import java.util.Scanner;

public class KeepTwo {
    String keepTwo(String str){
        if (str.length() <= 1){
            return str;
        }
        else {
            String String = str.substring(0, str.length()-1);
            char lastStr = str.charAt(str.length()-1);
            if (String.indexOf(lastStr) == String.lastIndexOf(lastStr)){
                return keepTwo(String) + lastStr;
            }
            else {
                return keepTwo(String);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String ans = kt.keepTwo(str);
        System.out.println(ans);
    }   
}
