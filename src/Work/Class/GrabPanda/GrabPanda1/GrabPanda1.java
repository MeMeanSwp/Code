package Work.Class.GrabPanda.GrabPanda1;
import java.util.Scanner;

class FoodOrder {
    public String name;
    public int foodPrice;
    public int foodTotal;
    void customer (String name){
        this.name = name;
    }

    void addFood(int foodPrice){
        this.foodPrice = foodPrice;
        this.foodTotal += foodPrice;
    }

    void finalizeReceipt(){
        //Name
        System.out.println(name);
        //Food Total
        System.out.println(foodTotal);
        //Shipping Cost
        if (foodTotal <= 50){
            System.out.println("20");
            foodTotal += 20;
        }
        else if (foodTotal <= 150){
            System.out.println("10");
            foodTotal += 10;
        }
        else {
            System.out.println("0");
        }
        //Total Price
        System.out.println(foodTotal);
    }
}

public class GrabPanda1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        FoodOrder order = new FoodOrder();
        order.customer(name);
        for (int i = 0; i < N; i++){
            int price = scan.nextInt();
            order.addFood(price);
        }
        order.finalizeReceipt();
    }
}
