package Compro.Interitance.BankAccount.BankAccount2;

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

class Saving extends Account{
    String id;
    String tel;
    boolean promptPay = false;
    Saving(String name, String code, double balance){
        super(name, code, balance);
        //Open
        System.out.println("Open account");
        //Saving
        System.out.println("Saving account");
    }
    void printInfo(){
        super.printInfo();
        if (promptPay && (id != null) || (tel != null)){
            if (id == null && tel != null){
                System.out.println("PromptPay, " + tel);
            }
            else if (id != null && tel == null){
                System.out.println("PromptPay, " + id);
            }
            else {
                System.out.println("PromptPay, " + id + ", " + tel);
            }
        }
        else {
            System.out.println("no PromptPay");
        }
    }
    boolean openPromptPay(int command, String data){
        if (command == 1){
            if (data.length() == 13){
                id = data;
                promptPay = true;
            }
            else {
                promptPay = false;
            }
        }
        if (command == 2){
            if (data.length() == 10){
                tel = data;
                promptPay = true;
            }
            else {
                promptPay = false;
            }
        }
        return promptPay;
    }
}

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account account = new Account(name, code, money);
        Saving saving = new Saving(name, code, money);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++){
            int command = scan.nextInt();
            if (command == 1){
                saving.printInfo();
            }
            else if (command == 2){
                System.out.println(saving.checkBalance());
            }
            else if (command == 3){
                saving.closeAccount();
            }
            else if (command == 4){
                double newMoney = scan.nextDouble();
                saving.deposit(newMoney);
            }
            else if (command == 5){
                double newMoney = scan.nextDouble();
                saving.withdrawn(newMoney);
            }
            else if (command == 6){
                int num = scan.nextInt();
                String data = scan.next();
                System.out.println(saving.openPromptPay(num, data));
            }
        }
    }
}
