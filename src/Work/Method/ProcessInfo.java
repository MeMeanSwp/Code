package Work.Method;
import java.util.Scanner;
public class ProcessInfo {
    static boolean listProcess(String Name[], int Mem[], int Ram){
        int Ram_used = 0;
        for (int i = 0; i < Name.length; i++){
            if (Mem[i] >= 10){
                System.out.println(Name[i] + "* " + Mem[i]);
            }
            else {
                System.out.println(Name[i] + " " + Mem[i]);
            }
            Ram_used += Mem[i];
        }
        System.out.println("RAM used = " + Ram_used + " out of " + Ram);
        boolean isvalid = (Ram_used <= Ram);
        return isvalid;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String Name[] = new String[N];
        int Mem[] = new int[N];
        for (int i = 0; i < N; i++){
            Name[i] = scan.next();
            Mem[i] = scan.nextInt(); 
        }
        int Ram = scan.nextInt();
        boolean isvalid = listProcess(Name, Mem, Ram);
        if (isvalid){
            System.out.println("Sufficient RAM");
        }
        else {
            System.out.println("Not enough RAM");
        }
    }
}
