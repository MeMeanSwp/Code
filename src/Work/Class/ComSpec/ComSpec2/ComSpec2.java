package Work.Class.ComSpec.ComSpec2;

import java.util.Scanner;

class CPU {
    String model;
    int clocks;
    int socket;
    int memType;
    boolean valid;

    CPU(String model, int clocks, int socket, int memType){
        this.model =  model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
    }
    boolean isValidSpec(){
        if ((model == null) || (model.length() < 1) || (clocks < 1) || (socket < 1) || (memType < 1) || (memType > 10)){
            valid = false;
            return valid;
        }
        else {
            valid = true;
            return valid;
        }
    }
}

class MainBoard {
    String model;
    int socket;
    int memType;
    boolean valid;

    MainBoard(String model, int socket, int memType){
        this.model =  model;
        this.socket = socket;
        this.memType = memType;
    }
    boolean isValidSpec(){
        if ((model == null) || (model.length() < 1) || (socket < 1) || (memType < 1) || (memType > 10)){
            valid = false;
            return valid;
        }
        else {
            valid = true;
            return valid;
        }
    }
}

class Computer {
    CPU cpu;
    MainBoard mb;
    boolean valid;

    Computer(CPU cpu, MainBoard mb){
        this.cpu = cpu;
        this.mb = mb;
    }
    boolean isValidCom(){
        if ((cpu.socket == mb.socket) && (cpu.memType == mb.memType)){
            valid = true;
            return valid;
        }
        else {
            valid = false;
            return false;
        }
    }
    void printInfo(){
        // System.out.print(cpu.socket + " : ");
        // System.out.println(mb.socket);
        // System.out.print(cpu.memType + " : ");
        // System.out.println(mb.memType);
        if (isValidCom() && cpu.isValidSpec() && mb.isValidSpec()){
            //Model
            System.out.println(cpu.model);
            //Clocks
            System.out.println(cpu.clocks);
            //Mainbord
            System.out.println(mb.model);
            //Socket
            System.out.println(cpu.socket);
            //MemType
            System.out.println(cpu.memType);
        }
        else {
            System.out.println("Invalid Spec");
            //Model
            System.out.println(cpu.model);
            //Clocks
            System.out.println(cpu.clocks);
            //Socket
            System.out.println(cpu.socket);
            //MemType
            System.out.println(cpu.memType);

            if (cpu.isValidSpec()){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            System.out.println(mb.model);
            System.out.println(mb.socket);
            System.out.println(mb.memType);   

            if (mb.isValidSpec()){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}

public class ComSpec2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if ((model.length() == 0) && (socket % 2 == 0)){
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if ((model.length() == 0) && (socket % 2 == 0)){
            model = null;
        }
        MainBoard mb = new MainBoard(model, socket, memType);
        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}
