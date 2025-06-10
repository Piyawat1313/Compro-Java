package Compositionjava;
import java.util.Scanner;

class Visitation {
    int IDLocation;
    int date;
    int time = 0; // แทนว่าไปกี่นาฬิกา
    int[] lcx = new int[24];
    int count = 0;

    Visitation(int id, int date) {
        this.IDLocation = id;
        this.date = date;
    }

    void visit(int time) {
        if (time < 0 || time > 23) {
            System.out.println("invalid hour: " + time);
            return;
        }
        this.lcx[time]++;   //วิธีการอัปเดตค่าที่เก็บเข้ามาในช่องนั้น
        //System.out.println(this.lcx[time]);
    }

    int count() {
        this.count = 0;
        for (int i = 0; i < lcx.length; i++) {
            count += this.lcx[i];
        }
        return count;
    }

    void printVisitHours() {
        System.out.println(this.IDLocation);
        System.out.println(this.date);
        if (count() == 0) {
            System.out.println("no visit");
        }
        else{
            System.out.println(count());
        }
        for (int i = 0; i < lcx.length; i++) {
            if (this.lcx[i] > 0) {
               System.out.print(i + " ");
            }
        }
    }
}

public class Covid19Wins1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int date = sc.nextInt();
        final int K = sc.nextInt();
        Visitation V = new Visitation(id, date);
        for (int i = 0; i < K; i++) {
            int time = sc.nextInt();
            V.visit(time);
        }
        V.printVisitHours();
        sc.close();
    }
}
