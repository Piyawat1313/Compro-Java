import java.util.Scanner;

public class MapMarking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int StartRow = sc.nextInt();
        int StartCol = sc.nextInt();
        int CommandBase = sc.nextInt();
        boolean Satochi[][] = new boolean[r + 1][c + 1];    //คอยเช็คว่าไปพื้นที่นั้นหรือยัง
        Satochi[StartRow][StartCol] = true;     //ไปพื้นที่นั้นมาแล้ว
        int count = 1;  //อัปเดตจำนวน
        int number = 0;
        int WR = 0;
        int WC = 0;
        for (int i = 1; i <= CommandBase; i++) {
            number = sc.nextInt();
             switch (number) {
                case 1:
                    WR = StartRow + 0;      //หาทางซ้าย
                    WC = StartCol - 1;
                    break;

                case 2:
                    WR = StartRow + 0;      //หาทางขวา
                    WC = StartCol + 1;
                    break;

                case 3:
                    WR = StartRow - 1;      //หาข้างบน
                    WC = StartCol + 0;
                    break;

                case 4:
                    WR = StartRow + 1;      //หาข้างล่าง
                    WC = StartCol + 0;
                    break;
            }
            if (WR >= 1 && WR <= r && WC >= 1 && WC <= c) {
                StartRow = WR;  //เก็บตำแหน่งแถว
                StartCol = WC;  //เก็บตำแหน่งหลัก
                if (!Satochi[StartRow][StartCol]) {     //ถ้ายังไม่เคยไปพื้นที่นั้น
                    Satochi[StartRow][StartCol] = true;     //อัปเดต
                    count++;
                }
            }
        }
        System.out.println((StartRow) + " " + (StartCol));
        System.out.println(count);
        sc.close();
    }
}
