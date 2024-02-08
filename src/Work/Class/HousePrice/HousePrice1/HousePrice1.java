package Work.Class.HousePrice.HousePrice1;

import java.util.Scanner;

class House {
    public int landSize;
    public int quality;
    public int floors;
    public int houseArea;
    public int price;
    
    House (int landsize, int quality, int floors, int houseArea){
        this.landSize = landsize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        computePrice(landsize, quality, floors, houseArea);
    }

    int computePrice(int landsize, int quality, int floors, int houseArea){
        price += (landsize*10000);
        price += (floors-1) * 200000;
        if (quality == 1){
            price += (houseArea*10000);
        }
        else if (quality == 2){
            price += (houseArea*8000);
        }
        else if (quality == 3){
            price += (houseArea*5000);
        }
        return price;
    } 
}

public class HousePrice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();
        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        System.out.println(house.price);
    }
}
