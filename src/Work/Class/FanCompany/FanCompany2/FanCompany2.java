package Work.Class.FanCompany.FanCompany2;

import java.util.Scanner;

class Blade {
    int size;
    int number;
    int angle;
    double hp;
    boolean valid = true;

    Blade(int size, int number, int angle, double hp){
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
    }
}

class Motor{
    double V, I, eff;
    double hp;

    Motor(double V,double I, double eff){
        this.V = V;
        this.I = I;
        this.eff = (eff/100);
    }

    Motor(double I,double eff){
        this.V = 220;
        this.I = I;
        this.eff = (eff/100);
    }

    double horsepower(){
        hp = (V * I * eff) / 746;
        return hp;
    }

    void printInfo(){
        hp = horsepower();
        System.out.println(V + " " + I + " " +eff+" " +
        String.format("%.2f", hp));
    }
}

class ElectricFan {

} 

public class FanCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v = scan.nextDouble();
        double i = scan.nextDouble();
        double eff = scan.nextDouble();
        Motor motor = null;
        if (v == 220) {
            motor = new Motor(i, eff);
        }
        else {
            motor = new Motor(v,i,eff);
        }
        motor.printInfo();
    }
}
