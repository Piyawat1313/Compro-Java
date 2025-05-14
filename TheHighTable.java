import java.util.Scanner;

public class TheHighTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String keyword = ("a e i o u A E I O U");   //give vowel
            if(keyword.indexOf(ch) != -1){      //ถ้าสระตรงกับ CharAt
                if(i + 4 < s.length()){     //เช็คทีละ 4 ตัว โดยไม่เกินขอบเขต
                    if(s.substring(i + 1, i + 4).equals("THT")){        //เช็คทีละ 3 ตัว มีตัวไหนตรงกันมั้ย
                        result += ch;   //เพิ่ม
                        i += 4;     //อัปเดตค่า i
                        continue;       //ทำงานส่วนที่เหลือถัดไป
                    }
                }
            }
            result += ch;   //เพิ่มตัวสุดท้าย
        }
        System.out.println(result);

        sc.close();
    }
}
