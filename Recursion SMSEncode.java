package Recursion;

import java.util.Scanner;

public class SMSEncode {
    boolean flage = true;
    void suEncode(String sentence, char ch) {
        if (sentence.length() > 1) {  
            char first = sentence.charAt(0);
            char last = sentence.charAt(sentence.length() - 1);
            int number = 0;
            if(flage){    
                number = first - 'A' + 1;    //ทำให้เป็น 1 
                flage = false;
            }
            else{
                number = first - ch;
            }
            int number2 = last - first;
            System.out.println((number) + " " + number2);
            suEncode(sentence.substring(1, sentence.length() - 1), first);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char ch = code.charAt(0);
        SMSEncode sms = new SMSEncode();
        sms.suEncode(code, ch);
        sc.close();
    }
}
