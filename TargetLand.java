import java.util.Scanner;

public class TargetLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]Arr = new int[n];
        for(int i = 0; i < n; i++){ //loop ราคาของแต่ละพื้นที่
            Arr[i] = sc.nextInt();
        }
        int round_Price = sc.nextInt(); //จำนวนการสอบถามราคา
        for(int i = 1; i <= round_Price; i++){
            int want_k = sc.nextInt();  //พื้นที่ ที่ต้องการ
            int number_want = sc.nextInt(); //หมายเลขแปลงที่อยู่ตรงกลาง
            int half = want_k / 2;  //ตัวแปร half ช่วยในการหาค่าตรงกลาง
            int start = number_want - 1 - half; // จุดเริ่มต้น
            int stop = number_want - 1 + half;  //จุดสิ้นสุด
            if(start < 0 || stop >= n){ //เช็คว่า ช่วงเริ่มต้น กับ จุดสิ้นสุด น้อยกว่า 0 หรือ เกินขอบเขตหรือไม่
                System.out.println("no");
            } else {
                int total = 0; //ตัวแปรสำหรับ คำนวณผลรวม
                for(int j = start; j <= stop; j++){ //loop สำหรับคำนวนจำนวนพื้นที่
                    total += Arr[j];
                }
                System.out.println(total);
            }
        }
        sc.close();
    }
}
