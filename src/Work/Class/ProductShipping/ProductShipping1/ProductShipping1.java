package Work.Class.ProductShipping.ProductShipping1;

import java.util.Scanner;

class Product{
    String nameProduct;
    int weight;
    int price;

    Product(String name, int weight, int price){
        this.nameProduct = name;
        this.weight = weight;
        this.price = price;
    }
    
    void printInfo(){
        System.out.println(weight + " grams of " + nameProduct +" costs " + price + " baht.");
    }
}
public class ProductShipping1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
        String name = scan.next();
        int weight = scan.nextInt();
        int price = scan.nextInt();
        Product p = new Product(name,weight,price);
        p.printInfo();
        }
    }
}