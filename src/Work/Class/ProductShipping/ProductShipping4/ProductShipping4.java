package Compro.Class.ProductShipping.ProductShipping4;

import java.util.Scanner;

class Product {
    String name;
    int weight;
    int price;

    Product(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    String grtName(){
        return name;
    }

    int getWieght(){
        return weight;
    }

    int getPrice(){
        return price;
    }
}

class PurchaseOrder {
    int numItem;
    Product product[];
    int amount[];
    int totalPrice;
    int totalWieght;

    PurchaseOrder(int numItem, Product product[], int amount[]){
        this.numItem = numItem;
        this.product = product;
        this.amount = amount;
        //Calculate Price and Wieghht
        for (int i = 0; i < numItem; i++){
            totalPrice += (amount[i] * product[i].getPrice());
            totalWieght += (amount[i] * product[i].getWieght());
        }
    }
    void printInfo(){
        System.out.println(numItem + " items = " + totalPrice + " baht " + totalWieght + " grams");
        
        for(int i = 0; i < numItem; i++){
            System.out.println(product[i].grtName() + " " + amount[i] + "x" + product[i].getPrice() + " = " + (amount[i] * product[i].getPrice()));
        }
    }
}

class Truck {
    int capacity;
    int card;
    int station;
    double cost;
    double totalCost;
    PurchaseOrder order;
    Truck(int capacity){
        this.capacity = capacity;
        this.station = 0;
        this.cost = 0;
    }
    void add(PurchaseOrder order, int station){
        this.order = order;
        this.station = station;
        setFee();
    }
    void setFee(){
        this.cost = (order.totalWieght * station / 1000.0);
    }
    double getFee(){
        this.totalCost += cost;
        return totalCost;
    }
}

class SpecialTruck extends Truck{
    SpecialTruck(int capacity){
        super(capacity);
    }
    @Override
    void setFee() {
        this.cost = 2 * (order.totalWieght * station / 1000.0);
    }
}

public class ProductShipping4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        Truck truck[] = new Truck[m];
        for (int i = 0; i < m; i++){
            int capacity = scan.nextInt();
            int type = scan.nextInt();
            if (type == 1){
                truck[i] = new Truck(capacity);
            }
            else {
                truck[i] = new SpecialTruck(capacity);
            }
        }
        int n = scan.nextInt();
        int station = scan.nextInt();
        Product product[] = new Product[n];
        int amount[] = new int[n];
        for (int i = 0; i < n; i++){
            String name = scan.next();
            int weight = scan.nextInt();
            int price = scan.nextInt();
            product[i] = new Product(name, weight, price);
            amount[i] = scan.nextInt();
        }
        PurchaseOrder order = new PurchaseOrder(n, product, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++){
            if (truck[i].capacity >= order.totalWieght && minvalue > truck[i].capacity){
                minvalue = truck[i].capacity;
                minIndex = i;
            }
        }
        if (minIndex >= 0){
            truck[minIndex].add(order, station);
            System.out.println("Truck#" + minIndex + 1);
            System.out.println("Fee=" + truck[minIndex].getFee());
        }
        else {
            System.out.println("No truck");
            double fee = (order.totalWieght * station / 1000.0);
            System.out.println("Fee=" + fee + " " + (2 * fee));
        }
    }
}
