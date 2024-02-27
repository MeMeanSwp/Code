package Compro.Interitance.RolePlayingGame;

import java.util.Scanner;

class GameCharacter {
    String name;
    int attack;
    int defense;
    int level;

    void stat(){
        System.out.println(name + " " + level + " " + attack + " " + defense);
    }
}

class Hero extends GameCharacter {
    Hero(String name){
        this.name = name;
        this.attack = 10;
        this.defense = 5;
        this.level = 1;
    }
    void hit(Monster monster){
        int exp = (monster.score / 100);
        this.level += exp;
        this.attack += (exp * 3);
        this.defense += (exp * 2);
    }
}

class Monster extends GameCharacter {
    int score;
    Monster(String name, int level, int score){
        this.name = name;
        this.level = level;
        this.score = score;
        this.attack = (level * 2);
        this.defense = (level * 3);
    }
}

public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        Hero hero[] = new Hero[H];
        for (int i = 0; i < H; i++){
            String name = scan.next();
            hero[i] = new Hero(name);
        }
        int M = scan.nextInt();
        Monster monster[] = new Monster[M];
        for (int i = 0; i < M; i++){
            int level = scan.nextInt();
            int score = scan.nextInt();
            String name = Integer.toString(i+1);
            monster[i] = new Monster(name, level, score);
        }
        int N = scan.nextInt();
        boolean checkAlive[] = new boolean[M];
        for (int i = 0; i < M; i++){
            checkAlive[i] = true;
        }
        for (int i = 0; i < N; i++){
            int numHero = scan.nextInt();
            int numMonster = scan.nextInt();
            if (checkAlive[numMonster - 1]){
                hero[numHero - 1].hit(monster[numMonster - 1]);
                checkAlive[numMonster - 1] = false;
            }
        }
        for (int i = 0; i < H; i++){
            hero[i].stat();
        }
    }
}
