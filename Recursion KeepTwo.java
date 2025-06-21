import java.util.Scanner;

public class KeepTwo {
    String keepTwo(String str) {
        int L = str.length();
        if(L <= 2){    //break
            return str;
        }
        String last = str.substring(L - 1);    //ข้อความหลัง
        String start = str.substring(0, L - 1);    //ข้อความหน้า
        int idx = start.indexOf(last);    //index หน้า
        int idx2 = start.lastIndexOf(last);    //index หลัง
        String ans = keepTwo(start);      //เก็บ method ที่ส่งค่า ข้อความข้างหน้าขึ้นไป
        if(idx == idx2){    //ถ้า index หน้าและหลัง ตรงกัน
            ans += last;    // method + ตัวหลัง
        }  
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}
/*
 * ABKGBAKFCABKKZG 
 * start = A
 * stop = G
 * keepTwo(ABKGBAKFCABKKZG)
 * 
 * start = B
 * stop = Z
 * keepTwo(BKGBAKFCABKKZ)
 * 
 * start = k
 * last = K
 * keepTwo(KGBAKFCABKK) 
 */
