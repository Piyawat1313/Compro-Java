
import java.util.Scanner;

public class BaseConverter {
    static String convertBase(int num, int b) {
        if (num == 0) {
            return "0";
        }

        int x = num / b;
        int y = num % b;
        String z = (x != 0) ? convertBase(x, b) : "";
        return z + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = sc.nextInt();
        int base = sc.nextInt();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
        sc.close();
    }
}
/***
 * convertBase(14, 2)
 * = convertBase(7, 2) + "0"
 * = convertBase(3, 2) + "1" + "0"
 * = convertBase(1 ,2) + "1" + "1" + "0"
 * = "1"               + "1" + "1" + "0"
 * = 1110
 */
