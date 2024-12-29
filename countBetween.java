
import java.util.Scanner;

public class countbetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String round = sc.next();
        char ch = round.charAt(0);
        int countUper = 0;
        int countLower = 0;
        int countNotation = 0;
        for(int i = 0; i < round.length(); i++){
            ch = round.charAt(i);
            if(Character.isUpperCase(ch)){
                countUper++;
            }
            else if(Character.isLowerCase(ch)){
                countLower++;
            }
            else {
                countNotation++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUper);
        System.out.println(countNotation);
        sc.close();
    }
}
