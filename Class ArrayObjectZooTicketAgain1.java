import java.util.Scanner;

class ZooTicketA {
    boolean tikket;
    boolean useTiket;
    boolean check = true;
    ZooTicketA(boolean tikket) {
        this.tikket = tikket;
        this.useTiket = false;
    }

    boolean enterZoo(int tall){
        if(useTiket) return false;
        if(tikket){
            if(tall <= 120){
                this.useTiket = true;
                return true;
            }
        }
        else{
            useTiket = true;
            return true;
        }
        return false;
    }

}

public class ZooTicketAgain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        ZooTicketA zooTicketA[] = new ZooTicketA[n];
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                zooTicketA[i] = new ZooTicketA(false);
            } else {
                zooTicketA[i] = new ZooTicketA(true);
            }
        }
        final int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int id = sc.nextInt() - 1;
            int height = sc.nextInt();
            boolean enter = zooTicketA[id].enterZoo(height);
            System.out.println(enter);
        }
        sc.close();
    }
}
