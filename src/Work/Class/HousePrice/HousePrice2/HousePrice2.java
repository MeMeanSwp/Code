package Work.Class.HousePrice.HousePrice2;
import java.util.Scanner;

class House{
  int landSize,quality,floors,houseArea;
  public int price = 0;
  int computePrice(int landSize,int quality,int floors,int houseArea){
    int total =0;
    floors--;
    total += (landSize*10000)+(floors*200000);
    switch(quality){
      case 1:
        total += (houseArea*10000);
        break;
      case 2:
        total += (houseArea*8000);
        break;
      case 3:
        total += (houseArea*5000);
        break;
    }
    return total;
  }
  House(int landSize,int quality,int floors,int houseArea){
    this.landSize = landSize;
    this.quality = quality;
    this.floors = floors;
    this.houseArea = houseArea;
    this.price = computePrice(landSize,quality,floors,houseArea);
  }
}
public class HousePrice2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    House[] house = new House[n];
    for (int i=0;i<n;i++){
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();
      house[i] = new House(landSize,quality,floors,houseArea);
    }

    int max_price = scan.nextInt();
    int max_area = scan.nextInt();

    boolean trigger = false;
    for (int i=0;i<n;i++){
      if (house[i].price <= max_price && house[i].houseArea >= max_area){
          trigger = true;
          System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " + house[i].houseArea + " " + house[i].price);
      }
    }
    if(!trigger){
      System.out.println("none");
    }
  }
}