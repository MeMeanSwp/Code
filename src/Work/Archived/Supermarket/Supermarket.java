package Compro.Archived.Supermarket;

import java.util.ArrayList;
import java.util.Scanner;

class Basket {
    int grape, melon, apple, cherry, pear, kiwi;
    int price;
    int weight;
    int type = 0;
    Basket(int grape, int melon, int apple, int cherry, int pear, int kiwi){
        this.grape = grape;
        this.melon = melon;
        this.apple = apple;
        this.cherry = cherry;
        this.pear = pear;
        this.kiwi = kiwi;   
        //Price
        price = (grape*120) + (melon*200) + (apple*90) + (cherry*180) + (pear*60) + (kiwi*150);
        weight = (grape*500) + (melon*2000) + (apple*300) + (cherry*350) + (pear*400) + (kiwi*500);
        if (grape > 0){type +=1;}
        if (melon > 0){type +=1;}
        if (apple > 0){type +=1;}
        if (cherry > 0){type +=1;}
        if (pear > 0){type +=1;}
        if (kiwi > 0){type +=1;}
    }
}

class FruitSection {
    ArrayList<Basket> Basket = new ArrayList<>();
    Basket B;
    int maxPrice;
    int maxWeight;
    int totalPrice = 0;
    FruitSection(int maxPrice, int maxWeight){
        this.maxPrice = maxPrice;
        this.maxWeight = maxWeight;
    }
    boolean check(Basket B){
        if (B.price >= 500 && B.price < maxPrice && B.weight >= 2000 && B.weight < (maxWeight*1000) && B.type >= 3){
            return true;
        }
        return false;
    }
    void addBasket(Basket B){
        if (check(B)){
            Basket.add(B);
        }
    }
    void printBasket(int pos){
        if (pos < 0 || pos >= Basket.size()){
            System.out.println("invalid");
        }
        else {
            System.out.println(Basket.get(pos).grape + " " + Basket.get(pos).melon + " " + Basket.get(pos).apple
            + " " + Basket.get(pos).cherry + " " + Basket.get(pos).pear + " " + Basket.get(pos).kiwi + ", "
            + Basket.get(pos).price + " " + Basket.get(pos).weight + " " + Basket.get(pos).type);
        }
    }
    void printAvailable(){
        if (Basket.size() <= 0){
            System.out.println("nothing to sell");
        }
        else {
            for (int i = 0; i < Basket.size(); i++){
                printBasket(i);
            }
        }
    }
    void sellBasket(int pos){
        if (pos < 0 || pos >= Basket.size()){
            System.out.println("invalid");
        }
        else {
            System.out.println("sell basket " + (pos+1) + " " + Basket.get(pos).price);
            totalPrice += Basket.get(pos).price;
            Basket.remove(pos);
        }
    }
}

public class Supermarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        int weight = scan.nextInt();
        FruitSection fs = new FruitSection(price, weight);
        while (true) {
            int grape = scan.nextInt(); 
            int melon = scan.nextInt(); 
            int apple = scan.nextInt(); 
            int cherry = scan.nextInt(); 
            int pear = scan.nextInt(); 
            int kiwi = scan.nextInt();
            Basket B = new Basket(grape, melon, apple, cherry, pear, kiwi);
            if (B.type == 0){break;}
            else {
                fs.addBasket(B);
            }
        }
        while (true) {
            String command = scan.next();
            if (command.equals("stop")){
                System.out.println("income: " + fs.totalPrice);
                break;
            }
            else if (command.equals("printAll")){
                fs.printAvailable();
            }
            else if (command.equals("print")){
                int pos = scan.nextInt();
                fs.printBasket(pos-1);
            }
            else if (command.equals("sell")){
                int pos = scan.nextInt();
                fs.sellBasket(pos-1);
            }
        }
    }
}
