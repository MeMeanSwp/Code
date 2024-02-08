package Work.Class;
import java.util.Scanner;

class TaoKlingOrder {
    public int numMilk;
    public int numJuice;
    public int numMineralWater;
    public int total;
    public String phoneNo;
    public String code;
    public boolean completed;
    public String checkPhone;
    public String checkCode;
    
    TaoKlingOrder(String phoneNo, int numMilk, int numJuice, int numMineralWater, String code){
        this.phoneNo = phoneNo;
        this.numMilk = numMilk;
        this.numJuice = numJuice;
        this.numMineralWater = numMineralWater;
        this.code = code;
        //TotalPrice
        total += (numMilk * 10) + (numJuice * 20) + (numMineralWater * 15);
        //PhoneNo
        if (this.phoneNo.length() == 10 && this.phoneNo.charAt(0) == '0'){
            this.phoneNo = phoneNo;
        }
        else {
            System.out.println("invalid phone number");
            this.phoneNo = "0#########";
            boolean grabOrder = false;
        }
    }

    boolean grabOrder(String checkPhone, String checkCode){
        this.checkCode = checkCode;
        this.checkPhone = checkPhone;
        if (this.phoneNo.equals(this.checkPhone) && this.code.equals(this.checkCode)){
            return true;
        }
        return false;
    }   

    void printInfo(){
        System.out.print(phoneNo + " ");
        System.out.print(numMilk + " ");
        System.out.print(numJuice + " ");
        System.out.print(numMineralWater + " ");
        System.out.print(total + " ");
        if (grabOrder(checkPhone, checkCode)){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
    }
}

public class TaoKling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phoneNo = sc.next();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        String code = sc.next();
        TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1, n2, n3, code);
        String phone = sc.next();
        String code1 = sc.next();
        boolean flag = t.grabOrder(phone,code1);
        System.out.println(flag);
        t.printInfo();
    }
}
