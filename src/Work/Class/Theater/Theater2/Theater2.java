package Work.Class.Theater.Theater2;
import java.util.Scanner;

class Theater {
 // You can enter your code here and only here.
    public boolean threeD;
    public boolean luxury;
    public int numSeats;
    public boolean seats[];
    public String title;
    public int basePrice;
    Theater(boolean threeD, boolean luxury1, int numSeats){
        this.threeD = threeD;
        this.luxury = luxury1;
        seats = new boolean[numSeats];
    }
    void setTitle(String title){
        if (title == null || title.length() == 0){
            System.out.println("invalid title");
        }
        else {
            this.title = title;
        }
    }
    void setBasePrice(int basePrice){
        if (basePrice <= 0){
            System.out.println("invalid price");
        }
        else {
           this.basePrice = basePrice; 
        }
    }
    int reserveOne(int seatNumber){
        if (seatNumber < 1 || seatNumber > seats.length || seats[seatNumber-1] == true){
            System.out.println("sorry");
            return -1;
        }
        else {
            seats[seatNumber-1] = true;
            return basePrice;
        }  
    }
    int reserveMultiple(int numSeats, int seatNumber){
        if (seatNumber < 1 || seatNumber > seats.length){
            System.out.println("sorry");
            return -1;
        }
        for (int i = seatNumber; i <= (numSeats + seatNumber-1); i++){
            if (i > seats.length || seats[i-1] == true){
                System.out.println("sorry");
                return -1;
            }
        }
        for (int i = seatNumber; i <= (numSeats + seatNumber-1); i++){
            seats[i-1] = true;
        }
        return (numSeats*basePrice);
    }
    void printInfo(){
        if (threeD){
            System.out.println("3D");
        }
        else {
            System.out.println("No 3D");
        }
        if (luxury){
            System.out.println("Luxury");
        }
        else {
            System.out.println("Standard");
        }

        System.out.println(seats.length);

        if (title != null){
            System.out.println(title);
        }
        else {
            System.out.println("title is not set");
        }
        if (basePrice > 0){
            System.out.println(basePrice);
        }
        else {
            System.out.println("price is not set");
        }
    }
}
// Do not modify the code below. You must leave it as is.
public class Theater2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if(threeD1 == 1)
            threeD = true;
        if(luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if(numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if(totalPrice > 0)
                System.out.println(totalPrice);
        }
        t.printInfo();
    }
}