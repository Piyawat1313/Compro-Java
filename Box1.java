import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] box_pass = new int[n];   //กล่องที่ใส่ของเข้า
        for(int i = 0; i < n; i++){
            box_pass[i] = sc.nextInt();
        }
        int [] box_count = new int[n];  // กล่องที่นับว่าใส่ไปกี่ชิ้น
        int k = sc.nextInt();
        int Q;  //คือจำนวนที่ต้องการใส่หรือหยิบ
        int B;  //หมายเลขกล่องที่ต้องการใส่หรือหยิบของ
        int num;    //เป็น 1 คือใส่เป็น 2 คือหยิบ
        int result = 0;
        for(int i = 0; i < k; i++){
           num = sc.nextInt();
           Q = sc.nextInt();
           B = sc.nextInt();
           for(int j = 0; j < n; j++){
                if(B > Q && num == 1){ //เช็คว่าจะเอากล่องไหน และใส่เข้าไป
                    result =  Q + box_pass[j];
                    box_count[j] = result;  //เก็บสิ่งที่เหลือปัจจุบัน
                    result = 0;
                }
                else if(B < Q && num == 2){
                    result = Q - box_pass[j];
                    box_count[j] = result;
                    result = 0;
                    //System.out.println(result);
                }
                /*
                 * เช็คว่าถ้าใส่ไม่สำเร็จ พิมเลข -1
                 * ใส่สำเร็จ พิมจำนวนของที่อยู่ในกล่อง
                 */
           }
        }
        for(int i = 0; i < n; i++){
            System.out.println(box_count[i]);
        }
        sc.close();
    }
}
