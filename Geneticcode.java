import java.util.Scanner;

public class Geneticcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ch = 0;
        for(int i = 0; i < str.length(); i++){
            str.charAt(i);
            if(str.charAt(i) == '<'){   //เจอไอ้เวรนี้มั้ย
                ch = 1; //เปลี่ยนสถานะ
                continue;    //ทำงานในส่วนถัดไป
            }
            if(str.charAt(i) == '>'){   //ถามจุดสิ้นสุด
               ch = 0;  //เปลี่ยนสถานะ
               System.out.println();    
            }
            if(ch == 1){    //สถานะเนี้ยเหมือนกับifไหน เอา if นั้นมาตอบ
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
