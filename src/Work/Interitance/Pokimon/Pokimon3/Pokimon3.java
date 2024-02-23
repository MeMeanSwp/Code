package Compro.Interitance.Pokimon.Pokimon3;

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

class WaterPokimon extends Pokimon{
    WaterPokimon(PokiStats stats, String name, int level){
        super(stats, name, level);
    }
    int attack(WaterPokimon opponent){
        return attack();
    }
    int attack(FirePokimon opponent){
        return attack() * 2;
    }
    int attack(ElectricPokimon opponent){
        return attack();
    }
}

class FirePokimon extends Pokimon {
    FirePokimon(PokiStats stats, String name, int level){
        super(stats, name, level);
    }
    int attack(WaterPokimon opponent){
        return attack();
    }
    int attack(FirePokimon opponent){
        return attack();
    }
    int attack(ElectricPokimon opponent){
        return attack() * 2;
    }
}

class ElectricPokimon extends Pokimon {
    ElectricPokimon(PokiStats stats, String name, int level){
        super(stats, name, level);
    }
    int attack(WaterPokimon opponent){
        return attack() * 2;
    }
    int attack(FirePokimon opponent){
        return attack();
    }
    int attack(ElectricPokimon opponent){
        return attack();
    }
}

public class Pokimon3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;
        for (int type = 1; type <= 3; type++){
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
            if (type == 1){
                water = new WaterPokimon(stats, name, level);
            }
            else if (type == 2){
                fire = new FirePokimon(stats, name, level);
            }
            else if (type == 3){
                electric = new ElectricPokimon(stats, name, level);
            }
        }
        System.out.println(water.attack(water) + " " + water.attack(fire) + " " + water.attack(electric));
        System.out.println(fire.attack(water) + " " + fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " " + electric.attack(fire) + " " + electric.attack(electric));
    }
}

