import java.util.Scanner;

public class NumLayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        int NumLayer = Math.min(r / 2, c / 2);
        for (int i = 0; i < NumLayer; i++) {
            int val = 0;
            int under = i;
            int down = r - 1 - i;
            int left = i;
            int right = c - 1 - i;
            for (int j = left; j <= right; j++) { // แถวบน
                arr[under][j] = val;
                val = (val + 1) % 10; // วิธีกลับเลข
            }
            for (int j = under + 1; j <= down; j++) { // colume ขวา
                arr[j][right] = val;
                val = (val + 1) % 10;
            }
            for (int j = right - 1; j >= left; j--) { // คอลั่ม ซ้าย
                arr[down][j] = val;
                val = (val + 1) % 10;
            }
            if (left != right) {    //เช็คการประมวลผลซ้ำ
                for (int j = down - 1; j > under; j--) { // แถวล่าง
                    arr[j][left] = val;
                    val = (val + 1) % 10;
                }
            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
