import java.util.Scanner;

class Carriage {
    int countSeatIn;
    int type; // 1 sleep 2 air 3 no Seat
    int code;
    int currenSeat;
    int stand;
    int countStand;
    int resevreStand;
    Carriage(int countSeat, int type, int code) {
        this.countSeatIn = countSeat;
        this.type = type;
        if (this.type == 3) {
            stand += 10;
        } else {
            this.stand = 0;
        }
        this.code = code;
        this.currenSeat = 0;
    }

    void reserveSeats(int countTicket) {
        int seat = this.countSeatIn - currenSeat;    //จำนวนที่นั่ง  = จำนวนทั้งหมด  - จำนวนที่จอง
        int stand1 = stand - resevreStand;      //จำนวนยืน = จำนวนที่ยืนทั้งหมด - จำนวนที่จองตั๋วยืน
        if (countTicket <= seat + stand1) {
            int resevre = Math.min(countTicket, seat);       //จองจนกว่าจะครบ
            currenSeat += resevre;
            int remind = (countTicket - resevre);   //จำนวนความต้องการยืน = ความต้องการ - ตั๋วนั่ง
            if (remind > 0 && type == 3) {      //ตั๋วยืนจะคิดแค่ชนิดที่ 3 เท่านั้น
                resevreStand += remind;
            }
        }
    }

    void printStats() {
        if (this.type == 3) {
            System.out.println(this.code + " " + this.type + " " + this.currenSeat + " " + this.countSeatIn + " " + this.resevreStand + " " + stand);
        }
        else {
            System.out.println(this.code + " " + this.type + " " + this.currenSeat + " " + this.countSeatIn);
        } 
    }
}

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        Carriage carriage[] = new Carriage[N];
        for (int i = 0; i < N; i++) {
            int type = sc.nextInt();
            int capa = sc.nextInt();
            int id = sc.nextInt();
            carriage[i] = new Carriage(capa, type, id);
        }
        final int K = sc.nextInt();
        for (int i = 0; i < K; i++) { 
            int p = sc.nextInt();
            int q = sc.nextInt();
            carriage[p - 1].reserveSeats(q);
        }
        for (int i = 0; i < carriage.length; i++) {
            carriage[i].printStats();
        }
        sc.close();
    }
}
