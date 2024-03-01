package Compro.Recursion;

import java.util.Scanner;

public class MinMerge {   
    String Merge(String str1, String str2){
        if (str1.length() == 0){
            return str2;
        }
        if (str2.length() == 0){
            return str1;
        }
        if (str1.charAt(0) <= str2.charAt(0)){
            char evoString = str1.charAt(0);
            return evoString + Merge(str1.substring(1), str2.substring(1));
        }
        else {
            char evoString = str2.charAt(0);
            return evoString + Merge(str1.substring(1), str2.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        MinMerge merge = new MinMerge();
        System.out.println(merge.Merge(str1, str2));
    }
}
