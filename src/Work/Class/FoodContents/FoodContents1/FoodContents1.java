package Work.Class.FoodContents.FoodContents1;
import java.util.Scanner;

class Food {
    private String foodname;
    private String content1, content2, content3;
    private int weight1, weight2, weight3;

    Food(String foodname, String content, int weight){
        this.foodname = foodname;
        this.content1 = content;
        this.weight1 = weight;
    }

    void addContent(String content, int weight){
        if (content2 == null || weight2 == 0){
            this.content2 = content;
            this.weight2 = weight;
        }
        else {
            this.content3 = content;
            this.weight3 = weight;
        }
    }

    void printInfo(){
        int total_weight = 0;
        total_weight = (weight1 + weight2 + weight3);
        String content = content1;      
        if (this.content2 != null || this.weight2 != 0){
            content += " " + this.content2;
        }
        if (this.content3 != null || this.weight3 != 0){
            content += " " + this.content3;
        }
        System.out.println(this.foodname);
        System.out.println(total_weight);
        System.out.println(content);
    }

}
public class FoodContents1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodname = scan.next();
        String content = scan.next();
        int weight = scan.nextInt();
        
        Food Food = new Food(foodname, content, weight);
        int q = scan.nextInt();
        for (;;) {
            if (q == 0){
                break;
            }
            if (q == 1){
                Food.printInfo();
            }
            else if (q == 2){
                String new_content = scan.next();
                int new_weight = scan.nextInt();
                Food.addContent(new_content, new_weight);
            }
            q = scan.nextInt();
        }
    }
}
