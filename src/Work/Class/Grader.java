package Work.Class;

public class Grader {

    //Grader1ShallowCopy
    public String name;
    public String desc;
    public int pts[];
    public String sols[];

    public Grader(String name, String desc, int pts[], String sols[]){
        this.name = name;
        this.desc = desc;
        this.pts = pts;
        this.sols = sols;
    }
}