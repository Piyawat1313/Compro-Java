package Recursion;
import java.util.Scanner;

public class SeparateCharactersAndNumbers {
    static String split(String msg) {
        if(msg.isEmpty()){
            return "";
        }
        char C = msg.charAt(0);
        String res = split(msg.substring(1));
        if(Character.isDigit(C)){
            return res + C;
        }
        else{
            return C + res;
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
