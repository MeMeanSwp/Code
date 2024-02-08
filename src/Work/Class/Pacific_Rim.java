package Work.Class;
import java.util.ArrayList;
import java.util.Scanner;

class Kaiju {
    private String name = "Unknown";
    private String category = "Unknown";
    private int hight;
    private int weight;
    private ArrayList<String> power = new ArrayList<>();
    private String details = "Unknown";

    Kaiju (String name, String category, int hight, int weight, String[] power, String details){
        this.name = name;
        this.category = category;
        this.hight = hight;
        this.weight = weight;
        for (String i : power){
            this.power.add(i);
        }
        this.details = details;
    }

    Kaiju(){

    }

    Kaiju (String name){
        this.name = name;
    }

    void PrintDetail(){
        System.out.println("Kaiju : " + name);
        System.out.println("< Category: Category " + category + " >");
        if (hight == 0){
            System.out.println("Height: Unknown");
        }
        else {
            double meters = hight / 3.2808;
            System.out.println("Height: " + hight + " feet (" + meters + " meters)");
        }
        if (weight == 0){
            System.out.println("Weight: Unknown");
        }
        else {
            System.out.println("Weight: " + weight + " tons");
        }
        if (power.size() == 0){
            System.out.println("Power: Unknown");
        }
        else {
            System.out.println("Power: ["+ power.size() + "] :");
            for (String i : power){
                System.out.println(i);
            }
        }
        System.out.println("Description: " + details);
    }
}

class Jaeger {
    private String name = "Unknown";
    private String con = "Unknown";
    private int mark;
    private double hight;
    private ArrayList<String> pilot = new ArrayList<>();
    private ArrayList<String> weapons = new ArrayList<>();

    Jaeger (String name, String con, int mark, double hight, String[] pilot, String[] weapons){
        this.name = name;
        this.con = con;
        this.mark = mark;
        this.hight = hight;
        for (String i : pilot){
            this.pilot.add(i);
        }
        for (String i : weapons){
            this.weapons.add(i);
        }
    }

    Jaeger(){
        
    }

    Jaeger (String name){
        this.name = name;
    }

    void PrintDetail(){
        System.out.println("Jaegers : " + name);
        System.out.println("< Country of Origin: " + con + " >");
        if (mark == 0){
            System.out.println("< Mark: Unknown >");
        }
        else {
            System.out.println("< Mark: Mark-" + mark + " >");
        }
        if (hight == 0){
            System.out.println("Height: Unknown");
        }
        else {
            String h = new String(Double.toString(hight));
            System.out.println("Height: " + h + " meters");
        }
        if (pilot.size() == 0){
            System.out.println("Pilots: Unknown");
        }
        else {
            System.out.println("Pilots: [" + pilot.size() + "] :");
            for (String i : pilot){
                System.out.println(i);
            }
        }
        if (weapons.size() == 0){
            System.out.println("Weapons: Unknown");
        }
        else {
            System.out.println("Weapons: [" + weapons.size() + "] :");
            for (String i : weapons){
                System.out.println(i);
            }
        }
    }
}

public class Pacific_Rim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;
        int typeK = scan.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = scan.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = scan.next();
            String Category = scan.next();
            int Height = scan.nextInt();
            int Weight = scan.nextInt();
            String strp = scan.nextLine();
            strp = scan.nextLine();
            String Power[] = strp.split(",");
            String Description = scan.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }
        int typeJ = scan.nextInt();
        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = scan.nextLine();
            String name = scan.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = scan.nextLine();
            String name = scan.nextLine();
            String CoO = scan.nextLine();
            int mark = scan.nextInt();
            double h = scan.nextDouble();
            temp = scan.nextLine();
            String str = scan.nextLine();
            String strp[] = str.split(",");
            String str2 = scan.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }
        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");
    }
}