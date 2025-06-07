import java.util.Scanner;

class Ethanol {
    int intense;
    int pack;
    int remaining;
    int want = 0;
    int index;
    Ethanol(int index, int intense, int pack, int remaining) {
        this.index = index;
        this.intense = intense;
        this.pack = pack; // ปริมาตร
        this.remaining = remaining; // คงเหลือ
    }
    void fill(int amount){
        int need = pack - remaining;  //ความต้องการ = ความจุ - คงเหลือ
        if(need <= amount){  //หาค่าที่น้อยที่สุด 
            want = need;
        }
        else{
            want = amount;
        }
    }
}

public class Ethanol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Ethanol ethanol[] = new Ethanol[N];
        for (int i = 0; i < N; i++) {
            int intense = sc.nextInt();
            int pack = sc.nextInt();
            int remaining = sc.nextInt();
            ethanol[i] = new Ethanol(i + 1, intense, pack, remaining);
        }
        int amount75 = sc.nextInt();
        int amount95 = sc.nextInt();
        for (int i = 0; i < ethanol.length; i++) {
            if(ethanol[i].intense == 75 && amount75 > 0){
                ethanol[i].fill(amount75);
                amount75 -= ethanol[i].want;
            }
            else if(ethanol[i].intense == 95 && amount95 > 0){
                ethanol[i].fill(amount95);
                amount95 -= ethanol[i].want;
            }
        }
        for (int i = 0; i < ethanol.length; i++) {
            if(ethanol[i].intense == 75){
                System.out.print(ethanol[i].index + ":" + ethanol[i].want + " ");
            }
            if(i == ethanol.length - 1){
                System.out.println();
            }
        }
        for (int i = 0; i < ethanol.length; i++) {
            if(ethanol[i].intense == 95){
                System.out.print(ethanol[i].index + ":" + ethanol[i].want + " ");
            }
        }
        sc.close();
    }
}
