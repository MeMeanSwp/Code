package Work.Class.ZooTicket2;
import java.util.Scanner;

class ZooTicket {
    private String name;
    private boolean ride, seal, tiger;

    ZooTicket(String name){
        this.name = name;
    }

    void bookRide(){
        this.ride = true;
    }

    void bookSealShow(){
        this.seal = true;
    }

    void bookTigerShow(){
        this.tiger = true;
    }

    
    void summarize(){
        System.out.println(this.name);
        //Cost
        int cost = 100;
        if (this.ride){
            System.out.println("Ride");
            cost += 40;
        }
        if (this.seal){
            System.out.println("Seal");
            cost += 50;
        }
        if (this.tiger){
            System.out.println("Tiger");
            cost += 65;
        }
        System.out.println(cost);
    }

    boolean useRide(){
        if (this.ride){
            this.ride = false;
            System.out.println("okay");
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }    
    }

    boolean enterSealShow(){
        if (this.seal){
            this.seal = false;
            System.out.println("okay");
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }

    boolean enterTigerShow(){
        if (this.tiger){
            this.tiger = false;
            System.out.println("okay");
            return true;
        }
        else {
            System.out.println("no");
            return false;
            
        }
    }
}

public class ZooTicket2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int service = scan.nextInt();

        ZooTicket zooticket = new ZooTicket(name);
        for (;;){
            if (service == 0){
                break;
            }
            if (service == 1){
                zooticket.bookRide();
            }
            else if (service == 2){
                zooticket.bookSealShow();
            }
            else if (service == 3){
                zooticket.bookTigerShow();
            }
            service = scan.nextInt();
        }
        zooticket.summarize();
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++){
            int use = scan.nextInt();
            if (use == 1){
                System.out.println(zooticket.useRide());              
            }
            else if (use == 2){
                System.out.println(zooticket.enterSealShow());
            }
            else if (use == 3){
                System.out.println(zooticket.enterTigerShow());
            }
        }  
    }
}