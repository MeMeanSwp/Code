package Work.Class.ComSpec.ComSpec1;

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
        if (model == null || model.length() < 1 || clocks < 1 || socket < 1 || memType < 1 || memType > 10){
            valid = false;
            return valid;
        }
        else {
            valid = true;
            return valid;
        }
    }
    void printInfo(){
        //Model
        System.out.println(model);
        //Clocks
        System.out.println(clocks);
        //Socket
        System.out.println(socket);
        //MemType
        System.out.println(memType);
        //Valid
        System.out.println(isValidSpec());
    }
}

public class ComSpec1 {
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
        cpu.printInfo();
    }
}
