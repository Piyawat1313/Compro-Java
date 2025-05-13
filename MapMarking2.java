import java.util.Scanner;

public class MapMarking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int StartRow = sc.nextInt() - 1;
        int StartCol = sc.nextInt() - 1;
        boolean[][] Satochi = new boolean[r][c];

        Satochi[StartRow][StartCol] = true;
        int count = 1;
        int CommandBase = sc.nextInt();
        int max = 0;
        if (r >= max) {
            max = r;
        } else if (c >= max) {
            max = c;
        }
        for (int i = 0; i < CommandBase; i++) {
            int number = sc.nextInt();

            for (int j = 0; j < max; j++) {
                if (number == 1) {
                    StartRow = (StartRow + 0);    //left
                    StartCol = (StartCol - 1);
                }
                if (number == 2) {
                    StartRow = (StartRow + 0);  //right
                    StartCol = (StartCol + 1);
                }
                if (number == 3) {
                    StartRow = (StartRow - 1);    //Up
                    StartCol = (StartCol + 0);
                }
                if (number == 4) {
                    StartRow = (StartRow + 1);    //Down
                    StartCol = (StartCol + 0);
                }

                if (StartRow < 0) {     // เลยขอบ แถว แผนที่ด้านบน
                    StartRow = r - 1;     // ไปแถวล่างสุด
                } 
                else if (StartRow >= r) {   // เลยขอบ แถว พื้นที่ด้านล่าง
                    StartRow = 0;           // ไปแถวแรก
                }
                if (StartCol < 0) {       // เลยขอบหลักจนตกแผนที่
                    StartCol = c - 1;     // ให้กลับไปหลักขวาสุด
                } 
                else if (StartCol >= c) {     // เลยขอบหลักทางขวาจนเกินขอบเขต colume
                    StartCol = 0;             // ไป colume แรก
                }

                if (!Satochi[StartRow][StartCol]) {      //No Area
                    Satochi[StartRow][StartCol] = true;
                    count++;
                    break;
                }

            }
        }
        System.out.println((StartRow + 1) + " " + (StartCol + 1));    
        System.out.println(count);
        sc.close();
    }
}
