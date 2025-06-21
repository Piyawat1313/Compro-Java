import java.util.Scanner;

public class BackAndForth {
    String reorder(String s, boolean forward) {
        int L = s.length();
        if (L <= 1) {    //จุดสิ้นสุด
            return s;
        }
        if (forward) {    //ถ้าเป็น true
            char first = s.charAt(0);  //เก็บตัวแรก
            String right = s.substring(1);  เก็บทางขวาไม่เอาตัวแรก
            if (first == 'A') {    //ถ้าตัวแรก = A
                return first + reorder(right, !forward);    //ตัวแรก + ค่าที่ส่งขึ้นไปทำซ้ำ
            }
            return first + reorder(right, forward);    // return ออกมาทั้งหมด
        }
          // กรณีที่เป็น false
        char last = s.charAt(L-1);        //เก็บตัวสุดท้าย
        String left = s.substring(0, L-1);    //เอาทางขวาไม่เอาตัวสุดท้าย
        if (last == 'A') {      //ถ้า = A
            return last + reorder(left, !forward);    บวกตัวสุดท้าย ส่งค่า left ไปทำงานต่อ เปลี่ยนสถานะ Forword เป็น False
        }
        return last + reorder(left, forward);    // return ค่าข้างหลังออกไป
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reorder(s, true);
        System.out.print(answer);
    }
}
