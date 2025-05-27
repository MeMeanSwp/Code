package Compro.Class.LectureRoom;

import java.util.Scanner;

class LectRoom {
    int classCode;
    String name;
    int capacity;
    int currentSeats = 0;

    LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int seat) {
        if(capacity < currentSeats + seat) {
            currentSeats += seat;
            return false;
        } else {
            return true;
        }
    }
}

public class LectureRoom4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        LectRoom[] LectRoom = new LectRoom[K];
        for (int i = 0; i < K; i++) {
            int classCode = scan.nextInt();
            String name = scan.next();
            int capacity = scan.nextInt();
            LectRoom[i] = new LectRoom(classCode, name, capacity);
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int classCode = scan.nextInt();
            int seat = scan.nextInt();
            boolean check = false;
            for (int j = 0; j < K; j++) {
                LectRoom lr = LectRoom[j];
                if (lr.classCode == classCode && lr.reserveSeats(seat) == true) {
                    System.out.println(lr.name);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("sorry");
            }
        }
    }
}
