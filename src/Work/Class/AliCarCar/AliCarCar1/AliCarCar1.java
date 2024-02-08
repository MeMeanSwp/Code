package Work.Class.AliCarCar.AliCarCar1;

import java.util.Scanner;

class Car {
    int code;
    String nameCar;
    int price;
    int labor; 
    Car(int code, String nameCar, int price, int labor){
        this.code = code;
        this.nameCar = nameCar;
        this.price = price;
        this.labor = labor;
    }
    boolean cheack(){
        if ((nameCar.length() > 0) && (price > 0) && (labor > 0)){
            return true;
        }
        else {
            return false;
        }
    }
}

public class AliCarCar1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N];
        for (int i = 0; i < N; i++){
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            cars[i] = new Car(i, name, price, labor);
            if (cars[i].cheack()){
                System.out.println("valid");
            } 
            else {
                System.out.println("invalid");
            }
        }
        int k = 0;
        for (int i = 0; i < N; i++){
            if (cars[i].cheack()){
                k+=1;
                System.out.println(k + " " + cars[i].nameCar);
            }
        }
    }
}




