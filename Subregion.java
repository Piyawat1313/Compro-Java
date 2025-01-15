import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] Area = new int[r][c];
        int p = sc.nextInt();
        int Q = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        // p + H - 1 และ Q + W - 1 ใช้คำนวนตำแหน่งขอบล่างขวา
         if(p < 1 || Q < 1 || H < 1 || W < 0 || p + H - 1 > r || Q + W - 1 > c){   //ถ้าน้อย หรือเกินขอบเขตอาเรย์ล่างขวา 
            System.out.println("invalid input");
            sc.close();
            return;
        }
        for(int i = p - 1; i < p - 1 + H; i++){     //กำหนดให้ พื้นที่ย่อยเป็น 1
            for(int j = Q - 1; j < Q - 1 + W; j++){
                Area[i][j] = 1;
            }
        }
        for(int i = 0; i < r; i++){ //ปริ้นออกมาเลย
            for(int j = 0; j < c; j++){
                System.out.print(Area[i][j] + " ");
            }
            System.out.println();
        }
       
        sc.close();
    }
}
