package Compro.Interitance.Pokimon.Pokimon1;

import java.util.Scanner;

class PokiStats {
    int hps[] = new int[6];
    int attks[] = new int[6];
    int defends[] = new int[6];
    PokiStats(int hps[], int attks[], int defends[]){
        //HP
        for (int i = 0; i < hps.length; i++){
            this.hps[i] = hps[i];
        }
        //Attack
        for (int i = 0; i < hps.length; i++){
            this.attks[i] = attks[i];
        }
        //Defend
        for (int i = 0; i < hps.length; i++){
            this.defends[i] = defends[i];
        }
    }
}

public class Pokimon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PokiStats[] pokimon = new PokiStats[N];
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        for (int i = 0; i < N; i++){
            for (int level = 1; level <= 5; level++){
                hps[level] = scan.nextInt();
            }
            for (int level = 1; level <= 5; level++){
                attks[level] = scan.nextInt();
            }
            for (int level = 1; level <= 5; level++){
                defends[level] = scan.nextInt();
            }
           pokimon[i] = new PokiStats(hps, attks, defends);
        }
    }
}
