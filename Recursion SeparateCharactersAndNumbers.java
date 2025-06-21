package Recursion;
import java.util.Scanner;

public class SeparateCharactersAndNumbers {
    static String split(String msg) {
        if(msg.isEmpty()){        //break;
            return "";
        }
        char C = msg.charAt(0);    //เก็บตัวแรก
        String res = split(msg.substring(1));    //ไม่เอาตัวแรก
        if(Character.isDigit(C)){        //ถ้าเป็นตัวเลข
            return res + C;        //ข้อความ + ตัวเลข
        }
        else{
            return C + res;        //ตัวเลข + ข้อความ 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
        sc.close();
    }
}
