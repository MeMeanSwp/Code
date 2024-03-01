package Compro.Recursion;

import java.util.Scanner;

public class BaseConverter {
    String convertBase(int decimal, int base){
        String num = "";
        if (decimal < 1){
            return num;
        }
        else {
            int allNum = decimal % base;
            int newNum = decimal / base;
            num += allNum;
            return convertBase(newNum, base) + num;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        int base = scan.nextInt();
        BaseConverter bc = new BaseConverter();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
    }
}
