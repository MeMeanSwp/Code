package Work.Class.BusCompany.BusCompany2;

import java.util.Scanner;

class Bus {
    public String nameBus;
    public int typeBus;
    public int seatBus;
    public int seatIncome;
    public boolean checkBus = true;
    Bus(String nameBus, int typeBus, int seatBus){
        this.nameBus = nameBus;
        this.typeBus = typeBus;
        this.seatBus = seatBus;
    }
    boolean reserve(int K){
        if (K < 0 || (K + seatIncome) > seatBus || checkBus == false){
            return true;
        }
        else {
            seatIncome += K;
            return false;
        }
    }
    void sendToRepair(){
        checkBus = false;
    }
    void backToService(){
        checkBus = true;
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
        if (checkBus){
            System.out.println("Active");
        }
        else {
            System.out.println("Inactive");
        }
    }
}

public class BusCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameBus = scan.next();
        int typeBus = scan.nextInt();
        int seatBus = scan.nextInt();
        Bus B = new Bus(nameBus, typeBus, seatBus);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++){
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1){
                B.reserve(K);
            }
            else if (P == 2){
                B.sendToRepair();
            }
            else if (P == 3){
                B.backToService();
            }
            B.printStats();
        }
    }   
}
