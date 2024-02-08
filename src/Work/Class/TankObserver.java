package Work.Class;
import java.util.Scanner;

class WaterTank {
    public int width;
    public int length;
    public int height;
    public int capacity;
    public int volume = 0;

    int fill (int width, int length, int height, int amout){
        this.width = width;
        this.length = length;
        this.height = height;
        capacity = (width * length * height);
        volume += amout;
        if (volume > capacity){
            System.out.println("Cannot fill the tank");
            volume -= amout;
            return -1;
        }
        else {
            return volume;
        }
    }
}

public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank();
        for(int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            System.out.println(tank.fill(width, length, height, amount));
        }
    }
}
