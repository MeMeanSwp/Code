package Work.Class;
import java.util.Scanner;

class ContactBook {
    public String name[];
    public String phoneNo[];

    ContactBook(String name[], String phone[]){
        this.name = name;
        this.phoneNo = phone;
    }
    void checkName(String nameCheck){
        boolean check = true;
        for (int i = 0; i < name.length; i++){
            if (name[i].equals(nameCheck)){
                System.out.println(phoneNo[i]);
                check = false;
            }
        }
        if (check){
            System.out.println("invalid Contact");
        }
    }
    void allContact(){
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i] + " " + phoneNo[i]);
        }
    }
    static boolean isDigits(String newPhone){
        for (int i = 0; i < newPhone.length(); i++){
            Character n = newPhone.charAt(i);
            if (n.equals('0') || n.equals('1') || n.equals('2') || n.equals('3') || n.equals('4') || n.equals('5') || 
                n.equals('6') || n.equals('7') || n.equals('8') || n.equals('9')){
                return true;
            }
        }
        return false;
    }
    void editNumber(String nameCheck, String newPhone){
        boolean editcheck = true;
        for (int i = 0; i < name.length; i++){
            if (name[i].equals(nameCheck)){
                if (isDigits(newPhone)){
                    if (newPhone.length() == 9 || newPhone.length() == 10){
                        if (newPhone.charAt(0) == '0'){
                            phoneNo[i] = newPhone;
                            editcheck = false;
                        }
                        else {
                            System.out.println("invalid contact");
                        }
                    }
                    else {
                        System.out.println("invalid contact");
                    }
                }
                else {
                    System.out.println("invalid contact");
                }
            }
            else {
                System.out.println("invalid contact");
            }
        }
    }
}

public class ContactManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String name[] = new String[N];
        String phoneNo[] = new String[N];
        for (int i = 0; i < N; i++){
            name[i] = scan.next();
            phoneNo[i] = scan.next();
        }
        ContactBook cb = new ContactBook(name, phoneNo);
        int K = scan.nextInt();
        for (int i = 0; i < K; i++){
            int num = scan.nextInt();
            if (num == 1){
                String nameCheck = scan.next();
                cb.checkName(nameCheck);
            }
            else if (num == 2){
                String nameCheck = scan.next();
                String newPhone = scan.next();
                cb.editNumber(nameCheck, newPhone);
            }
            else if (num == 3){
                cb.allContact();
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
}
