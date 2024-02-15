package Compro.Interitance.AnimalDomain.AnimalDomain2;

import java.util.Scanner;
import java.util.ArrayList;

class Animal {
    String name;
    int lifeExpect;
    int age = 0;
    Animal(String name, int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        System.out.println(name + " was born with life expectancy " + lifeExpect + " year(s)");
    }
    void live(int year){
        if (age == lifeExpect){
            System.out.println(name + " died earlier");
        }
        else if (year + age < lifeExpect){
            if (year == 1){
                System.out.println(name + " lived " + year + " more year");
                age += year;
            }
            else {
                System.out.println(name + " lived " + year + " more years");
                age += year;
            }
        }
        else {
            if (lifeExpect - age == 1){
                System.out.println(name + " lived 1 more year and died");
            }
            else {
                System.out.println(name + " lived " + (lifeExpect - age) + " more years and died");
            }
            age = lifeExpect;
        }
    }
    boolean isAlive(){
        if (age == lifeExpect){
            System.out.println(name + " is dead");
            return false;
        }
        else {
            System.out.println(name + " is alive");
            return true;
        }
    }
    void vaccine(){
        System.out.println(name + "'s life expectancy is now " + lifeExpect + " year(s)");
    }
}

class Dog extends Animal {
    boolean checkVaccine = false;
    Dog(String name){
        super(name, 8);
    }
    void vaccine(){
        if (!checkVaccine){
            int vaccine = (this.lifeExpect - this.age);
            this.lifeExpect += vaccine;
            checkVaccine = true;
        }
        super.vaccine();
    }
}

class Turtle extends Animal {
    Turtle(String name){
        super(name, 50);
    }
}

class Salmon extends Animal {
    Salmon(String name){
        super(name, 4);
    }
}

public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Animal> array = new ArrayList<>();
        for(int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if(type == 1) {
                int t = scan.nextInt();
                String name = scan.next();
                if (t == 1){
                    Animal animal = new Dog(name);
                    array.add(animal);
                }
                else if (t == 2){
                    Animal animal = new Turtle(name);
                    array.add(animal);
                }
                else if (t == 3){
                    Animal animal = new Salmon(name);
                    array.add(animal);
                }
            } 
            else if(type == 2) {
                int id = scan.nextInt();
                int year = scan.nextInt();
                Animal animal = array.get(id - 1);
                animal.live(year);
            } 
            else if(type == 3) {
                int id = scan.nextInt();
                Animal animal = array.get(id - 1);
                animal.isAlive();
            }
            else if(type == 4) {
                int id = scan.nextInt();
                Animal animal = array.get(id - 1);
                animal.vaccine();
            }
        }
    }
}