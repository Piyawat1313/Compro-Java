import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] box_pass = new int[n];   //กล่องที่ใส่ของเข้า
        for(int i = 0; i < n; i++){
            box_pass[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int [] box_count = new int[k];      //  กล่องที่นับว่าใส่ไปกี่ชิ้น
        int Q;  //คือจำนวนที่ต้องการใส่หรือหยิบ
        int B;  //หมายเลขกล่องที่ต้องการใส่หรือหยิบของ
        int num;    //เป็น 1 คือใส่เป็น 2 คือหยิบ
        for(int i = 0; i < k; i++){
           num = sc.nextInt();
           Q = sc.nextInt();
           B = sc.nextInt();
           int index = B - 1;   //กำหนดการเข้าถึงให้อยู่ตำแหน่งที่ 0
           if(num == 1){    //ถ้าใส่ของ
                if(box_count[index] + Q <= box_pass[index]){    //กล่องปัจจุบัน บวกกับของที่ใส่ น้อยกว่า กล่องของเดิมมั้ย
                    box_count[index] += Q;  //กล่องใหม่บวกเพิ่มเข้าไป
                    System.out.println(box_count[index]);
                }else {     //ถ้าไม่สำเร็จปริ้น -1
                    System.out.println("-1");
                }
           }
           else if(num == 2){   //ถ้าหยิบออก
                if(box_count[index] >= Q){  //กล่องปัจจุบัน มากกว่าของที่หยิบไปมั้ย
                    box_count[index] -= Q;  //กล่องปัจจุบัน - ของที่หยิบออกไป
                     System.out.println(box_count[index]);
                }else {
                    System.out.println("-1");
                }
           }
        }
    }
}
