package Compro.Class.LectureRoom;

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

public class LectureRoom2 {
    
}
