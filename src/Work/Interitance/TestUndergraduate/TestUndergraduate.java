package Compro.Interitance.TestUndergraduate;

import java.util.Scanner;

class Student {
    public String firstName;
    public String lastName;
    private int stepScore[];

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stepScore = new int[5];
    }

    int getTestScore(int round) {
        return stepScore[round];
    }

    void setTestScore(int round, int score) {
        stepScore[round] = score;
    }

    int computeTotal() {
        int score = 0;
        for (int i = 1; i <= 4; i++) {
            score += stepScore[i];
        }
        return score;
    }

    void printInfo() {
        System.out.println(firstName + " " + lastName + " " + computeTotal());
    }
}

class Undergraduate extends Student {
    public int id;
    private String stepLevel;
    private boolean engPass;

    Undergraduate(int id, String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
        this.stepLevel = "";
        this.engPass = false;
    }

    String computeLevel() {
        if (super.computeTotal() >= 76 && super.computeTotal() <= 120) {
            engPass = true;
            System.out.print("Pass ");
        } 
        else if (super.computeTotal() <= 75 && super.computeTotal() >= 1) {
            engPass = false;
            System.out.print("Not pass ");
        } 
        else {
            for (int i = 1; i <= 4; i++) {
                super.setTestScore(i, 0);
            }
            stepLevel = "NA";
            System.out.print("Invalid score ");
            return stepLevel;
        }
        if (super.computeTotal() >= 1 && super.computeTotal() <= 25) {
            stepLevel = "A1";
        } 
        else if (super.computeTotal() >= 26 && super.computeTotal() <= 50) {
            stepLevel = "A2";
        } 
        else if (super.computeTotal() >= 51 && super.computeTotal() <= 75) {
            stepLevel = "B1";
        } 
        else if (super.computeTotal() >= 76 && super.computeTotal() <= 100) {
            stepLevel = "B2";
        } 
        else if (super.computeTotal() >= 101 && super.computeTotal() <= 120) {
            stepLevel = "C1";
        }
        return stepLevel;
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(computeLevel());
    }
}

public class TestUndergraduate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Undergraduate roster[] = new Undergraduate[N];
        for (int i = 0; i < N; i++) {
            int id = scan.nextInt();
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Undergraduate(id, fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score);
            }
        }   
        boolean found = false;
        int rosterId = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if (rosterId == roster[i].id) {
                System.out.print(rosterId + " ");
                roster[i].printInfo();
                for (int j = 1; j <= 4; j++) {
                    System.out.print(roster[i].getTestScore(j) + " ");  
                }
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
