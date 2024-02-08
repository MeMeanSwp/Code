package Work.Class.Department.Department1;

import java.util.Scanner;

class Dept {
    public int people;
    public int student;
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;

    public Dept(int people, int student){
        computeIncome(people, student);
    }

    void computeIncome(int people, int student){
        ministryBudget = (people * 500000) + (student * 3000);
        eduFee = (student * 5000);
        serviceFee = 300000;
        donation = 100000;
    }
    void printInfo(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Dept calculate = new Dept(N, K);
        calculate.printInfo();
    }
}
