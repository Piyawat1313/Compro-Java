import java.util.Scanner;

public class UpLowCaseChar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String re = "";
        int b = 0;
        int S = 0;
        int sa = 0;
        for (int i = 0; i < s.length(); i++) {
            char idx = s.charAt(i);
            if(Character.isUpperCase(idx)){
                re += "1";
                b++;
            }
            if(Character.isLowerCase(idx)){
                re += "0";
                S++;
            }
            if(Character.isDigit(idx) || Character.isWhitespace(idx) || (idx >= 33 && idx <= 47) || (idx >= 58 && idx <= 64) || (idx >= 91 && idx <= 96) || (idx >= 123 && idx <= 126)){
                re += "2";
                sa++;
            }
        }
        System.out.println(re);
        System.out.println(S);
        System.out.println(b);
        System.out.println(sa);
        sc.close();
    }
}
