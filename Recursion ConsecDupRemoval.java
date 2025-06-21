import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        int L = str.length();
        if(L <= 1){    // break
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){    //ตัวแรกกับตัวถุดไปซ้ำกันมั้ย
            return dupRemove(str.substring(1));    // return String ไม่เอาตัว 2 
        }
        else{
            return str.charAt(0) + dupRemove(str.substring(1)) + "";  //ตัวแรก + ข้อความที่เหลือ
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}
/*
 * z y y z a a b a a a a b b b b z z z z 
 * 0 1 2 3 4 5 6 7 8 9 10 . . . . . .
 * z + dupRemove(str.substring(1))  +ตัวที่เหลือโดยไม่เอาตัวสอง
 * z + y + dupRemove(str.substring(1))
 * z + y + z dupRemove(str.substring(1))
 * z + y + z + a dupRemove(str.substring(1))
 * z + y + z + a + b dupRemove(str.substring(1))
 * 
 */
