package Work.Class.Marathon1;

import java.util.Scanner;

class Runner {
    public String name;
    public String BIB;
    public int totalRunner = 0;
    public int numRunner;
    public int typeRun;
    public boolean print = false;
    Runner(String name, int typeRun, int numRunner){
        this.name = name;
        this.typeRun = typeRun;
        this.numRunner = numRunner;
    }
    
    boolean printInfo(){
        totalRunner = numRunner;
        if (typeRun == 1){
            BIB = "A";
            totalRunner +=1;
        }
        else if (typeRun == 2){
            BIB = "B";
            totalRunner +=1;
        }
        else if (typeRun == 3){
            BIB = "C";
            totalRunner +=1;
        }
        else if (typeRun == 4){
            BIB = "D";
            totalRunner +=1;
        }
        else {
            BIB = "INVALID";
            print = true;
        }
        if (print){
            System.out.println(BIB);
            return true;
        }
        else {
            System.out.print(BIB);
    
            if (totalRunner < 10){
                System.out.print("00");
            }
            else if (totalRunner > 9){
                System.out.print("0");
            }
            System.out.println(totalRunner + " " + name);
            return false;
        }
    }
}

public class Marathon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int numRunner = 0;
        for (int i = 0; i < N; i++){
            String name = scan.next();
            int typeRun = scan.nextInt();
            Runner run = new Runner(name, typeRun, numRunner);
            if (!run.printInfo()){
                numRunner +=1;
            }
        }
    }
}
