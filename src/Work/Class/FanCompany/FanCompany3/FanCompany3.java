package Work.Class.FanCompany.FanCompany3;

import java.util.Scanner;

class Blade {
    int size;
    int number;
    int angle;
    double hp;

    Blade(int size, int number, int angle, double hp){
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
    }
}

class Motor {
    double V, I, eff;
    double hp;

    Motor(double V, double I, double eff){
        this.V = V;
        this.I = I;
        this.eff = eff/100;
    }

    Motor(double I, double eff){
        this.V = 220;
        this.I = I;
        this.eff = eff/100;
    }

    double horsepower(){
        hp = (V * I * eff) / 746;
        return hp;
    }
}

class ElectricFan {
    int productID;
    Blade blade;
    Motor motor;
    boolean status = false;
    static int count = 0;

    ElectricFan(Blade blade, Motor motor){
        ElectricFan.count+=1;
        this.productID = ElectricFan.count;
        this.blade = blade;
        this.motor = motor;

        if (motor.horsepower() >= blade.hp){
            status = true;
        }
        else {
            status = false;
        }
    }

    boolean changeBlade(Blade blade){
        this.blade = blade;
        if (this.motor.horsepower() >= blade.hp){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }

    boolean changeMotor(Motor motor){
        this.motor = motor;
        if (motor.horsepower() >= this.blade.hp){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }

    void printInfo(){
        String line = String.format("%d %d %s %s %.2f %s", this.productID, this.blade.size, this.blade.hp, this.motor.I, this.motor.horsepower(), status);
        System.out.println(line);
    }
}

public class FanCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        for (int index = 0; index < N; index++){
            int cmd = scan.nextInt();
            if (cmd == 0){
                size = scan.nextInt();
                numb = scan.nextInt();
                angle = scan.nextInt();
                hp = scan.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = scan.nextDouble();
                i = scan.nextDouble();
                eff = scan.nextDouble();
                motor = new Motor(v, i , eff);
                eFan = new ElectricFan(ablade, motor);
            }
            else if (cmd == 1){
                size = scan.nextInt();
                numb = scan.nextInt();
                angle = scan.nextInt();
                hp = scan.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                eFan.changeBlade(ablade);
            }
            else if (cmd == 2){
                v = scan.nextDouble();
                i = scan.nextDouble();
                eff = scan.nextDouble();
                motor = new Motor(v, i , eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
    }
}

