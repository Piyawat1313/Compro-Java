import java.util.Scanner;
class Bill{
    String PIN;
    String saleDate;
    int size;
    int price;
    double tex; // 3 % totalprice
    double fee;  // 5%
    double stam; //1%
    //ราคาประเมินรวม = ผลคูณของ size * price
    double total;
    Bill(String PIN, String saleDate, int size, int price){
        this.PIN = PIN;
        this.saleDate = saleDate;
        this.size = size;
        this.price = price;
        this.tex = (price * size) * 0.03;
        this.fee = (price * size) * 0.05;
        this.stam = (price * size) * 0.01;
        this.total = (tex + fee + stam);
    }
    void printInfo(){
        System.out.printf("%s %s %d %d \n", this.PIN, this.saleDate, this.size, this.price);
        System.out.printf("%.1f+%.1f+%.1f=%.1f\n", this.tex, this.fee, this.stam, this.total);
    }
}
public class LandFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Bill b[] = new Bill[N];
        for (int i = 0; i < N; i++) {
            String PIN = sc.next();
            String saleDate = sc.next();
            int size = sc.nextInt();
            int price = sc.nextInt();
            b[i] = new Bill(PIN, saleDate, size, price);
            b[i].printInfo();
        }
        sc.close();
    }
}
