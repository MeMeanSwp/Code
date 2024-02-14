package Compro.Archived.Midterm.OneMote;

import java.util.Scanner;

class Television {
    int channel;
    int volume;
    boolean status;
    Television(int chanel, int volume){
        this.channel = chanel;
        this.volume = volume;
        status = false;
    }
    boolean turnOn(){
        if (!status){
            status = true;
            return true;
        }
        return false;
    }
    boolean turnOff(){
        if (status){
            status = false;
            return true;
        }
        return false;
    }
    boolean channelUp(){
        if (status){
            if (channel + 1 > 50){
                return false;
            }
            else {
                channel +=1;
                return true;
            }
        }
        return false;
    }
    boolean channelDown(){
        if (status){
            if (channel - 1 < 1){
                return false;
            }
            else {
                channel -=1;
                return true;
            }
        }
        return false;
    }
    boolean volumeUp(){
        if (status){
            if (volume + 1 > 99){
                return false;
            }
            else {
                volume +=1;
                return true;
            }
        }
        return false;
    }
    boolean volumeDown(){
        if (status){
            if (volume - 1 < 0){
                return false;
            }
            else {
                volume -=1;
                return true;
            }
        }
        return false;
    }
}

public class OneMote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Television tv[] = new Television[N];
        int target = 1;
        for (int i = 0; i < N; i++){
            tv[i] = new Television(1, 0);
        }
        for (;;){
            String command = scan.next();
            if (command.equals("stop")){break;}
            else if (command.equals("turn_on")){
                if (tv[target-1].turnOn()){
                    System.out.println(target + " tv has been turned on");
                }
            }
            else if (command.equals("turn_off")){
                if (tv[target-1].turnOff()){
                    System.out.println(target + " tv has been turned off");
                }
            }
            else if (command.equals("channel_up")){
                if (tv[target-1].channelUp()){
                    System.out.println("the " + target + " tv channel is " + tv[target-1].channel);
                }
                else if (tv[target-1].status){
                    System.out.println("cannot change " + target + " tv channel");
                }
            }
            else if (command.equals("channel_down")){
                if (tv[target-1].channelDown()){
                    System.out.println("the " + target + " tv channel is " + tv[target-1].channel);
                }
                else if (tv[target-1].status){
                    System.out.println("cannot change " + target + " tv channel");
                }
            }
            else if (command.equals("volume_up")){
                if (tv[target-1].volumeUp()){
                    System.out.println("the " + target + " tv volume level is " + tv[target-1].volume);
                }
                else if (tv[target-1].status){
                    System.out.println("cannot change " + target + " tv volume");
                }
            }
            else if (command.equals("volume_down")){
                if (tv[target-1].volumeDown()){
                    System.out.println("the " + target + " tv volume level is " + tv[target-1].volume);
                }
                else if (tv[target-1].status){
                    System.out.println("cannot change " + target + " tv volume");
                }
            }
            else if (command.equals("change_target")){
                int num = scan.nextInt();
                if (num < 1 || num > N){
                    System.out.println("invalid position");
                }
                else {
                    System.out.println("target tv is " + num);
                    target = num;
                }
            }
            else if (command.equals("all_turn_on")){
                for (int i = 0; i < N; i++){
                    if (!tv[i].status){
                        System.out.println((i+1) + " tv has been turned on");
                        tv[i].status = true;
                    }
                }
            }
            else if (command.equals("all_turn_off")){
                for (int i = 0; i < N; i++){
                    if (tv[i].status){
                        System.out.println((i+1) + " tv has been turned off");
                        tv[i].status = false;
                    }
                }
            }
        }
    }
}
