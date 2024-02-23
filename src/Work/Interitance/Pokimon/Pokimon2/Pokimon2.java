package Compro.Interitance.Pokimon.Pokimon2;

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

class Pokimon {
    PokiStats stats;
    String name;
    int level;
    int energy;
    Pokimon(PokiStats stats, String name, int level){
        this.stats = stats;
        this.name = name;
        this.level = level;
        this.energy = stats.hps[level];
    }
    int attack(){
        return stats.attks[level];
    }
    int defend(){
        return stats.defends[level];
    }
}

public class Pokimon2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];

        for (int level = 1; level <= 5; level++){
            hps[level] = scan.nextInt();
        }
        for (int level = 1; level <= 5; level++){
            attks[level] = scan.nextInt();
        }
        for (int level = 1; level <= 5; level++){
            defends[level] = scan.nextInt();
        }
        
        PokiStats stats = new PokiStats(hps, attks, defends);
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon pokimon = new Pokimon(stats, name, level);
        System.out.println(pokimon.name);
        System.out.println(pokimon.energy);
        System.out.println(pokimon.attack());
        System.out.println(pokimon.defend());
    }
}

