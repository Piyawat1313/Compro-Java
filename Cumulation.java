import java.util.Scanner;

public class Cumulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] drr = new int[N + 1];     //สร้างอาเรย์มา 2 ตัวเพื่อเอามาคำนวน
        int[]arr = new int[N];
        int K = sc.nextInt();
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < K; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            
            drr[x] += z;            //อาเรย์ปลอม จะเพิ่ม Z เข้าไป
            if(y + 1 < N){       //เช็คว่าถ้าอัปเดต y ไปทีละ 1 เกินขอบเขตมั้ย
                drr[y + 1] -= z;    //อาเรย์ปลอม จะลดค่า
            }
            for(int l = 1; l < N; l++){     //เริ่มต้น loop ที่ 1  
                arr[l] = arr[l - 1] + drr[l];   //อาเรย์จริงเก็บค่าของอาเรย์ปลอมโดยการ + อาเรย์ทั้งสองเข้าด้วยกัน
            }
            for(int j = 1; j < N; j++){         //loop ปริ้นผล
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
       sc.close();
    }
}
