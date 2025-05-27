package Compro.Class.Grader;

import java.util.Arrays;


class Grader {
    public String name;
    public String desc;
    public int pts[];
    public String sols[];

    public Grader(String name, String desc, int pts[], String sols[]) {
        this.name = name;
        this.desc = desc;
        this.pts = Arrays.copyOf(pts, 100);
        this.sols = Arrays.copyOf(sols, 100);
    }
}

public class Grader1NewArrayCopy {
    
}
