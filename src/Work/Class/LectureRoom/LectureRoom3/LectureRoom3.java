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

public class LectureRoom3 {
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
        int N = 3;
        for (int i = 0; i < N; i++) {
            int index = scan.nextInt() - 1;
            LectRoom lr = LectRoom[index];
            String line = String.format("%d %s %d", lr.classCode, lr.name, lr.capacity);
            System.out.println(line);
        }
    }
}
