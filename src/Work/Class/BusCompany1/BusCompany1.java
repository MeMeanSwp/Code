package Work.Class.BusCompany1;

import java.util.Scanner;

class Bus {
    public String nameBus;
    public int typeBus;
    public int seatBus;
    public int seatIncome;
    Bus(String nameBus, int typeBus, int seatBus){
        this.nameBus = nameBus;
        this.typeBus = typeBus;
        this.seatBus = seatBus;
    }
    void printStats(){
        //Name Bus
        System.out.println(nameBus);
        //Type Bus
        if (typeBus == 1){
            System.out.println("Fan");
        }
        else if (typeBus == 2){
            System.out.println("P1");
        }
        else if (typeBus == 3){
            System.out.println("VIP");
        }
        System.out.println(seatIncome + " " + seatBus);
        //Check
        System.out.println("Active");
    }
}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameBus = scan.next();
        int typeBus = scan.nextInt();
        int seatBus = scan.nextInt();
        Bus B = new Bus(nameBus, typeBus, seatBus);
        B.printStats();
    }   
}
