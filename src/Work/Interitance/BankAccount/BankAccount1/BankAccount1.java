package Compro.Interitance.BankAccount.BankAccount1;

import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active = true;
    Account(String name, String code, double balance){
        this.name = name;
        this.code = code;
        this.balance = balance;
        //Open
        System.out.println("Open account");
    }
    void printInfo(){
        if (active){
            System.out.println(name + ", " + code + ", " + balance + ", active");
        }
        else {
            System.out.println(name + ", " + code + ", " + balance + ", inactive");
        }
    }
    double checkBalance(){
        return balance;
    }
    void closeAccount(){
        if (active){
            active = false;
            printInfo();
        }
    }
    boolean deposit(double money){
        if (active){
            balance += money;
            System.out.println(balance + " " + active);
            return true;
        }
        return false;
    }
    boolean withdrawn(double money){
        if (active && (balance - money >= 0)){
            balance -= money;
            System.out.println(balance + " " + active);
            return true;
        }
        else {
            System.out.println("false");
        }
        return false;
    }
}

public class BankAccount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account account = new Account(name, code, money);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++){
            int command = scan.nextInt();
            if (command == 1){
                account.printInfo();
            }
            else if (command == 2){
                System.out.println(account.checkBalance());
            }
            else if (command == 3){
                account.closeAccount();
            }
            else if (command == 4){
                double newMoney = scan.nextDouble();
                account.deposit(newMoney);
            }
            else if (command == 5){
                double newMoney = scan.nextDouble();
                account.withdrawn(newMoney);
            }
        }
    }
}
