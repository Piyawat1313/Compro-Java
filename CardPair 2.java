
import java.util.Scanner;

public class Card {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = " ";
        String str2 = " ";
        char pick1 = ' ';
        char pick2 = ' ';
        String result = "";
        for (int i = 0; i < 5; i++) {
            str1 = sc.next();
            char ch1 = str1.charAt(0);
            char ch2 = str1.charAt(1);
            str2 = sc.next();
            char t1 = str2.charAt(0);
            char t2 = str2.charAt(1);
            if (ch1 == ch2 && t1 == t2) {
                if (ch1 < t1) {
                    result += 'W';
                } else if (ch1 > t1) {
                    result += 'L';
                } else {
                    result += 'D';
                }
            } else if (ch1 == ch2 && t1 != t2) {
                    result += 'W';
            }
            else if (ch1 != ch2 && t1 == t2) {
                result += 'L';
            } 
            else {
                if (ch1 < ch2) {
                    pick1 = ch1;
                } else if (ch1 > ch2) {
                    pick1 = ch2;
                }
                if (t1 < t2) {
                    pick2 = t1;
                } else {
                    pick2 = t2;
                }
                if (pick1 > pick2) {
                    result += 'L';
                } else if (pick1 < pick2) {
                    result += 'W';
                } else {
                    result += 'D';
                }
            }

        }
        System.out.print(result);
    }
}
