package Compro.Interitance.AoSU.AoSU3;

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
            isBalanced(members);
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
    boolean isBalanced(Hero members[]){
        boolean carry = false;
        boolean fighter = false;
        boolean mage = false;
        boolean tank = false;
        String line = "team needs";
        for (int i = 0; i < members.length; i++){
            if (members[i] instanceof Carry){
                carry = true;
            }
            if (members[i] instanceof Fighter){
                fighter = true;
            }
            if (members[i] instanceof Mage){
                mage = true;
            }
            if (members[i] instanceof Tank){
                tank = true;
            }
        }
        if (!carry){
            line += " carry";
        }
        if (!fighter){
            line += " fighter";
        }
        if (!mage){
            line += " mage";
        }
        if (!tank){
            line += " tank";
        }
        if (members.length == 5){
            if (carry && fighter && mage && tank){
                System.out.println("balanced team");
                return true;
            }
            else {
                System.out.println(line);
                return false;
            }
        }
        else {
            return false;
        }
    }
}

class Carry extends Hero {
    Carry(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Fighter extends Hero {
    Fighter(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Mage extends Hero {
    Mage(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Tank extends Hero {
    Tank(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Support extends Hero {
    Support(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Assassin extends Hero {
    Assassin(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

public class AoSU3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero members[] = null;
        if(N > 0) {
            members = new Hero[N];
            for(int i = 0; i < N; ++i) {
                int type = scan.nextInt();
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                //Check type hero
                if (type == 1){
                    members[i] = new Carry(name, hp, attkType, attkDmg, phyDef, magDef);
                }
                else if (type == 2){
                    members[i] = new Fighter(name, hp, attkType, attkDmg, phyDef, magDef);
                }
                else if (type == 3){
                    members[i] = new Mage(name, hp, attkType, attkDmg, phyDef, magDef);
                }
                else if (type == 4){
                    members[i] = new Tank(name, hp, attkType, attkDmg, phyDef, magDef);
                }
                else if (type == 5){
                    members[i] = new Support(name, hp, attkType, attkDmg, phyDef, magDef);
                }
                else if (type == 6){
                    members[i] = new Assassin(name, hp, attkType, attkDmg, phyDef, magDef);
                }
            }
        }
        Team team = new Team(members);
        System.out.println(team.is5MemberTeam(members));
        System.out.println(team.isValid(members));
        System.out.println(team.isBalanced(members));
    }
}
