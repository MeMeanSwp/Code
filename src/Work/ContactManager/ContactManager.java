package Compro.Archived.ContactManager;

import java.util.Scanner;

class ContactBook {
    String name[];
    String phone[];
    ContactBook(String name[], String phone[]){
        this.name = name;
        this.phone = phone;
    }
    void getAllContact(){
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i] + " " + phone[i]);
        }
    }
    void getContact(String checkName){
        boolean checkContact = false;
        for (int i = 0; i < name.length; i++){
            if (name[i].equals(checkName)){
                System.out.println(phone[i]);
                checkContact = true;
                break;
            }
        }
        if (!checkContact) {
            System.out.println("Invalid contact");
        }
    }
    static boolean onlyDigits(String number){
        for (int i = 0; i < number.length(); i++){
            Character first = number.charAt(i);
            if (!(first.equals('0') || first.equals('1') || first.equals('2') || first.equals('3') || first.equals('4') ||
            first.equals('5') || first.equals('6') || first.equals('7') || first.equals('8') || first.equals('9'))){
                return false;
            }
        }
        return true;
    }
    void editNumber(String newName, String newPhone){
        boolean checkEdit = false;
        for (int i = 0; i < name.length; i++){
            if (name[i].equals(newName) && newPhone.charAt(0) == '0' && (newPhone.length() == 9 || newPhone.length() == 10) && onlyDigits(newPhone)){
                name[i] = newName;
                phone[i] = newPhone;
                System.out.println(newName + " new number is " + newPhone);
                checkEdit = true;
                break;
            }
        }
        if (!checkEdit){
            System.out.println("Invalid number");
        }
    }
}

public class ContactManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String name[] = new String[N];
        String phone[] = new String[N];
        ContactBook cb[] = new ContactBook[N];
        for (int i = 0; i < N; i++){
            name[i] = scan.next();
            phone[i] = scan.next();
            cb[i] = new ContactBook(name, phone);
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; i++){
            int command = scan.nextInt();
            if (command == 1){
                String text = scan.next();
                cb[i].getContact(text);
            }
            else if (command == 2){
                String text = scan.next();
                String num = scan.next();
                cb[i].editNumber(text, num);
            }
            else if (command == 3){
                cb[i-2].getAllContact();
            }
            else {
                System.out.println("Invalid command");
            }
        } 
    }
}
