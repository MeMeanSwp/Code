package Compro.Interitance.AoSU.AoSU2;

import java.util.Scanner;

class Hero {
    String name;
    int hp;
    int attkType;
    int attkDmg;
    int phyDef;
    int magDef;
    String type = "";
    Hero(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        this.name = name;
        this.hp = hp;
        this.attkType = attkType;
        this.attkDmg = attkDmg;
        this.phyDef = phyDef;
        this.magDef = magDef;

        if (hp < 0 || attkDmg < 0 || phyDef < 0 || magDef < 0 ){
            System.out.println("warning: value cannot be negative");
        } 
        if (attkType == 1){
            type += " (physical)";
        }
        else {
            type += " (magical)";
        }
    }
    boolean checKAndWarn(){
        if (hp < 0 || attkDmg < 0 || phyDef < 0 || magDef < 0 ){
            System.out.println("warning: value cannot be negative");
            System.out.println("warning: value cannot be negative");
            return false;
        }
        else {
            return true;
        }
    }
    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attkDmg + type);
        System.out.println("Defense: " + phyDef + " (physical), " + magDef + " (magical)");
    }
}

class Team {
    Hero members[] = null;
    Team(Hero members[]){
        if (is5MemberTeam(members) && isValid(members)){
            this.members = members.clone();
        }
    }
    boolean is5MemberTeam(Hero members[]){
        if (members.length == 5){
            System.out.println("full team");
            return true;
        }
        else if (members.length > 5){
            System.out.println("too many members");
            return false;
        }
        else {
            System.out.println("member is missing");
            return false;
        }
    }
    boolean isValid(Hero members[]){
        if (members == null || members.length < 5 || members.length > 5){
            return false;
        }
        for (int i = 0; i < 4; i++){
            String nameCheck = members[i].name;
            for (int j = i+1; j < 5; j++){
                if (nameCheck.equals(members[j].name)){
                    System.out.println("cannot select same hero: " + nameCheck);
                    return false;   
                }
            }
        }
        System.out.println("valid hero selection");
        return true;
    }
}

public class AoSU2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero members[] = null;
        if(N > 0) {
            members = new Hero[N];
            for(int i = 0; i < N; ++i) {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                members[i] = new Hero(name, hp, attkType,
                attkDmg, phyDef, magDef);
            }
        }
        Team team = new Team(members);
        System.out.println(team.is5MemberTeam(members));
        System.out.println(team.isValid(members));
    }
}
