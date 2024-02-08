package Work.Class.FanCompany.FanCompany1;

import java.util.Scanner;

class Blade {
    int size;
    int number;
    int angle;
    double hp;
    boolean valid = true;
    int countTrue = 0;

    Blade(int size, int number, int angle, double hp){
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
        //Size
        if ((size >= 16) && (size <= 24) && (size % 2 == 0)){
            countTrue +=1;
        }
        else {
            System.out.println("invalid size");
            valid = false;
        }
        //Number
        if (number == 3 || number == 4 || number == 5){
            countTrue +=1;
        
        }
        else {
            System.out.println("invalid number of blades");
        }
        //Angle
        if (angle == 27 || angle == 30 || angle == 33){
            countTrue +=1;
        }
        else {
            System.out.println("invalid angle");
        }
        //HP
        if (hp > 0){
            countTrue +=1;
        }
        else {
            System.out.println("invalid horsepower");
        }
        if (countTrue == 4){
            valid = true;
        }
        else {
            valid = false;
        }
    }

    void printInfo(){
        System.out.println(size + " " + number + " " + angle + " " + hp + " " + valid);
    }
}

class Motor {
    
}

class ElectricFan {

} 

public class FanCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numb = scan.nextInt();
        int angle = scan.nextInt();
        double hp = scan.nextDouble();
        Blade ablade = new Blade(size, numb, angle, hp);
        ablade.printInfo();
    }
}
