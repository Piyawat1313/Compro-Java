import java.util.Scanner;

public class Upsequence2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.next();
            StringBuilder string  = new StringBuilder();
            for(int i = 0; i < text.length(); i++){
                if(string.length() == 0 || text.charAt(i) > text.charAt(i - 1)){    //เทียบ อักขระตัวแรกกับตัวสุดท้าย
                string.append(text.charAt(i));  //แอดค่าลงไป
                }
                else if( string.length() != 0 || text.charAt(i) <= text.charAt(i - 1)){ //ตัวสุดท้ายน้อยกว่าตัวแรก
                    System.out.println(string.toString());  //ปริ้น
                    string.setLength(0);    //เคลียค่า
                    string.append(text.charAt(i));  //แอดค่าใหม่ลงไป
                }
            }
                System.out.println(string.toString());
            
            sc.close();
        }
    }
