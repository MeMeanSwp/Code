package Work.Class.Department2;

import java.util.Scanner;

class Dept {
    public int people;
    public int student;
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;
    public int salary;
    public int elec;
    public int eduCost;
    public int total_income;
    public int total_expense;
    public int diff;

    public Dept(int people, int student){
        computeIncome(people, student);
    }

    void computeIncome(int people, int student){
        ministryBudget = (people * 500000) + (student * 3000);
        eduFee = (student * 5000);
        serviceFee = 300000;
        donation = 100000;
        salary = (people * 600000);
        elec = (people + student) * 2000;
        eduCost = (student * 4000);
        total_income = (ministryBudget + eduFee + serviceFee + donation);
        total_expense = (salary + elec + eduCost);
        diff = (total_income - total_expense);
    }
    void printInfo(){
        System.out.println("total income = " + total_income);
        System.out.println("total expense = " + total_expense);
        System.out.println("income - expense = " + diff);
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Dept calculate = new Dept(N, K);
        calculate.printInfo();
    }
}
