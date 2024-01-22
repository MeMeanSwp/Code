package Work.Class;
import java.util.Scanner;

class Ethanol {
    public int intense;
    public int capacity;
    public int use;
    public int left;


    void used(int intense, int capacity, int use){
        this.intense = intense;
        this.capacity = capacity;
        this.use = use;
        this.left = (capacity - use);
        printInfo();
    }

    void printInfo(){
        if (left < 0){
            System.out.println("Ethanol " + intense + "% " + "(0ml./" + capacity + "ml.)");
        }
        else {
            System.out.println("Ethanol " + intense + "% " + "(" + left + "ml./" + capacity + "ml.)");  
        }
    }
}

public class Ethanol1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intense = scan.nextInt();
        int capacity = scan.nextInt();
        int use = scan.nextInt();
        Ethanol Ethanol = new Ethanol();
        Ethanol.used(intense, capacity, use);
    }
}
