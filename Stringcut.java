import java.util.Scanner;

public class Stringcut{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String ch = sc.next();
        int index = text.indexOf(ch);
        boolean check = true;
        if(index == -1){  //ถ้าindexOf return ค่าเป็น -1 คือไม่เจอตัวที่ต้องการ
            System.out.println("no target character found");
            return;
        }
        int start = 0;  //จุดเริ่มต้น
        while(index != -1){  //ลูปที่indexOf ไม่คืนค่าเป็น -1 คือ เจอตัวที่ต้องการ
            String string = text.substring(start, index);  //ตัวแปร String เก็บ ตัวที่จะต้องการตัด
            if(string.length() > 0){  //ถ้ามากกว่า 0 
                System.out.println(string);  //ปริ้น
                check = false;  //เจอแล้ว
            }
            start = index + 1;  //ตำแหน่งถัดไป
            index = text.indexOf(ch, index + 1);  //indexOf เริ่มที่ตำปหน่งถัดไป
        }
        
        String string = text.substring(start, text.length());  //ตัวแปรนี่ เริ่มตั้งแต่ 0 จนถึงตัวสุดท้าย
        if(string.length() > 0){  //ถ้ามากกว่า 0 
            System.out.println(string);
        }
         if(check){  //ถ้าเป็นจริง
            System.out.println("no output");
        }
    }
}
