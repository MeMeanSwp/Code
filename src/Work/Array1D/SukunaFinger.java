package Work.Array1D;
import java.util.Scanner;
public class SukunaFinger {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int right_finger = 0;
        int left_finger = 0;
        int sukuna_finger = 0;
        int jubutsu = 0;

        for (;;){
            
            int jujutsu = scan.nextInt();
            
            if (jujutsu <= 0){
                break;
            }   
            if (jujutsu <= 99 || jujutsu >= 1000){
                System.out.println("JUBUTSU !");
                jubutsu +=1;

            }
            else if (jujutsu >= 100 || jujutsu < 1000){
                
                int d1 = jujutsu / 100;
                int d2 = (jujutsu / 10) % 10;
                int d3 = jujutsu % 10;
                int finger = d1 + d2 + d3;
                
                if (finger % 2 == 0){
                    right_finger +=1;
                    sukuna_finger +=1;
                }
                else if (finger % 2 != 0){
                    left_finger +=1;
                    sukuna_finger +=1;
                }

            } 
        }
        System.out.println("Sukuna's right finger " + right_finger);
        System.out.println("Sukana's left finger " + left_finger);
        System.out.println("Sukuna's finger " + sukuna_finger);
        System.out.println("jubutsu " + jubutsu);
    }
        
}
