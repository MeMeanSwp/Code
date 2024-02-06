package Work.Class.ProductShipping2;

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

public class ProductShipping2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for(int i = 0; i < n; i++){
            String name = scan.next();
            int weight = scan.nextInt();
            int price = scan.nextInt();
            products[i] = new Product(name,weight,price);
            amount[i] = scan.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n,products, amount);
        po.printInfo();
    }
}
