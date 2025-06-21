package Recursion;

import java.util.Scanner;

public class GoInside {
    String goInside(String str, boolean front) {
        if (str.length() <= 1) {
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        if(front){
            return first + "" + last + "" + goInside(str.substring(1, str.length() - 1), !front);
        }
        else{
            return last + "" + first + "" + goInside(str.substring(1, str.length() - 1), !front);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
        scan.close();
    }
}
