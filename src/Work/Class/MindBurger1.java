package Work.Class;

import java.util.Scanner;

class Burger {
    public String meat;
    public boolean lettuce, tomato, pickled;
    public int numCheese;
    public double price;

    Burger(String meat, boolean lettuce, boolean tomato, boolean pickled, int numCheese){
        this.meat = meat+"BURGER";
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickled = pickled;
        if (numCheese<0) this.numCheese = 0;
        else if (numCheese>3) this.numCheese = 3;
        else this.numCheese = numCheese;
        this.price = 49+(20*this.numCheese);
    }

    void printInfo(){
        System.out.print(meat);
        if (lettuce) System.out.print(" lettuce");
        if (tomato) System.out.print(" tomato");
        if (pickled) System.out.print(" pickled");
        System.out.print(" cheese"+this.numCheese);
        System.out.print(" = $"+price);
        }
}

public class MindBurger1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String meatorder = sc.next();
        String veg = sc.next();
        int n = sc.nextInt();
        boolean flag_lettuce = (veg.charAt(0) == 'Y'?true:false);
        boolean flag_tomato = (veg.charAt(1) == 'Y'?true:false);
        boolean flag_pickled = (veg.charAt(2) == 'Y'?true:false);
        Burger b = new Burger(meatorder, flag_lettuce, flag_tomato, flag_pickled, n);
        b.printInfo();
    }
}
