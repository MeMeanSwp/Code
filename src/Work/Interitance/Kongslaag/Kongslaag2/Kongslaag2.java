package Compro.Interitance.Kongslaag.Kongslaag2;

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
    SlaagOffice(int singleLottery, int duoLottery[]){
        this.singleLottery = singleLottery;
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

class SlaagOffice2 extends SlaagOffice{
    int lucky[][];
    SlaagOffice2(int singleLottery, int duoLottery[], int lucky[][]){
        super(singleLottery, duoLottery);
        this.lucky = lucky;
    }
    void checkPrize(Lottery lottery){
        boolean check = false;
        for (int i = 0; i < lucky.length; i++){
            if (lucky[i][0] == lottery.correct[0] && lucky[i][1] == lottery.correct[1] && lucky[i][2] == lottery.correct[2] && lucky[i][3] == lottery.correct[3]){
                check = true;
            }
        }
        if (check){
            System.out.println("You got exact-match prize");
        }
        else {
            System.out.println("No exact-match prize");
        }
        super.checkPrize(lottery);
    }
}

public class Kongslaag2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = {scan.nextInt(), scan.nextInt()};
        final int R = scan.nextInt();
        int[][] exactPrizes = new int[R][];
        for(int i = 0; i < R; ++i) {
            int[] temp = {scan.nextInt(), scan.nextInt(),
            scan.nextInt(), scan.nextInt()};
            exactPrizes[i] = temp;
        }
        SlaagOffice2 office = new SlaagOffice2(a, b, exactPrizes);
        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int[] nums = {scan.nextInt(), scan.nextInt(),
            scan.nextInt(), scan.nextInt()};
            Lottery lotto = new Lottery(nums);
            office.checkPrize(lotto);
            lotto.reportPrize();
        }
    }
}