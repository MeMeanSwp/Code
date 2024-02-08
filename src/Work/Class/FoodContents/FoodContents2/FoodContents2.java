package Work.Class.FoodContents.FoodContents2;
import java.util.Scanner;

class Food {
    //Declare
    private String foodname;
    private String content1, content2, content3;
    private int weight1, weight2, weight3;
    private int cal1, cal2, cal3;

    Food(String foodname, String content, int weight, int cal){
        this.foodname = foodname;
        this.content1 = content;
        this.weight1 = weight;
        this.cal1 = cal;
    }

    void addContent(String content, int weight, int cal){
        if (content2 == null || weight2 == 0){
            this.content2 = content;
            this.weight2 = weight;
            this.cal2 = cal;
        }
        else {
            this.content3 = content;
            this.weight3 = weight;
            this.cal3 = cal;
        }
    }

    void printInfo(){
        //Calculate Weight
        int total_weight = 0;
        total_weight = (weight1 + weight2 + weight3);
        //Calculate Cal
        int total_cal = 0;
        total_cal = (weight1 * cal1) + (weight2 * cal2) + (weight3 * cal3);
        //Content
        String content = content1;      
        if (this.content2 != null || this.weight2 != 0){
            content += " " + this.content2;
        }
        if (this.content3 != null || this.weight3 != 0){
            content += " " + this.content3;
        }
        System.out.println(this.foodname);
        System.out.println(total_weight + " " + total_cal);
        System.out.println(content);
    }

}
public class FoodContents2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodname = scan.next();
        String content = scan.next();
        int weight = scan.nextInt();
        int cal = scan.nextInt();
        
        Food Food = new Food(foodname, content, weight, cal);
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
                int new_cal = scan.nextInt();
                Food.addContent(new_content, new_weight, new_cal);
            }
            q = scan.nextInt();
        }
    }
}
