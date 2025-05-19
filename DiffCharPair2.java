import java.util.Scanner;

public class DiffCharPair2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tex = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        for (int i = 0; i < tex.length() - 1;) { // “เช็คคู่ 2 ตัวติดกัน → ต้องหยุดก่อนตัวสุดท้าย 1 ตำแหน่ง”
            char a = tex.charAt(i);
            char b = tex.charAt(i + 1);
            char front = ' ';   //reset every round
            char back = ' ';
            if ((a == c1 && b == c2) || (a == c2 && b == c1)) { //เช็คแต่ละคู่ว่าตรงกับที่ต้องการมั้ย
                if (i - 1 >= 0) {   //วิธีเก็บตัวหลัง
                    front = tex.charAt(i - 1);
                }
                if (i + 2 < tex.length()) {     //เช็คตัวหน้าไม่ให้เกินขอบเขต
                    back = tex.charAt(i + 2);
                }
                if ((front != c1 && front != c2) && (back != c1 && back != c2)) {   //ทั้งตัวหน้าและตัวหลัง ต้องไม่ตรงกับตัวที่ต้องการ
                    System.out.print((i + 1) + " ");
                    i += 2;     //ข้ามคู่ที่แริ้นออกไป
                    continue;
                }
            }
            i++;    //ทำงานในส่วนคู่ถัดไป
        }
        sc.close();
    }
}
