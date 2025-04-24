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
        for (int i = 1; i <= Q_price; i++) {
            int k = sc.nextInt(); // จำนวนที่ดิน
            int m = sc.nextInt(); // แปลงที่ดินตรงกลาง
            int left = m - ((k - 1) / 2);   //หาแปลงซ้าย
            int right = m + ((k - 1) / 2);  //หาแแปลงขวา
            System.out.println("left: " + left + " " + "Right: " + right);
            if(left >= 1 && right <= n){    //เช็คว่าทางซ้ายมากกว่า 1 มั้ย และทางขวา ต้องไม่เกินขนาดอาเรย์
                sum = 0;
                for (int j = left - 1; j < right; j++) {    //loop หาแปลงด้านซ้าย ด้านขวา
                    System.out.print("j: " + j + " ");
                    System.out.println("arr: " + arr[j]);
                     sum += arr[j]; //นำค่าที่อยู่ในอาเรย์แต่ละช่อง มัดรวมกัน
                }
                System.out.println("sum: " + sum);
               
            }else{  //ถ้าเกิน
                System.out.println("no");
            }
        }
        sc.close();
    }
}
