package Recursion;

import java.util.Scanner;

public class PlusAndMinus {
    static int calculate(String text) {
        int plus = text.lastIndexOf("+");
        int minus = text.lastIndexOf("-");
        if(minus == -1 && plus == -1){      //break
           return Integer.parseInt(text.trim());
        }
        int operator = Math.max(plus, minus);       //หาตำแหน่งที่เจอ เอาตำแหน่งที่มีค่ามากสุด
        String front = text.substring(0, operator);     //เอาตัวหน้า
        String back = text.substring(operator + 1);     //เอาตัวหลัง
        int lastnumber = Integer.parseInt(back.trim());     //ตัวหลังแปลงเป็นเลข
        if(text.charAt(operator) == '+'){       //ถ้าในข้อความ มี +
            return calculate(front) + lastnumber;
        }
        else{
            return calculate(front) - lastnumber;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int res = calculate(input);
        System.out.println(res);
        sc.close();
    }
}
