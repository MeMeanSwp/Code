package Compro.Archived.Midterm.Remote;

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

public class Remote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int channel = scan.nextInt();
        int volume = scan.nextInt();
        Television tv = new Television(channel, volume);
        for (;;){
            String command = scan.next();
            if (command.equals("stop")){break;}
            else if (command.equals("turn_on")){
                if (tv.turnOn()){
                    System.out.println("tv has been turned on");
                }
            }
            else if (command.equals("turn_off")){
                if (tv.turnOff()){
                    System.out.println("tv has been turned off");
                }
            }
            else if (command.equals("channel_up")){
                if (tv.channelUp()){
                    System.out.println("the channel is " + tv.channel);
                }
                else if (tv.status){
                    System.out.println("cannot change channel");
                }
            }
            else if (command.equals("channel_down")){
                if (tv.channelDown()){
                    System.out.println("the channel is " + tv.channel);
                }
                else if (tv.status){
                    System.out.println("cannot change channel");
                }
            }
            else if (command.equals("volume_up")){
                if (tv.volumeUp()){
                    System.out.println("the volume level is " + tv.volume);
                }
                else if (tv.status){
                    System.out.println("cannot change volume");
                }
            }
            else if (command.equals("volume_down")){
                if (tv.volumeDown()){
                    System.out.println("the volume level is " + tv.volume);
                }
                else if (tv.status){
                    System.out.println("cannot change volume");
                }
            }
        }
    }
}
