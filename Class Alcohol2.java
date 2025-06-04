import java.util.Scanner;

class Alcohol {
    int inten;
    int volume;
    int type;

    Alcohol(int inten, int volume, int type) {
        this.inten = inten;
        this.volume = volume;
        this.type = type;
    }

    void dilute(int intenWan, int wantVolume) {
        int vo = (intenWan * wantVolume) / inten;
        int water = 0;
        boolean check = true;
        if (intenWan >= inten) {
            System.out.println(intenWan + " more than " + inten);
            check = false;
        } else {
            water = (wantVolume - vo);
            System.out.println(vo + " " + water);
        }
        if(!check){

        }
        else if(volume + water >= wantVolume && check){
            System.out.println("OK");
        }
        else if(volume + water < wantVolume && check){
            System.out.println("NO");
        }

    }
}

public class Alcohol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inten = sc.nextInt();
        int volume = sc.nextInt();
        int type = sc.nextInt();
        Alcohol al = new Alcohol(inten, volume, type);
        int waninten = sc.nextInt();
        int wanVolume = sc.nextInt();
        al.dilute(waninten, wanVolume);
        sc.close();
    }
}
