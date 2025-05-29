package Compro.Class.BusCompany.BusCompany3;

import java.util.Scanner;

class Bus {
    public String nameBus;
    public int typeBus;
    private int seatBus;
    private int seatIncome;
    private boolean checkBus = true;

    Bus(String nameBus, int typeBus, int seatBus) {
        this.nameBus = nameBus;
        this.typeBus = typeBus;
        this.seatBus = seatBus;
    }

    boolean reserve(int K) {
        if (K < 1 || (K + seatIncome) > seatBus || checkBus == false) {
            return false;
        } else {
            seatIncome += K;
            return true;
        }
    }

    void sendToRepair() {
        checkBus = false;
    }

    void backToService() {
        checkBus = true;
    }

    void printStats() {
        // Name Bus
        System.out.println(nameBus);
        // Type Bus
        if (typeBus == 1) {
            System.out.println("Fan");
        } else if (typeBus == 2) {
            System.out.println("P1");
        } else if (typeBus == 3) {
            System.out.println("VIP");
        }
        System.out.println(seatIncome + " " + seatBus);
        // Check
        if (checkBus) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }
}

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Bus bus[] = new Bus[Q];
        for (int i = 0; i < Q; i++) {
            String nameBus = scan.next();
            int typeBus = scan.nextInt();
            int seatBus = scan.nextInt();
            bus[i] = new Bus(nameBus, typeBus, seatBus);
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            if (P == 1) {
                boolean check = false;
                for (int j = 0; j < bus.length; j++) {
                    if (bus[j].typeBus == T && bus[j].reserve(K)) {
                        System.out.println(bus[j].nameBus);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("sorry");
                }
            } else if (P == 2) {
                bus[T - 1].sendToRepair();
            } else if (P == 3) {
                bus[T - 1].backToService();
            }
        }
    }
}
