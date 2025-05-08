package Compro.Class.PiggyHouse;

import java.util.Scanner;

class House {
    public int W;
    public int L;
    public int totalPig = 0;  

    House(int W, int L) {
        this.W = W;
        this.L = L;
    }

    void printPiggies() {
        System.out.println("Piggies " + totalPig + ", Space " + (totalPig * 9));
    }

    static void encourage() {
        System.out.println("Piggy Together STRONG!");
    }
} 

public class PiggyHouse1 {
    public static void main(String[] args) {
        House.encourage();
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int L = scan.nextInt();
        House H = new House(W, L);

        while(true) {
            int K = scan.nextInt();
            if (9 * (K + H.totalPig) <= (H.W * H.L)) {
                H.totalPig += K;
                H.printPiggies();
            } else {
                System.out.println("no space, need a new house");
                break;
            }
        }
    }
}
