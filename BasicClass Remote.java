import java.util.Scanner;

class Television {
    public int numChanel;
    public int volume;
    public boolean isOn;

    Television(int numChanel, int volume) {
        this.numChanel = numChanel;
        this.volume = volume;
        this.isOn = false;
    }

    boolean turnOn() {
        if (!isOn) {
        this.isOn = true;
        return true;
        }
        return false;
    }

    boolean turnOff() {
        if (this.isOn) {
        this.isOn = false;
        return false;
        }
        return true;
    }

    boolean channelUp() {
        if (isOn) {
            if (this.numChanel + 1 >= 1 && this.numChanel + 1 <= 50) {
                this.numChanel += 1;
                return true;
            }
        }
        return false;
    }

    boolean channelDown() {
        if (isOn) {
            if (this.numChanel - 1 >= 1 && this.numChanel - 1 <= 50) {
                this.numChanel -= 1;
                return true;
            }
        }
        return false;
    }

    boolean volumeUp() {
        if (isOn) {
            if (this.volume + 1 >= 0 && this.volume + 1 <= 99) {
                this.volume += 1;
                return true;
            }
        }
        return false;
    }

    boolean volumeDown() {
        if (isOn) {
            if (volume - 1 >= 0) {
                this.volume -= 1;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

public class Remote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int vol = sc.nextInt();
        Television tv = new Television(ch, vol);
        while (true) {
            String command = sc.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("turn_on")) {
                boolean isOpen = tv.turnOn();
                    if (isOpen) {
                        System.out.println("tv has been turned on");
                    }
            }
            if (command.equals("turn_off")) {
                boolean isClose = tv.turnOff();
                    if (!isClose) {
                        System.out.println("tv has been turned off");
                    }
            }
            if (command.equals("channel_up")) {
                boolean isUp = tv.channelUp();
                if (tv.isOn) {
                    if (isUp) {
                        System.out.println("the channel is " + tv.numChanel);
                    } else {
                        System.out.println("cannot change channel");
                    }
                }
            }
            if (command.equals("channel_down")) {
                boolean isDown = tv.channelDown();
                if (tv.isOn) {
                    if (isDown) {
                        System.out.println("the channel is " + tv.numChanel);
                    } else {
                        System.out.println("cannot change channel");
                    }
                }
            }
            if (command.equals("volume_up")) {
                boolean upVol = tv.volumeUp();
                if (tv.isOn) {
                    if (upVol) {
                        System.out.println("the volume level is " + tv.volume);
                    } 
                    else {
                        System.out.println("cannot change volume");
                    }
                }
            }
            if (command.equals("volume_down")) {
                boolean down = tv.volumeDown();
                if (tv.isOn) {
                    if (down) {
                        System.out.println("the volume level is " + tv.volume);
                    } else {
                        System.out.println("cannot change volume");
                    }
                }
            }
        }
        sc.close();
    }
}
