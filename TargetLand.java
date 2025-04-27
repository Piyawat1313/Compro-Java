import java.util.Scanner;

public class TargetLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Q_price = sc.nextInt();
        int sum = 0;
        int sum_more = 0;
        boolean ch = true;
        for (int i = 1; i <= Q_price; i++) {
            int m = sc.nextInt(); // แปลงที่ดินตรงกลาง
            int k = sc.nextInt(); // จำนวนที่ดิน
            int half = ((m - 1) / 2);
            int left = k - half;; // หาแปลงซ้าย
            int right = k + half; // หาแแปลงขวา
            System.out.println("left: " + left + " " + "Right: " + right);
            if (left >= 1 && right <= n) { // เช็คว่าทางซ้ายมากกว่า 1 มั้ย และทางขวา ต้องไม่เกินขนาดอาเรย์
                ch = true;
                sum = 0;
                for (int j = left - 1; j < right; j++) { // loop หาแปลงด้านซ้าย ด้านขวา
                    System.out.print("j: " + j + " ");
                    System.out.println("arr: " + arr[j]);
                    sum += arr[j]; // นำค่าที่อยู่ในอาเรย์แต่ละช่อง มัดรวมกัน
                }
                //System.out.println("sum: " + sum);
            }else{
                int start = Math.max(1, left);
                int stop = Math.min(n, right);
                System.out.println("Star: " + start + " Stop: " + stop);
                sum_more = 0;
                for (int j = start; j <= stop; j++) {
                    sum_more += arr[j - 1];
                    System.out.println("J: " + j + " ARR: " + arr[j - 1] + " ");
                }
                ch = false;
            }
            if(!ch){
               // System.out.println("no " + sum_more);
            }
            else{
                //System.out.println(sum);
            }
        }
        sc.close();
    }
}
