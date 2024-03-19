package Compro.Interitance.Kongslaag.Kongslaag1;

import java.util.Scanner;

class Lottery {
    boolean oneFront, oneBack, twoFront, twoBack;
    int correct[] = new int[4];
    Lottery(int correct[]){
        this.correct = correct;
    }
    void reportPrize(){
        if (!oneFront && !oneBack && !twoFront && !twoBack){
            System.out.println("Sorry, no prize");
        }
        if (oneFront){
            System.out.println("You got one front prize");
        }
        if (oneBack){
            System.out.println("You got one back prize");
        }
        if (twoFront){
            System.out.println("You got two front prize");
        }
        if (twoBack){
            System.out.println("You got two back prize");
        }
    }
}

class SlaagOffice {
    int singleLottery;
    int duoLottery[] = new int[2];
    SlaagOffice(int numLottery, int duoLottery[]){
        this.singleLottery = numLottery;
        this.duoLottery = duoLottery;
    }
    void checkPrize(Lottery lottery){
        if (singleLottery == lottery.correct[0]){
            lottery.oneFront = true;
        }
        if (singleLottery == lottery.correct[3]){
            lottery.oneBack = true;
        }
        if (duoLottery[0] == lottery.correct[0] && duoLottery[1] == lottery.correct[1]){
            lottery.twoFront = true;
        }
        if (duoLottery[0] == lottery.correct[2] && duoLottery[1] == lottery.correct[3]){
            lottery.twoBack = true;
        }
    }
}

public class Kongslaag1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b[] = {scan.nextInt(), scan.nextInt()};
        SlaagOffice office = new SlaagOffice(a, b);
        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int[] nums = {scan.nextInt(), scan.nextInt(),scan.nextInt(), scan.nextInt()};
            Lottery lotto = new Lottery(nums);
            office.checkPrize(lotto);
            lotto.reportPrize();
        }
    }
}
