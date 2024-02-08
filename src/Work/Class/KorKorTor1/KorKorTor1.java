package Work.Class.KorKorTor1;

import java.util.Scanner;

class Party {
    public String partyName;
    public int numMember;
    public String firstName[];
    public String lastName[];
    public int regionNumber[];

    Party(String partyName, int numMember, Scanner scan) {
        this.partyName = partyName;
        this.numMember = numMember;
        firstName = new String[numMember];
        lastName = new String[numMember];
        regionNumber = new int[numMember];
        for (int i = 0; i < numMember; i++) {
            firstName[i] = scan.next();
            lastName[i] = scan.next();
            regionNumber[i] = scan.nextInt();
        }
    }

    void printInfo(int regionNumber){
        if (regionNumber < 0){
            System.out.println("invalid region number");
            return;
        }
        if (regionNumber == 0){
            for (int i = 0; i < this.numMember; i++){
                System.out.println(this.firstName[i] + " " + this.lastName[i] + " " + this.regionNumber[i]);
            }
            return;
        }
        boolean print = false;
        for (int i = 0; i < this.numMember; i++){
            if (this.regionNumber[i] == regionNumber){
                System.out.println(this.firstName[i] + " " + this.lastName[i]);
                print = true;
            }
        }
        if (!print){
            System.out.println("none");
        }
    }
}

public class KorKorTor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] partyNames = new String[N];
        int[] numMembers = new int[N];
        for (int i = 0; i < N; ++i) {
            partyNames[i] = scan.next();
            numMembers[i] = scan.nextInt();
        }
        Party[] parties = new Party[N];
        for (int i = 0; i < N; ++i) {
            parties[i] = new Party(partyNames[i], numMembers[i], scan);
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt() - 1;
            int regionNumber = scan.nextInt();
            parties[partyNumber].printInfo(regionNumber);
        }
    }
}
