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
            if(B > Q){ //หยิบสำเร็จ
                result = B - Q;
                System.out.println(result);
            }
        }
    }
}
