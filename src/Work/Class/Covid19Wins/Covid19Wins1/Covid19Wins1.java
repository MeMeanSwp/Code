package Compro.Class.Covid19Wins.Covid19Wins1;

import java.util.Scanner;

class Visitation {
    int id;
    int date;
    int hours[] = new int[24];
    int totalHours = 0;

    Visitation(int id, int date){
        this.id = id;
        this.date = date;
    }
    void visit (int clock){
        if (clock < 0 || clock > 23){
            System.out.println("invalid hour: " + clock);
        }
        else {
            hours[clock] = clock+1;
            totalHours +=1;
        }
    }
    int count(){
        return totalHours;
    }
    void printVisitHours(){
        //ID location
        System.out.println(id);
        //Date
        System.out.println(date);
        //How much
        System.out.println(count());
        
        if (count() == 0){
            System.out.println("no visit");
        }
        else {
            for (int i = 0; i < hours.length; i++){
                if (hours[i] > 0){
                    System.out.print((hours[i] - 1) + " ");
                }
            }
        }
    }
}

public class Covid19Wins1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        int date = scan.nextInt();
        int K = scan.nextInt();
        Visitation v = new Visitation(id, date);
        for (int i = 0; i < K; i++){
            int hours = scan.nextInt();
            v.visit(hours);
        }
        v.printVisitHours();
    }
}