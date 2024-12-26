
import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        StringBuilder result = new StringBuilder();
        char ch = text.charAt(0);   //ใช้ char มาเก็บindex ของอักขระก่อน
        result.append(ch);  //เอาค่าของ ชา เก็บเข้า บิลเดอ
        for(int i = 1; i < text.length(); i++){
            if(text.charAt(i) <= ch){
                System.out.println(ch);
            }
            ch = text.charAt(i);    
        }
        System.out.println(ch);
        sc.close();
    }
}
